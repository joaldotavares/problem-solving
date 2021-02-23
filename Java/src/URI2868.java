import java.util.Scanner;

public class URI2868 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int aux = 0;
			String r = "E";
			int n1 = scan.nextInt();
			char sinal = scan.next().charAt(0);
			int n2 = scan.nextInt();
			int resultado = scan.nextInt();

			if (sinal == '+') {
				aux = Math.abs(resultado - (n1 + n2));
			} else if (sinal == '-') {
				aux = Math.abs(resultado - (n1 - n2));
			} else {
				aux = Math.abs(resultado - (n1 * n2));
			}
			for (int j = 0; j < aux; j++) {
				r += "r";
			}
			r += "ou!";
			System.out.println(r);
		}
		scan.close();
	}

}