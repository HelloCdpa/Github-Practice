package java10_13;

import java.util.Scanner;

public class Ex04Array {

	public static void main(String[] args) {
		// 크기가 5인 정수 배열 선언 스캐너 값 입력 가장 큰 값 출력
		int input = 0, max =0, min=0;
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 값을 입력하세요 : ");
			input = scan.nextInt();
			num[i] = input;
			
			
//			if (max < num[i]) {
//				max = num[i];
//			} 
				
			if (min > num[i]) {
				min = num[i];
				
			}
			
			
			
			}
//		System.out.println("최댓값 : " + max);
		System.out.println(min);
			
		}

	}

//1 2 3 5 6 