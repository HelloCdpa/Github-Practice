package java1012;

import java.util.Scanner;

public class Ex04_UpAndDown {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input = 0, count = 0, answer = 0;
		answer = (int) (Math.random() * 100) + 1;
		System.out.println("Up&Down");
		System.out.println("1���� 100������ ���ڸ� �Է��ϼ��� : ");
		boolean run = true;

		while (run) {
			input = scan.nextInt();
			count++;
			if (input == answer) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
			System.out.println("�� ū ���� �Է��ϼ���.");
			}
		}
	}

}
