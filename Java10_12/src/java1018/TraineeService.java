package java1018;

import java.util.*;

//�� ���ó��

public class TraineeService {
	//traineeList�� TraineeService Ŭ������ �Ѱܼ� ���
	
	void listView (List<TraineeDTO> traineeList) {
		System.out.println("listView ȣ���");
		for(int i=0; i<traineeList.size();i++) {
			System.out.println(traineeList.get(i));
		}
		System.out.println("listView ȣ�ⳡ");
	}
	
	/*
	 * �Ʒû��� �߰��ϴ� �޼��� (addTrainee)
	 * ����Ʈ�� �Ʒû��� �߰��ϴ� ����� ������
	 * Main���κ��� ����Ʈ�� �Ѱܹ޾� �Ʒû��� �߰��ϰ�
	 * �ٽ� Main���� �Ѱ��ִ� �ڵ尡 �ۼ��Ǿ�� ��
	 */
	
	/*
	 * �Ű����� :traineeList
	 * ����Ÿ�� : List<TraineeDTO>
	 * (TraineeDTO ��ü�� ��� List)
	 */
	
	
	
		List<TraineeDTO> addTrainee (List<TraineeDTO> traineeList) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�̸� : ");
			String name = scan.nextLine();
			System.out.print("���� : ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.print("�޴��� ��ȣ : ");
			String phonenum = scan.nextLine();
			System.out.print("�������� : ");
			boolean major = scan.nextBoolean();
			
			TraineeDTO t = new TraineeDTO(name, phonenum,  major, age);
			traineeList.add(t);
			
			return traineeList;
		
	}
	
	
	
	
	
}
