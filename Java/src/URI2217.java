import java.util.Scanner;

public class URI2217 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, c;
		
		c = scan.nextInt();
		
		for (int i = 0; i < c; i++) {
			n = scan.nextInt();
			if(n % 2 == 0) {
				System.out.println("1");
			}else {
				System.out.println("9");
			}
		}
		
		scan.close();
	}

}