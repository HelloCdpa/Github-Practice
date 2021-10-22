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
			System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
			input = scan.nextInt();
			count++;
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요");

			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				run = false;
			}
		} while (run);
	}
}