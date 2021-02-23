import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class URI2235 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> lista = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);

		for (int i = 0; i < 3; i++) {
			lista.add(scan.nextInt());
		}
		if ((year + lista.get(0) + lista.get(1)) - lista.get(2) == year
				|| (year + lista.get(1) + lista.get(2)) - lista.get(0) == year
				|| (year + lista.get(0) + lista.get(2)) - lista.get(1) == year
				|| (year + lista.get(0)) - lista.get(1) == year || (year + lista.get(0)) - lista.get(2) == year
				|| (year + lista.get(2)) - lista.get(1) == year) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		scan.close();
	}

}