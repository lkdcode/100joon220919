import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int d = a;
		int answer = 0;

		while (true) {
			int b = (d % 10) + (d / 10);
			int c = (d % 10) * 10;
			d = (b%10) + c;
			answer++;
			if (a == d) {
				break;
			}
		}
		System.out.println(answer);
	}
}
