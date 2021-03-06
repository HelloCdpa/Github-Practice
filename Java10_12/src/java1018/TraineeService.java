package java1018;

import java.util.*;

//상세 기능처리

public class TraineeService {
	//traineeList를 TraineeService 클래스로 넘겨서 출력
	
	void listView (List<TraineeDTO> traineeList) {
		System.out.println("listView 호출됨");
		for(int i=0; i<traineeList.size();i++) {
			System.out.println(traineeList.get(i));
		}
		System.out.println("listView 호출끝");
	}
	
	/*
	 * 훈련생을 추가하는 메서드 (addTrainee)
	 * 리스트에 훈련생을 추가하는 기능을 수행함
	 * Main으로부터 리스트를 넘겨받아 훈련생을 추가하고
	 * 다시 Main으로 넘겨주는 코드가 작성되어야 함
	 */
	
	/*
	 * 매개변수 :traineeList
	 * 리턴타입 : List<TraineeDTO>
	 * (TraineeDTO 객체를 담는 List)
	 */
	
	
	
		List<TraineeDTO> addTrainee (List<TraineeDTO> traineeList) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.print("휴대폰 번호 : ");
			String phonenum = scan.nextLine();
			System.out.print("전공유무 : ");
			boolean major = scan.nextBoolean();
			
			TraineeDTO t = new TraineeDTO(name, phonenum,  major, age);
			traineeList.add(t);
			
			return traineeList;
		
	}
	
	
	
	
	
}
