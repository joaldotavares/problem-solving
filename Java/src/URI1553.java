
import java.io.IOException;
import java.util.Scanner;

public class URI1553 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n, k, aux;

		while (true) {
			n = scan.nextInt();
			k = scan.nextInt();

			if (n == 0 && k == 0) {
				break;
			}
			aux = 0;
			int[] vetor = new int[1001];
			while (n-- > 0) {
				vetor[scan.nextInt()]++;
			}
			for (int v : vetor) {
				if (v >= k) {
					aux++;
				}
			}
			System.out.println(aux);
		}
		scan.close();
	}

}
