package java1015;

public class People {
	//필드 선언
	String name;
	int age;
	//"미국"이라는 초기값을 선언
	String nation ="미국";
	
	//기본 생성자 선언
	People(){
		System.out.println("기본 생성자 호출됨");
	}
	//매개 변수가 있는 생성자 선언
	People(String name, int age, String nation){
		System.out.println("매개변수 3개 생성자");
		this.name = name;
		this.age = age;
		this.nation = nation;
		//this.필드를 가리킴 /매개변수 이름 = 필드이름
	}
	
	People(String name, int age){
		this.name = name;
		this.age = age;
		//생성자는 여러개 쓸 수 있지만 매개변수가(타입들) 달라야한다.
	}
	People(int age,String name){
		this.name = name;
		this.age = age;
		//생성자는 여러개 쓸 수 있지만 매개변수가(타입들) 달라야한다.
	}
	People(String nation){
		this.nation = nation;
		//생성자는 여러개 쓸 수 있지만 매개변수가(타입들) 달라야한다.
	}
	
	
	
	
	
	
	

}
