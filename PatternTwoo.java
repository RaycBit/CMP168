import java.util.Scanner;

public class PatternTwoo {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number 1...9 : ");
		int r = input.nextInt();

		while ((r > 0) && (r < 10)) {
			for (int p = 1; p <= r; p++) {

				for (int l = 1; l <= r - p; l++) {
					System.out.print("  ");
				}
				for (int s = p; s >= 1; s--) {
					System.out.print(" " + s);
				}
				System.out.println();
			}
			break;
		}
	}
}
