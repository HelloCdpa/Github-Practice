package java1014;

public class Ex02_Array {

	public static void main(String[] args) {
		// ���� �˰���
		int[] num = { 3, 2, 1, 5, 4 };
		// num[0] = ���� ���� �� 3>2 3>1 3<5 3<4
		// num[0] �̶� ��� ���� ���ؼ� ���� ���� num[0]=3�ε� num[0]=1�� ������!

		// num [0] > num [1] = 0 num[i] = num[j]
		// ������ �ٲٴ� ���� �ٷ� �ٲ� �� ������ ������ �Ű�ü�� �ٲ۴�!

		int temp;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) { //
				if (num[i] > num[j]) {

					temp = num[i];//
					num[i] = num[j];// 2->3
					num[j] = temp; // 3->2 ��� �ִ� ���� temp�� �־���
					// temp�� �����Ѵ�!

				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
