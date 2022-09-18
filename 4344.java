import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int C = scan.nextInt();

		for (int i = 0; i < C; i++) {
			int student = scan.nextInt();
			int[] arr = new int[student];
			double total = 0;
			for (int j = 0; j < student; j++) {
				arr[j] = scan.nextInt();
			}
			for (int k = 0; k < arr.length; k++) {
				total += arr[k];
			}

			double avrg = total / arr.length;
			double up = 0;
			for (int l = 0; l < arr.length; l++) {
				if (arr[l] > avrg) {
					up += 1.0;
				}
			}
			double answer = (double) up / (double) student * 100.0;
			System.out.format("%.3f%%\n", answer);
		}

	}
}
