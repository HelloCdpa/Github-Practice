package java10_13;

import java.util.Scanner;

public class Ex04Array {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ���� �迭 ���� ��ĳ�� �� �Է� ���� ū �� ���
		int input = 0, max =0, min=0;
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i=0; i<num.length; i++) {
			System.out.print((i+1)+"��° ���� �Է��ϼ��� : ");
			input = scan.nextInt();
			num[i] = input;
			
			
//			if (max < num[i]) {
//				max = num[i];
//			} 
				
			if (min > num[i]) {
				min = num[i];
				
			}
			
			
			
			}
//		System.out.println("�ִ� : " + max);
		System.out.println(min);
			
		}

	}

//1 2 3 5 6 