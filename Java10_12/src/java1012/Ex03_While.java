package java1012;

import java.util.Scanner;

public class Ex03_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, count = 0;

//		��� = (num1+num2+num3)/n
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ��� : ");

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
				System.out.println("�Է��� ���� " + count + "��");
				System.out.println("����� " + avg + " �Դϴ�.");
				System.out.println("����� " + avg1 + " �Դϴ�.");
			}
		}
	}
}
