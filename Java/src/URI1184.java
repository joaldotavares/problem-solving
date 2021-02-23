import java.util.Scanner;

public class URI1184 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		double s = 0;
		char O = scan.next().toUpperCase().charAt(0);
		
		double [][] matriz = new double[12][12];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextDouble();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j < i) {
					s += matriz[i][j];
				}
			}
		}
		
		if(O == 'M') {
			s /= ((matriz.length * matriz.length) - 12) / 2;
		}
		System.out.println(String.format("%.1f", s));
		scan.close();
	}

}