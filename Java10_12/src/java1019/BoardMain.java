package java1019;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Board c1 = new Board();

		System.out.print("제목을 입력하세요 : ");
		String title = scan.next();
		System.out.print("작성자를 입력하세요 : ");
		String writer = scan.next();
		System.out.print("내용을 입력하세요 : ");
		String content = scan.next();
		c1.boardWrite(title, writer, content);

		c1.boardView();
		c1.boardView();

		System.out.print("수정 제목을 입력하세요 : ");
		String uptitle = scan.next();
		System.out.print("수정 내용을 입력하세요 : ");
		String upcontent = scan.next();
		c1.boardUpdate(uptitle, upcontent);

	}
}
