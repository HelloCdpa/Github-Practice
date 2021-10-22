package java1012;

import java.util.Scanner;

public class Ex02_DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요");
		String str1 = "";
		boolean run = true;
		String answer = "종료"; //변수로 처리하는 것이 값을 수정하는 것에 유용
		do {
			System.out.print(">");
			str1 = scan.nextLine();
			System.out.println(str1);
			if(str1.equals(answer)) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}while(run);
	}

}
