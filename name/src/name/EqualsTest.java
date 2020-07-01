package name;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		}
		
		// �ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		
		if(studentLee == studentSang) {
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		}
		if(studentLee.equals(studentSang)) { //equals�� �ٿ���µ� �� ���� �������� �ʴٰ� ���ñ�?
			                                 // �л� Ŭ������ ���� equals�� ������ ����� �� 
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		}
		System.out.println("studentLee�� hashcode �� : "+studentLee.hashCode()); //�ν��Ͻ� ������ ��������� heep �޸��� �ּ�
		System.out.println("studentSang�� hashcode �� : "+studentSang.hashCode());//heep �޸� �ּ�
		
		System.out.println("studentLee�� ���� �ּ� �� : "+System.identityHashCode(studentLee)); //�ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentSang�� ���� �ּ� �� : "+System.identityHashCode(studentSang));

	}
}
