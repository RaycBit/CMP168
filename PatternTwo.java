import java.util.Scanner;

public class PatternTwo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number 1...9 : ");
		int n = input.nextInt();
		while ((n > 0) && (n < 10)) {
			for (int q = 1; q <= n; q++) {
				for (int p = 1; p <= n - q; p++) {
					System.out.print("  ");
				}
				for (int s = q; s >= 1; s--) {
					System.out.print(" " + s);
				}
				System.out.println();
			}
			break;
		}
	}
}