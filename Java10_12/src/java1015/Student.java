package java1015;

public class Student {
	String name, grade, major;
	int age = 4;
	
	Student() {
		 System.out.println("기본생성자 호출");
	}
	
	Student (String name, String major, String grade, int age){
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.age = age;
		
	}
	Student (String name, String grade){
		this.name = name;
		this.grade = grade;
		
	}
	Student ( String grade, String major, int age){
		this.grade = grade;
		this.major = major;
		this.age = age;
		
	}
	 
	
	
	
	

}
