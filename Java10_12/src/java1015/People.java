package java1015;

public class People {
	//�ʵ� ����
	String name;
	int age;
	//"�̱�"�̶�� �ʱⰪ�� ����
	String nation ="�̱�";
	
	//�⺻ ������ ����
	People(){
		System.out.println("�⺻ ������ ȣ���");
	}
	//�Ű� ������ �ִ� ������ ����
	People(String name, int age, String nation){
		System.out.println("�Ű����� 3�� ������");
		this.name = name;
		this.age = age;
		this.nation = nation;
		//this.�ʵ带 ����Ŵ /�Ű����� �̸� = �ʵ��̸�
	}
	
	People(String name, int age){
		this.name = name;
		this.age = age;
		//�����ڴ� ������ �� �� ������ �Ű�������(Ÿ�Ե�) �޶���Ѵ�.
	}
	People(int age,String name){
		this.name = name;
		this.age = age;
		//�����ڴ� ������ �� �� ������ �Ű�������(Ÿ�Ե�) �޶���Ѵ�.
	}
	People(String nation){
		this.nation = nation;
		//�����ڴ� ������ �� �� ������ �Ű�������(Ÿ�Ե�) �޶���Ѵ�.
	}
	
	
	
	
	
	
	

}
