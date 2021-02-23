public class URI1095 {

	public static void main(String[] args) {
		int a = 60;
		for (int i = 1; a >= 0; i += 3) {
			System.out.print("I=" + i + " ");
			System.out.println("J=" + a);
			a -= 5;
		}
	}

}