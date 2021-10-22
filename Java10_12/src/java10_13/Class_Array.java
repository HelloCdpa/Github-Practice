package java10_13;

public class Class_Array {

	public static void main(String[] args) {
		// 정수 타입의 a 배열 객체 선언 (값, 크기는 결정되지 않은 상태)
		 int[] a;
		 int a1[];
		 //값이 없다 (비어있다 0과는 다르다!)= null
		 int [] a2 = null;
		 String [] str = null; 
		 
		 //배열 선언 하면서 초기값 지정
		 // 선언 [] 데이터 {}
		 int [] number = {1,2,3,4};
		 String[] strVar = {"가나","가나다라","abcd","123"};
		
		 //배열에 저장된 값 출력하기 (인덱스 활용)
		 System.out.println(number[0]);
		 System.out.println(number[1]);
		 System.out.println(number[2]);
		 System.out.println(number[3]);
		 //java.lang.ArrayIndexOutOfBoundsException 인덱스 범위 초과
		 //System.out.println(number[4]);
		 System.out.println(strVar[0]);
		 System.out.println(strVar[1]);
		 System.out.println(strVar[2]);
		 System.out.println(strVar[3]);
		
		 //배열 데이터 바꾸기
		 // number 배열의 3번 인덱스에 99 저장
		 System.out.println(number[3]);
		 number[3] = 99;
		 System.out.println(number[3]);
		 
		 //배열의 크기(몇 개의 데이터가 있는지) 확인
		 
		 System.out.println(number.length);
		 int numberSize = number.length;
		 System.out.println(numberSize);
		 
		 //number 크기 : 4 인덱스 : 0~3 
		 //타입 : 정수형 이름 : num4 크기 : 3 인덱스 : 0~2
		 int[] num4 = new int[3];
		 //크기를 정해주면 기본값으로 설정이 됨
		 System.out.println(num4[0]);
		 num4[0] = 111;
		 System.out.println(num4[0]);
		 //System.out.println(num4[3]); 범위 초과! 배열 선언할 때 = [크기]!
		 
		 double[] num5 = new double[3];
		 System.out.println(num5[0]);
		 
		 String[] str1 = new String[3];
		 System.out.println(str1[0]);
		 
		 
		 //몇칸인지 모를떄
		 int[] num6 = null;
		 num6 = new int [3];
		 System.out.println(num6.length);
		 
		
		
		
	}

}
