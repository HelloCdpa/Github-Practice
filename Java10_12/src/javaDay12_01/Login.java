package javaDay12_01;

public class Login {
	//�ʵ�
	private String Id, name;
	private int password;
	//�⺻������
	public Login(){
		
	}
	//�Ű����� ������
	public Login(String id, String name, int password) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
	}
	//get set �Ű� �޼���
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
