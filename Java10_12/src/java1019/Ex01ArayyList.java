package java1019;

import java.util.ArrayList;
import java.util.List;

public class Ex01ArayyList {

	public static void main(String[] args) {
		
		//Collection Framework : List(ArrayList), Map(HushMap), Set(HashSet)
		// ArrayList 선언
		// List 객체이름 : list1
		//List에 담을 수 있는 데이터 타입 : String
		// <>안에는 클래스 이름만 올 수 있다.
		List<String> list1 = new ArrayList<String>();
		//ArrayList라는 클래스 객체를 만들어서 사용하기 때문에 ArrayList가 가지고 있는 여러 메서드를 활용할 수 있음
		// add, get, size, remove
		
		// ArrayList에 담긴 데이터 출력
		//get()메서드 : 리턴 있음. (String) 매개변수 있음. (int)
		list1.add("첫번째 데이터");
		list1.add("두번째 데이터");
		list1.add(1,"어디에 들어갈까요");
		list1.add(1,"이건 어디에 들어갈까요");
		//덮어쓰이지 않고 밀려난다
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		//list1의 0번 인덱스에 저장된 데이터를 String클래스 타입의 참조형 변수(객체) var1에 저장
		String var1 = list1.get(0);
		System.out.println(var1);

		
		
		
		
		// ArrayList 데이터 삭제
		//비워두지 않고 땡겨옴
		System.out.println("삭제 전 1번 인덱스 데이터 "+list1.get(1));
		list1.remove(1);
		System.out.println("삭제 후 1번 인덱스 데이터 "+list1.get(1));
		System.out.println("삭제 후 list1 의 사이즈 "+list1.size());
		
		//for문을 이용하여 list1에 담긴 모든 데이터 출력
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
		/* 
		 * ArrayList 크기 확인
		 * ArrayList 클래스가 가지고 있는 size() 메서드 호출
		 * size() 리턴 있음. 매개변수 없음.
		 */
		
		System.out.println(list1.size());
		
		
		
		
		/*
		 * List 객체이름 : list2
		 * List 에 담을 수 있는 데이터 타입 : 정수 데이터 (Integer)
		 * Long(long), double(Double), boolean(Boolean)
		 * Wrapper 클래스
		 */
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(1123);
		int num1 = 10; //기본형의 정수 변수
		list2.add(num1);
		Integer num2 = 20; // Integer 클래스 타입의 참조형 변수
		list2.add(num2);
		
		
		
		
	}

}
