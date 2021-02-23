import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Scanner;

public class URI1581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, n = scan.nextInt();
		SortedSet<String> list = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			m = scan.nextInt();
			for (int j = 0; j < m; j++) {
				list.add(scan.next());
			}
			if (list.size() > 1) {
				System.out.println("ingles");
			} else {
				System.out.println(list.last());
			}
			list.clear();
		}

		scan.close();
	}

}