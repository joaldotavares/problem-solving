import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI2479 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		int pos = 0, neg = 0;
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String sinal = scan.next(), nome = scan.next();
			lista.add(nome);
			if (sinal.equals("+")) {
				pos++;
			} else {
				neg++;
			}
		}

		Collections.sort(lista);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("Se comportaram: " + pos + " | Nao se comportaram: " + neg);
		scan.close();
	}

}