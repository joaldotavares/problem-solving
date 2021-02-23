import java.util.Scanner;

public class URI3049 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b = scan.nextInt(), t = scan.nextInt();
		int trap = 0;
		if(b == t) {
			trap = b * 70; 
		}else {
			trap = ((b + t) / 2) * 70;
		}
		if(trap == 5600) {
			System.out.println(0);
		}else if(trap > 5600) {
			System.out.println(1);
		}else if(trap < 5600) {
			System.out.println(2);
		}
		
		scan.close();
	}

}