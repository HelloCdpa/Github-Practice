package java1019;

import java.util.ArrayList;
import java.util.List;

public class Ex01ArayyList {

	public static void main(String[] args) {
		
		//Collection Framework : List(ArrayList), Map(HushMap), Set(HashSet)
		// ArrayList ����
		// List ��ü�̸� : list1
		//List�� ���� �� �ִ� ������ Ÿ�� : String
		// <>�ȿ��� Ŭ���� �̸��� �� �� �ִ�.
		List<String> list1 = new ArrayList<String>();
		//ArrayList��� Ŭ���� ��ü�� ���� ����ϱ� ������ ArrayList�� ������ �ִ� ���� �޼��带 Ȱ���� �� ����
		// add, get, size, remove
		
		// ArrayList�� ��� ������ ���
		//get()�޼��� : ���� ����. (String) �Ű����� ����. (int)
		list1.add("ù��° ������");
		list1.add("�ι�° ������");
		list1.add(1,"��� �����");
		list1.add(1,"�̰� ��� �����");
		//������� �ʰ� �з�����
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		//list1�� 0�� �ε����� ����� �����͸� StringŬ���� Ÿ���� ������ ����(��ü) var1�� ����
		String var1 = list1.get(0);
		System.out.println(var1);

		
		
		
		
		// ArrayList ������ ����
		//������� �ʰ� ���ܿ�
		System.out.println("���� �� 1�� �ε��� ������ "+list1.get(1));
		list1.remove(1);
		System.out.println("���� �� 1�� �ε��� ������ "+list1.get(1));
		System.out.println("���� �� list1 �� ������ "+list1.size());
		
		//for���� �̿��Ͽ� list1�� ��� ��� ������ ���
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
		/* 
		 * ArrayList ũ�� Ȯ��
		 * ArrayList Ŭ������ ������ �ִ� size() �޼��� ȣ��
		 * size() ���� ����. �Ű����� ����.
		 */
		
		System.out.println(list1.size());
		
		
		
		
		/*
		 * List ��ü�̸� : list2
		 * List �� ���� �� �ִ� ������ Ÿ�� : ���� ������ (Integer)
		 * Long(long), double(Double), boolean(Boolean)
		 * Wrapper Ŭ����
		 */
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(1123);
		int num1 = 10; //�⺻���� ���� ����
		list2.add(num1);
		Integer num2 = 20; // Integer Ŭ���� Ÿ���� ������ ����
		list2.add(num2);
		
		
		
		
	}

}
