import java.text.DecimalFormat;
import java.util.Scanner;

public class URI2234 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");

		double h = scan.nextInt(), p = scan.nextInt();

		double med = h / p;

		System.out.println(fmt.format(med));
		scan.close();
	}

}