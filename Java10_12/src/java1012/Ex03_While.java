package java1012;

import java.util.Scanner;

public class Ex03_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, count = 0;

//		평균 = (num1+num2+num3)/n
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");

		boolean run = true;
		while (run) {
			num = scan.nextInt();
			if (num != 0) {
				sum += num;
				count += 1;
			} else if (num == 0) {
				run = false;
				double avg = sum/count;
				double avg1 = (double)sum/count;
				System.out.println("입력한 수는 " + count + "개");
				System.out.println("평균은 " + avg + " 입니다.");
				System.out.println("평균은 " + avg1 + " 입니다.");
			}
		}
	}
}
