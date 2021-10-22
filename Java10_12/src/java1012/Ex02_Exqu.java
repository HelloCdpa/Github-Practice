package java1012;

import java.util.Scanner;

public class Ex02_Exqu {

	public static void main(String[] args) {
		String str1 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");

		boolean run = true; //반복 조건이 정해지지 않았을 때
		while (run) {
			System.out.print(">");
			str1 = scan.nextLine();
			System.out.println(str1);
			if (str1.equals("종료")) {
				System.out.println("프로그램 종료");
			}
		}
	}

}
