import java.util.Scanner;

public class URI1004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();

		System.out.println("PROD = " + n * m);

		scan.close();
	}
}