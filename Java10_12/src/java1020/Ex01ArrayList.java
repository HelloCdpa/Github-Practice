package java1020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.* < ��ü�� �ǹ�

public class Ex01ArrayList {

	public static void main(String[] args) {
		/*
		 * ArrayList�� ����� �� �ܾ� 5���� ��ĳ�ʷ� �Է� �ް� �Է¹��� �ܾ ��� ����Ͻÿ�. �׸��� �Է¹��� �ܾ� �� ���� �� �ܾ
		 * ����Ͻÿ�
		 */

		String maxlength = "";
		Scanner scan = new Scanner(System.in);

		List<String> eword = new ArrayList<String>();
//		List<String> eword = new ArrayList<�տ� �Ͱ� �Ȱ����� ��������>();

		for (int i = 0; i < 5; i++) {
			eword.add(i, scan.next());
		}

		for (int i = 0; i < eword.size(); i++) {
			System.out.println(eword.get(i));
		}

		for (int i = 0; i < eword.size(); i++) {
			if (maxlength.length() < eword.get(i).length()) {
				maxlength = eword.get(i);
			}
		}
		System.out.println(maxlength);
		
		
		int longWord = 0;
		for (int i = 1; i < eword.size(); i++) {
			if (eword.get(longWord).length() < eword.get(i).length()) {
				longWord = i;
			}
		}
		System.out.println(eword.get(longWord));
		
		
		
		
		
	}
}
