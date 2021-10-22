package java10_13;

import java.util.Scanner;

public class Ex01Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0, withdraw = 0, deposit = 0, balance = 0;

		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			input = scan.nextInt();

			if (input == 1) {
				System.out.print("예금액>");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("현재 잔액은 " + balance + "입니다.");

			} else if (input == 2) {
				System.out.print("출금액>");
				withdraw = scan.nextInt();
				if (balance > withdraw) {
					balance -= withdraw;
					System.out.println("현재 잔액은 " + balance + "입니다.");
				} else if (balance < withdraw) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은 " + balance + "입니다.");
				}

			} else if (input == 3) {
				System.out.println("현재 잔액은 " + balance + "입니다.");

			} else if (input == 4) {
				run = false;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

}
