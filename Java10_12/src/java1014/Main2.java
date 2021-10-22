package java1014;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = 0, M = 0;
		H = scan.nextInt();
		M = scan.nextInt();
		if (M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else if (H >= 1 && M < 45) {
			System.out.println((H - 1) + " " + (M + 15));
		} else if (H < 1 && M < 45) {
			System.out.println((H + 23) + " " + (M + 15));

		}

	}

}
