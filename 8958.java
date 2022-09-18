import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int answer = 0;
			int num = 1;
			String ox = scan.next();
			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) == 'O') {
					answer += num;
					num++;
				} else if (ox.charAt(j) == 'X') {
					num = 1;
					continue;
				}
			}
			System.out.println(answer);
		}
	}
}
