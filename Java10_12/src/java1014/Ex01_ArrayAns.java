package java1014;

import java.util.Scanner;

public class Ex01_ArrayAns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] coin = { 500, 100, 50, 10 };
		System.out.print("돈을 넣으세요 : ");
		int change = scan.nextInt();
		int coinCount = 0;

		for (int i = 0; i < coin.length; i++) {
			coinCount = change / coin[i];
			System.out.println(coin[i] + "원 동전 : " + coinCount + "개");
			change = change % coin[i]; // change %= coin[i];
		}

	}

}
