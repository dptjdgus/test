package pk6;

public class CarExample {

	public static void main(String[] args) {
		Car car1=new Car(); //�ʴ� ī �Ҽ��� �ڼ��� car1 carŬ�������� ���� ��
		//�ʱ�ȭ�� �ʵ����� ������ �����ϴ�
		//car1.company="����ڵ���"; //���� �ڵ����� ���� �ȵ�� �׷� ���⼭ �ٲܼ� ����.. 
		
		System.out.println("---------�ʵ� Ȳ��1-------------");
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		System.out.println("---------�ʵ� Ȳ��2-------------");
		Car car2=new Car("�ҳ�Ÿ");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();
		
		System.out.println("---------�ʵ� Ȳ��3-------------");
		Car car3=new Car("�ҳ�Ÿ","����");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);//car2.model �� ����ٰ� ���� �ҳ�Ÿ�� ���� ���� ��ϰ� ���� ������
		System.out.println("car3.color: "+car3.color);
		System.out.println();
		
		System.out.println("---------�ʵ� Ȳ��4-------------");
		Car car4=new Car("�ý�","����",200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed); //car2.maxSpeed�� ���� ������ ���� �����̴� ������ ���� null���� ����
	}
}
