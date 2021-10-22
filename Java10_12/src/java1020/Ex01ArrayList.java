package java1020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.* < 전체를 의미

public class Ex01ArrayList {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고 입력받은 단어를 모두 출력하시오. 그리고 입력받은 단어 중 가장 긴 단어를
		 * 출력하시오
		 */

		String maxlength = "";
		Scanner scan = new Scanner(System.in);

		List<String> eword = new ArrayList<String>();
//		List<String> eword = new ArrayList<앞에 것과 똑같으면 생략가능>();

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
