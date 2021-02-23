import java.util.Scanner;

public class URI1963 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a, b;

		a = scan.nextFloat();
		b = scan.nextFloat();

		String fs = String.format("%.02f", (b - a) / a * 100);

		System.out.println(fs + "%");

		scan.close();
	}
}