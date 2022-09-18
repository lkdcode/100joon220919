import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] n = new int[scan.nextInt()];
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}

		int max = n[0];
		int min = n[0];

		for (int i = 0; i < n.length; i++) {
			max = Math.max(n[i], max);
			min = Math.min(n[i], min);
		}

		System.out.println(min+" "+max);
	}
}
