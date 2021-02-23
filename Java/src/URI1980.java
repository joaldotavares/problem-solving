import java.util.Scanner;

public class URI1980 {

	public static long factorial(long size) {
		long r = 1;
		for (long i = 1; i <= size; i++) {
			r *= i;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		long x;

		while (scan.hasNext()) {
			s = scan.nextLine();
			if (s.equals("0"))
				break;
			x = s.length();
			System.out.println(factorial(x));
		}
		scan.close();
	}
}
