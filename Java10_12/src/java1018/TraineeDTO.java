package java1018;

public class TraineeDTO {
	
	//DTO (Data Transfer Object)
	//VO (Value Object)
	
	//필드선언
	//참조형 타입은 기본값이 따로 없다. null
	private String name,  phonenum;
	private boolean Major;
	private int age;
	
	//생성자 선언
//	TraineeDTO (String name, int age, String phonenum, boolean Major) {
//		this.name = name;
//		this.age = age;
//		this.Major = Major;
//		this.phonenum = phonenum;
//		System.out.println("이름 : "+name+ " 나이: " +age + " 번호 : "+ phonenum + " 전공 유무 :" + Major);
//
//	}
//	
//	
//	TraineeDTO (String name, String phonenum) {
//		this.name = name;
//		this.phonenum = phonenum;
//		System.out.println("이름 : "+name+ " 나이: " +age + " 번호 : "+ phonenum + " 전공 유무 :" + Major);
//
//	}
	
	
	
	
	
	
	
	
	//기본 생성자
	public TraineeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//모든 필드를 매개변수로 하는 생성자
	
	public TraineeDTO(String name, String phonenum, boolean major, int age) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		Major = major;
		this.age = age;
	}




	// getter setter 선언
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhonenum() {
		return phonenum;
	}


	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}


	public boolean isMajor() {
		return Major;
	}


	public void setMajor(boolean major) {
		Major = major;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//메서드 선언
	void afterSignup (int age, boolean Major){
		//필드 값으로 세팅
		this.age = age;
		this.Major = Major;
		
		System.out.println("등록 완료");
		System.out.println("이름 : "+name+ " 나이: " +age + " 번호 : "+ phonenum + " 전공 유무 :" + Major);
		
	}
	void phoneNumberUpdate (String UpdatePhonenum) {
		this.phonenum = UpdatePhonenum;
		System.out.println("변경 완료");
		System.out.println("이름 : "+name+ " 나이: " +age + " 번호 : "+ phonenum + " 전공 유무 :" + Major);
		
	}


	@Override
	public String toString() {
		return "Trainee [name=" + name + ", phonenum=" + phonenum + ", Major=" + Major + ", age=" + age + "]";
	}
	
	
	
	

	
	
	
	
	
	
	

}
