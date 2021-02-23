import java.util.Scanner;

public class URI1933 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(), b = scan.nextInt();

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		scan.close();
	}

}
