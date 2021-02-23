import java.util.Scanner;
import java.util.Arrays;

public class URI2381 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		String[] alunos = new String[n];

		for (int i = 0; i < n; i++) {
			alunos[i] = scan.next();
		}

		Arrays.sort(alunos);
		System.out.println(alunos[m - 1]);

		scan.close();
	}
}