import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		while (A != 0 && B != 0) {
			System.out.println(A + B);
			A = scan.nextInt();
			B = scan.nextInt();
			if (A == 0 && B == 0) {
				break;
			}
		}

	}
}