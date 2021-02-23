import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double m = scan.nextDouble(), n = scan.nextDouble(), p = scan.nextDouble();
		double media = (m * 2 + n * 3 + p * 5) / 10.0;
		System.out.printf("MEDIA = %.1f%n", media);

		scan.close();
	}

}