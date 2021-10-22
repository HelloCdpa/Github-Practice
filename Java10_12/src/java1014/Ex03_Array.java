package java1014;

import java.util.Scanner;

public class Ex03_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int temp = 0, highScore = 0, sum = 0;
		double avgScore = 0;

		int[] score = null;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.print("학생수>");
				score = new int[scan.nextInt()];
				break;
			case 2:
				for (int i = 0; i < score.length; i++) {
					System.out.print(i + 1 + "번째 학생점수 : ");
					score[i] = scan.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < score.length; i++) {
					System.out.println(i + 1 + "번째 학생점수 : " + score[i]);
				}
				break;
			case 4:
				for (int i = 0; i < score.length; i++) {
					sum += score[i];

					if (highScore < score[i]) {
						highScore = score[i];
					}
				}

				for (int i = 0; i < score.length; i++) {
					for (int j = i + 1; j < score.length; j++) {
						if (score[i] < score[j]) {
							temp = score[i];
							score[i] = score[j];
							score[j] = temp;
						}

					}
				}
				System.out.println("최고점수 : " + highScore);
				avgScore = sum / score.length;
				System.out.println("평균점수 : " + avgScore);
				for (int i = 0; i < score.length; i++) {
					System.out.println(score[i]);
				}
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");

			}
		}

	}

}
