import java.util.Scanner;

public class URI1873 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a, b;

		for (int i = 0; i < n; i++) {
			a = scan.next();
			b = scan.next();

			if (a.equals(b)) {
				System.out.println("empate");
			} else if (a.equals("tesoura") && b.equals("papel")) {
				System.out.println("rajesh");
			} else if (a.equals("papel") && b.equals("pedra")) {
				System.out.println("rajesh");
			} else if (a.equals("pedra") && b.equals("lagarto")) {
				System.out.println("rajesh");
			} else if (a.equals("lagarto") && b.equals("spock")) {
				System.out.println("rajesh");
			} else if (a.equals("spock") && b.equals("tesoura")) {
				System.out.println("rajesh");
			} else if (a.equals("tesoura") && b.equals("lagarto")) {
				System.out.println("rajesh");
			} else if (a.equals("lagarto") && b.equals("papel")) {
				System.out.println("rajesh");
			} else if (a.equals("papel") && b.equals("spock")) {
				System.out.println("rajesh");
			} else if (a.equals("spock") && b.equals("pedra")) {
				System.out.println("rajesh");
			} else if (a.equals("pedra") && b.equals("tesoura")) {
				System.out.println("rajesh");
			} else {
				System.out.println("sheldon");
			}
		}
		scan.close();
	}

}