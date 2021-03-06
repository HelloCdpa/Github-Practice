package java1018;

import java.util.*;

public class TraineeMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<TraineeDTO> traineeList = new ArrayList<>();
		
		//매개변수 있는 생성자
		TraineeDTO student = new TraineeDTO("혜린","010",true,28);
		
		//기본생성자
		TraineeDTO student2 = new TraineeDTO();
		
		student2.setName("민정");
		student2.setAge(27);
		student2.setPhonenum("01099999999");
		student2.setMajor(true);
		
		//리스트에 담기
		traineeList.add(student);
		traineeList.add(student2);
		
		//기본 생성자로 객체 하나 더 스캐너로 값 입력받아 저장하기
//		TraineeDTO student3 = new TraineeDTO();
//		System.out.print("이름 : ");
//		String name = scan.next();
//		System.out.print("나이 : ");
//		int age = scan.nextInt();
//		scan.nextLine();
//		System.out.print("휴대폰 번호 : ");
//		String phonenum = scan.next();
//		System.out.print("전공유무 : ");
//		boolean major = scan.nextBoolean();
				
		
//		student3.setName(name);
//		student3.setAge(age);
//		student3.setPhonenum(phonenum);
//		student3.setMajor(major);
//		
//		traineeList.add(student3);
//		
		//for 
		
		for (int i=0; i<traineeList.size(); i++ ) {
			System.out.println(traineeList.get(i));
		}
		
		//foreach
		
		for(TraineeDTO t : traineeList) {
			System.out.println(t.toString());
		}	
		
		//listView 메서드를 호출하면서 traineeList를 전달하는 코드작성
		TraineeService list = new TraineeService();
		//객체를 만들어야 해당클래스가 가지고 있는 
		//자원(필드,메서드 등등)을 활용할 수 있음
		
		System.out.println("호출전");
		list.listView(traineeList);
		System.out.println("호출후");
		
//		TraineeDTO student5 = new TraineeDTO("당근","010",true,19);
		
		traineeList = list.addTrainee(traineeList);
		
		for(TraineeDTO t : traineeList) {
			System.out.println(t.toString());
		}	
		
		
	}

}
