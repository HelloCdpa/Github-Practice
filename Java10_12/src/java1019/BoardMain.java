package java1019;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Board c1 = new Board();

		System.out.print("������ �Է��ϼ��� : ");
		String title = scan.next();
		System.out.print("�ۼ��ڸ� �Է��ϼ��� : ");
		String writer = scan.next();
		System.out.print("������ �Է��ϼ��� : ");
		String content = scan.next();
		c1.boardWrite(title, writer, content);

		c1.boardView();
		c1.boardView();

		System.out.print("���� ������ �Է��ϼ��� : ");
		String uptitle = scan.next();
		System.out.print("���� ������ �Է��ϼ��� : ");
		String upcontent = scan.next();
		c1.boardUpdate(uptitle, upcontent);

	}
}
