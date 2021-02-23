import java.util.Scanner;

public class URI1871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, m;
		String resultado;
		while(true){
			n = scan.nextInt();
			m = scan.nextInt();
			if(n == 0 && m == 0) {
				break;				
			} 
			
			resultado = Integer.toString(n + m);
			
			resultado = resultado.replace("0", "");
			System.out.println(resultado);
		}
		scan.close();
	}

}