package name;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 =new String("��ȣ��");
		String strVar2 ="��ȣ��";
		String strVar3; //�̷��Ե� ��ü ���� ����  new�� �� ��� ��ü�� ���� �Ǵ°� �ƴ�
		
		System.out.println(strVar1); //strVar1,strVar2 �� ���������δ� �ٸ��� ���� �������δ� ������
		System.out.println(strVar2);
		
		if(strVar1==strVar2) { //������ �� �Ǵ�
			System.out.println("���� String ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVar1.equals(strVar2)) { //���� �� �Ǵ�
			System.out.println("���� String ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
	}

}
