package java10_13;

import java.util.Scanner;

public class Ex05Array {

	public static void main(String[] args) {

		/*
		 * � �迭�� ���� �� � ���ڰ� ��� �ε����� �ִ��� ��� 8�� �Է��ϸ� 8�� 4�� �ε����� �ֽ��ϴ�.
		 */

		int input = 0;
		Scanner scan = new Scanner(System.in);
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		System.out.print("���� �Է��ϼ��� : ");
		input = scan.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (input == num[i]) {
				System.out.println(input + "�� " + i + "�� �ε����� �ֽ��ϴ�.");
			}

		} 
	}
}
