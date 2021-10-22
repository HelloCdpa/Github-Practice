package javaDay12_01;

public class Login {
	//필드
	private String Id, name;
	private int password;
	//기본생성자
	public Login(){
		
	}
	//매개변수 생성자
	public Login(String id, String name, int password) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
	}
	//get set 매개 메서드
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [Id=" + Id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
