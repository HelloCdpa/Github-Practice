package java1014;

public class Ex02_Array {

	public static void main(String[] args) {
		// 정렬 알고리즘
		int[] num = { 3, 2, 1, 5, 4 };
		// num[0] = 가장 작은 수 3>2 3>1 3<5 3<4
		// num[0] 이랑 모든 수를 비교해서 작은 값을 num[0]=3인데 num[0]=1에 놔야함!

		// num [0] > num [1] = 0 num[i] = num[j]
		// 순서를 바꾸는 것은 바로 바꿀 수 없으니 변수를 매개체로 바꾼다!

		int temp;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) { //
				if (num[i] > num[j]) {

					temp = num[i];//
					num[i] = num[j];// 2->3
					num[j] = temp; // 3->2 비어 있는 변수 temp에 넣었다
					// temp로 연결한다!

				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
