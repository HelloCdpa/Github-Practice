package java1012;

import java.util.Scanner;

public class Ex02_DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���");
		String str1 = "";
		boolean run = true;
		String answer = "����"; //������ ó���ϴ� ���� ���� �����ϴ� �Ϳ� ����
		do {
			System.out.print(">");
			str1 = scan.nextLine();
			System.out.println(str1);
			if(str1.equals(answer)) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}while(run);
	}

}
