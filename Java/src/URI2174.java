import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class URI2174 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<String> list = new HashSet<String>();
		
		for(int i = 0; i < n; i++){
		    list.add(scan.next());
		}
		
		System.out.println("Falta(m) " + (151 - list.size()) + " pomekon(s).");
		scan.close();
	}
}