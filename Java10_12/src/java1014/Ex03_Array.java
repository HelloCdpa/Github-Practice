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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ |4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.print("�л���>");
				score = new int[scan.nextInt()];
				break;
			case 2:
				for (int i = 0; i < score.length; i++) {
					System.out.print(i + 1 + "��° �л����� : ");
					score[i] = scan.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < score.length; i++) {
					System.out.println(i + 1 + "��° �л����� : " + score[i]);
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
				System.out.println("�ְ����� : " + highScore);
				avgScore = sum / score.length;
				System.out.println("������� : " + avgScore);
				for (int i = 0; i < score.length; i++) {
					System.out.println(score[i]);
				}
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}
		}

	}

}
