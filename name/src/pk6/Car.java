package pk6;

public class Car {
    //�ʵ�(�������) 
	String company="�����ڵ���"; // �ʵ带 �ʱ�ȭ �س��� ����. 1.Ŭ������ �����ؼ� �������� �ҷ��÷���  2. �ߺ��ɸ��� ����
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){ // �����ڰ� 4���� �Ȱ��� Ŭ������ 4�� �ΰ�ó�� Ȯ��
		
	}
	Car(String model){
		this.model=model;
	}
    Car(String model, String color){
    	this.model=model;
    	this.color=color;
    }
    Car(String model, String color,int maxSpeed){
    	this.model=model;
    	this.color=color;
    	this.maxSpeed=maxSpeed;
    }
    //�޼ҵ�

}
