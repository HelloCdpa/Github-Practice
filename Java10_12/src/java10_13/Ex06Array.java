package java10_13;

import java.util.Scanner;

public class Ex06Array {

	public static void main(String[] args) {
		// 거스름돈 계산하기
		Scanner scan = new Scanner(System.in);
		int money = 0 , coin500 =0,coin100 =0,coin50 =0, coin10=0;
		
		 int[] chan = new int[3];
		boolean run = true;
		int[] coin = {500,100,50,10};
		System.out.print("돈을 넣으세요 : ");
		money = scan.nextInt();
		coin500 = money/coin[0];
		coin100 = money%coin[0]/coin[1];
		coin50 = money%coin[0]%coin[1]/coin[2];
		coin10 = money%coin[0]%coin[1]%coin[2]/coin[3];
		System.out.println("500 : "+ coin500);
		System.out.println("100 : "+ coin100);
		System.out.println("50 : "+ coin50);
		System.out.println("10 : "+ coin10);
		
		
		
		
	}
}