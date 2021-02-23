import java.util.Scanner;

public class URI1940 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux = 0, n = scan.nextInt(), j = scan.nextInt();

		int[] vet = new int[n];
		int i = 0;
		while (i < j) {
			for (int k = 0; k < n; k++) {
				aux = scan.nextInt();
				vet[k] += aux;
			}
			i++;
		}
		int z = 1;
		for (int k = 0; k < vet.length; k++) {
			if (vet[k] >= z) {
				aux = k + 1;
				z = vet[k];
			}
		}

		System.out.println(aux);
		scan.close();
	}

}
