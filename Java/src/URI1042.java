import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vet = new int[3];
		int[] vet2 = new int[3];

		for (int i = 0; i < 3; i++) {
			vet[i] = scan.nextInt();
			vet2[i] = vet[i];
		}
		
		Arrays.sort(vet);

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println(vet2[i]);
		}
		
		scan.close();
	}

}