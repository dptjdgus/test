package p23;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// ��ü�� �����ϼ� Ŭ�����̸� ȹ��
		Person person =new Person();
		//object�� getClass() �޼ҵ带 ���
		
		Class pClass1=person.getClass(); //��ü�� ������°� (Class pClass1 �̰� ������ �ִ� Ŭ������ ���� Ŭ���� �ƴ� pClass1 �� �̸�)
		System.out.println(pClass1.getName()); // getName�� Ŭ���� �̸��� ������ ���°�
	    
		// Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class; // Ŭ������ ������ �°�
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("p23.Person");
		System.out.println(pClass3.getName());
		

	}

}
