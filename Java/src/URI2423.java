import java.util.Scanner;

public class URI2423 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int aux = 0, a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		boolean veri = true;
		while (veri) {
			if (a >= 2 && b >= 3 && c >= 5) {
				aux++;
				a -= 2;
				b -= 3;
				c -= 5;
			} else {
				veri = false;
			}
		}
		System.out.println(aux);

		scan.close();
	}

}