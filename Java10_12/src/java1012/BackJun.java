package java1012;

import java.util.Scanner;

public class BackJun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		x = scan.nextInt();
		y = scan.nextInt();
		if (x>0 && y>0) {
			System.out.println("1");
		} else if(x<0 && y>0) {
			System.out.println("2");
		} else if(x<0 && y<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}

	}

}
