package java1012;

import java.util.Scanner;

public class Ex04_UpAndDownAn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0, count = 0;
		final int answer = (int) (Math.random() * 100) + 1;
		System.out.println("Up&Down");
		boolean run = true;
		do {
			System.out.print("1���� 100������ ���ڸ� �Է��ϼ��� : ");
			input = scan.nextInt();
			count++;
			if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���");

			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				run = false;
			}
		} while (run);
	}
}