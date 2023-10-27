import java.util.Scanner;

public class Grades {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int gradeA = 0,gradeAMinus = 0, gradeBPlus = 0, gradeB = 0, gradeBMinus = 0, gradeCPlus = 0, gradeC = 0, gradeCMinus = 0,
				gradeD = 0, gradeF = 0, count = 0;

		System.out.println("Enter a grade:");
		int num = input.nextInt();

		while (num > 0) {
			if(num >= 93 && num < 100) {
				gradeA++;
			}
			else if (num >= 90 && num < 93) {
				gradeAMinus++;
			} else if (num >= 87 && num < 90) {
				gradeBPlus++;
			} else if (num >= 83 && num < 87) {
				gradeB++;
			} else if (num >= 80 && num < 83) {
				gradeBMinus++;
			} else if (num >= 77 && num < 80) {
				gradeCPlus++;
			} else if (num >= 73 && num < 77) {
				gradeC++;
			} else if (num >= 70 && num < 73) {
				gradeCMinus++;
			} else if (num >= 60 && num < 70) {
				gradeD++;
			} else {
				gradeF++;
			}
			count++;
			System.out.println("Enter a grade:");
			num = input.nextInt();
		}
		System.out.println("Total number of grades = " + count);
		System.out.println("Number of A's =" + gradeA);
		System.out.println("Number of A-'s =" + gradeAMinus);
		System.out.println("Number of B+'s =" + gradeBPlus);
		System.out.println("Number of B's =" + gradeB);
		System.out.println("Number of B-'s =" + gradeBMinus);
		System.out.println("Number of C+'s =" + gradeCPlus);
		System.out.println("Number of C's =" + gradeC);
		System.out.println("Number of C-'s =" + gradeCMinus);
		System.out.println("Number of D's =" + gradeD);
		System.out.println("Number of F's =" + gradeF);

	}
}
