package pk6;

public class Computer {
	//�޼ҵ�1 ����
	
	//int sum1(int[] values) // ���⿡ int [] values = new values[] {1,2,3};�̰� �� 
	int sum1(int[] values) { //�ʱ�ȭ�� ������ //�迭 ���� ����
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	//�޼ҵ�2
	
	int sum2(int ...values) {//... �ϰ� �� ���� �𸣰ڴ�.. ������ //1,2,3�� �ְ� ���
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
