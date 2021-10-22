package java1012;

import java.util.Scanner;

public class Ex04_UpAndDown {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input = 0, count = 0, answer = 0;
		answer = (int) (Math.random() * 100) + 1;
		System.out.println("Up&Down");
		System.out.println("1부터 100까지의 숫자를 입력하세요 : ");
		boolean run = true;

		while (run) {
			input = scan.nextInt();
			count++;
			if (input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
			System.out.println("더 큰 수를 입력하세요.");
			}
		}
	}

}
