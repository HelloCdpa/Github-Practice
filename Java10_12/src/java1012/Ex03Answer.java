package java1012;

public class Ex03Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0 , num = 0;
		int count = 1, s=1;
		boolean run = true;
		while (run) {
			sum+=num;
			if (sum>=100) {
				run = false;
			}else {
				num = s *count;
				s = -s;
				count++;
			}
		}
		System.out.println("숫자 :" + num);
		System.out.println("합계 :" + sum);
	}

}
