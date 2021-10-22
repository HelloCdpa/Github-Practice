package java10_13;

import java.util.Scanner;

public class Ex03Array {

	public static void main(String[] args) {
		// 크기가 3 정수형 배열 선언 스캐너로 배열에 데이터 저장
		//저장된 값의 총합, 평균 계산
		
		Scanner scan = new Scanner(System.in);
		int input = 0, sum=0;
		int[] num = new int[3];
		for (int i =0; i<num.length; i++) {
			System.out.print("저장할 " +(i+1)+"번째 데이터 값을 입력하세요 : ");
			input = scan.nextInt();
			num[i] = input;
			sum += num[i];
		}
		System.out.println("저장된 값의 총합 :"+sum);
		System.out.println("저장된 값의 평균 :"+(sum/num.length));
		
	}

}
