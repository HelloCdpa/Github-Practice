package java1021;

public class MemberDTO {
	// 필드
	private int num;
	private String id, password, name, email;

	// 기본 생성자
	public MemberDTO() {

	}

	// 매개변수가 있는 생성자
	public MemberDTO(int num, String id, String password, String name, String email) {
		super();
		this.num = num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	// getter setter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [num=" + num + ", id=" + id + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}

}
