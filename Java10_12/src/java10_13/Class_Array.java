package java10_13;

public class Class_Array {

	public static void main(String[] args) {
		// ���� Ÿ���� a �迭 ��ü ���� (��, ũ��� �������� ���� ����)
		 int[] a;
		 int a1[];
		 //���� ���� (����ִ� 0���� �ٸ���!)= null
		 int [] a2 = null;
		 String [] str = null; 
		 
		 //�迭 ���� �ϸ鼭 �ʱⰪ ����
		 // ���� [] ������ {}
		 int [] number = {1,2,3,4};
		 String[] strVar = {"����","�����ٶ�","abcd","123"};
		
		 //�迭�� ����� �� ����ϱ� (�ε��� Ȱ��)
		 System.out.println(number[0]);
		 System.out.println(number[1]);
		 System.out.println(number[2]);
		 System.out.println(number[3]);
		 //java.lang.ArrayIndexOutOfBoundsException �ε��� ���� �ʰ�
		 //System.out.println(number[4]);
		 System.out.println(strVar[0]);
		 System.out.println(strVar[1]);
		 System.out.println(strVar[2]);
		 System.out.println(strVar[3]);
		
		 //�迭 ������ �ٲٱ�
		 // number �迭�� 3�� �ε����� 99 ����
		 System.out.println(number[3]);
		 number[3] = 99;
		 System.out.println(number[3]);
		 
		 //�迭�� ũ��(�� ���� �����Ͱ� �ִ���) Ȯ��
		 
		 System.out.println(number.length);
		 int numberSize = number.length;
		 System.out.println(numberSize);
		 
		 //number ũ�� : 4 �ε��� : 0~3 
		 //Ÿ�� : ������ �̸� : num4 ũ�� : 3 �ε��� : 0~2
		 int[] num4 = new int[3];
		 //ũ�⸦ �����ָ� �⺻������ ������ ��
		 System.out.println(num4[0]);
		 num4[0] = 111;
		 System.out.println(num4[0]);
		 //System.out.println(num4[3]); ���� �ʰ�! �迭 ������ �� = [ũ��]!
		 
		 double[] num5 = new double[3];
		 System.out.println(num5[0]);
		 
		 String[] str1 = new String[3];
		 System.out.println(str1[0]);
		 
		 
		 //��ĭ���� �𸦋�
		 int[] num6 = null;
		 num6 = new int [3];
		 System.out.println(num6.length);
		 
		
		
		
	}

}
