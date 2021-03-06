package java1020;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayForeach {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		list.add("spring boot");
		
		
		//전통적인 for문으로 list데이터 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//foreach 사용한 방식
		//다량의 데이터를 가지고 있는 객체(ArrayList, Array 등)에 접근할 때
		// for (반복변수 : 반복접근할 객체) => 반복변수와 반복접근용 객체의 데이터 타입은 동일해야 함.
		for(String var: list) {
			System.out.println(var);
		}
		
		
		
	}

}
