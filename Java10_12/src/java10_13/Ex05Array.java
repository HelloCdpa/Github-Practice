package java10_13;

import java.util.Scanner;

public class Ex05Array {

	public static void main(String[] args) {

		/*
		 * 어떤 배열이 있을 때 어떤 숫자가 몇번 인덱스에 있는지 출력 8을 입력하면 8은 4번 인덱스에 있습니다.
		 */

		int input = 0;
		Scanner scan = new Scanner(System.in);
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		System.out.print("값을 입력하세요 : ");
		input = scan.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (input == num[i]) {
				System.out.println(input + "은 " + i + "번 인덱스에 있습니다.");
			}

		} 
	}
}
