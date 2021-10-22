package java10_13;

public class Ex02Array {

	public static void main(String[] args) {
		 int[] num = {34,555,7898,1111};
		 for (int i=0; i<num.length; i++) {
			 System.out.println(num[i]);
		 }
		 
		 int sum = 0 , avg = 0;
		 for (int i=0; i<num.length; i++) {
			 sum += num[i];
			 avg = sum/num.length;
		 }
		 System.out.println("ÃÑÇÕ : " + sum);
		 System.out.println("Æò±Õ : " + avg);
		 
		 
		 
		 
	}

}
