package java1015;

public class CaculatorMain {

	public static void main(String[] args) {
		
		//덧셈을 수행하기 위한 메서드 호출
		Caculator call = new Caculator();
		//add1 메서드 호출
		call.add1();
		
		//리턴 데이터를 변수에 저장하기
		int result = call.add1();
		System.out.println(result);
		
		//리턴 데이터를 바로 출력하기
		System.out.println(call.add1());
		
		
		int num1 = 1, num2 = 3;
		result = call.add2(num1, num2);
		System.out.println(result);
		
		System.out.println(call.add2(55,100));
		
		//리턴이 없는 값은 그냥 호출만 해도 됨
		call.add3();
		
		call.add4(num1,num2);
		call.add4(12, 10);
		
		
	}

}
