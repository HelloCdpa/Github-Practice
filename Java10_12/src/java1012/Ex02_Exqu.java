package java1012;

import java.util.Scanner;

public class Ex02_Exqu {

	public static void main(String[] args) {
		String str1 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���.");

		boolean run = true; //�ݺ� ������ �������� �ʾ��� ��
		while (run) {
			System.out.print(">");
			str1 = scan.nextLine();
			System.out.println(str1);
			if (str1.equals("����")) {
				System.out.println("���α׷� ����");
			}
		}
	}

}
