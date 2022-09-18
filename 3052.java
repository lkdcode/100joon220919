import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arr.add((scan.nextInt() % 42));
		}

		Collections.sort(arr);

		int answer = 1;

		for (int i = 0; i < 9; i++) {
			if (arr.get(i) == arr.get(i + 1)) {
				continue;
			}
			answer++;
		}
		System.out.println(answer);

	}
}
