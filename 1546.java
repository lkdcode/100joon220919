import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double arr[] = new double[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextDouble();
		}

		Arrays.sort(arr);
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += (arr[i] / arr[arr.length - 1] * 100);
		}

		System.out.println(answer / arr.length);
	}
}
