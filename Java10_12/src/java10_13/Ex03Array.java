package java10_13;

import java.util.Scanner;

public class Ex03Array {

	public static void main(String[] args) {
		// ũ�Ⱑ 3 ������ �迭 ���� ��ĳ�ʷ� �迭�� ������ ����
		//����� ���� ����, ��� ���
		
		Scanner scan = new Scanner(System.in);
		int input = 0, sum=0;
		int[] num = new int[3];
		for (int i =0; i<num.length; i++) {
			System.out.print("������ " +(i+1)+"��° ������ ���� �Է��ϼ��� : ");
			input = scan.nextInt();
			num[i] = input;
			sum += num[i];
		}
		System.out.println("����� ���� ���� :"+sum);
		System.out.println("����� ���� ��� :"+(sum/num.length));
		
	}

}
