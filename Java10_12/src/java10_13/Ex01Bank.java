package java10_13;

import java.util.Scanner;

public class Ex01Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0, withdraw = 0, deposit = 0, balance = 0;

		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
			input = scan.nextInt();

			if (input == 1) {
				System.out.print("���ݾ�>");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");

			} else if (input == 2) {
				System.out.print("��ݾ�>");
				withdraw = scan.nextInt();
				if (balance > withdraw) {
					balance -= withdraw;
					System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
				} else if (balance < withdraw) {
					System.out.println("�ܰ� �����մϴ�.");
					System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
				}

			} else if (input == 3) {
				System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");

			} else if (input == 4) {
				run = false;

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
	}

}
