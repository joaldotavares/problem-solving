import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		long i = 2;
		boolean primo = true;
		while (i <= Math.sqrt(n)) {
			primo &= (n % i != 0);
			i++;
		}

		if (primo == true) {
			System.out.println("N");
		} else {
			System.out.println("S");
		}

		scan.close();
	}
}