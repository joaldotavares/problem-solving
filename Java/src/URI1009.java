import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salario, venda;
		salario = scan.nextDouble();
		venda = scan.nextDouble();

		double total = salario + (venda * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", total);

		scan.close();
	}

}