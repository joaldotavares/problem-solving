import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI1259 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> listaPar = new ArrayList<Integer>();
		List<Integer> listaImpar = new ArrayList<Integer>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int aux = scan.nextInt();
			if (aux % 2 == 0) {
				listaPar.add(aux);
			} else {
				listaImpar.add(aux);
			}
		}
		Collections.sort(listaPar);
		Collections.sort(listaImpar);
		Collections.reverse(listaImpar);

		for (int i = 0; i < listaPar.size(); i++) {
			System.out.println(listaPar.get(i));
		}

		for (int i = 0; i < listaImpar.size(); i++) {
			System.out.println(listaImpar.get(i));
		}
		scan.close();
	}

}