import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI2136 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		List<String> listaNo = new ArrayList<String>();
		String amigo = " ";
		boolean f = true;
		while (f) {
			String nome = scan.next(), sinal = "";
			if (nome.equals("FIM")) {
				f = false;
			} else {
				sinal = scan.next();
				if (sinal.equals("YES") && !lista.contains(nome)) {
					lista.add(nome);
				}
				if (amigo.length() < nome.length() && sinal.equals("YES")) {
					amigo = nome;
				}
				if (sinal.equals("NO") && !listaNo.contains(nome)) {
					listaNo.add(nome);
				}
			}
		}

		Collections.sort(lista);
		Collections.sort(listaNo);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		for (int i = 0; i < listaNo.size(); i++) {
			System.out.println(listaNo.get(i));
		}
		System.out.println();
		System.out.println("Amigo do Habay:");
		System.out.println(amigo);
		
		scan.close();
	}

}