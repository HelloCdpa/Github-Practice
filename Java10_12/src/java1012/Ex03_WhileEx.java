package java1012;

public class Ex03_WhileEx {

	public static void main(String[] args) {
		 // +(3-4)+(5-6)+7 �հ谡 100�� �Ѿ��� ���� ���ڴ�?

		int num=1, sum = 0, count=1;
		boolean run = true; 
		while (run) {
				sum += num-(num+1);
				num++;
			    count++;
			if (sum>=100) {
				run = false;
			}
		}	
		System.out.println("�հ谡 100�� �Ѿ��� ���� ���� : " + (count));

	}
}


