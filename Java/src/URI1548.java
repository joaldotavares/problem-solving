import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI1548 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> listaAux = new ArrayList<Integer>();
		int m, n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			int aux = 0;
			m = scan.nextInt();
			for (int j = 0; j < m; j++) {
				lista.add(scan.nextInt());
				listaAux.add(lista.get(j));
			}
			Collections.sort(lista);
			Collections.reverse(lista);
			
			for (int j = 0; j < lista.size(); j++) {
				if(lista.get(j) != listaAux.get(j)) {
					aux++;
				}
			}
			System.out.println(m - aux);
			lista.clear();
			listaAux.clear();
		}
		scan.close();
	}
}