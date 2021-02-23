import java.util.Scanner;

public class URI1010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        double C = scan.nextDouble();
        int D = scan.nextInt();
        int E = scan.nextInt();
        double F = scan.nextDouble();
        double resultado = (B*C)+(E*F);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);
        
       scan.close();
	}

}