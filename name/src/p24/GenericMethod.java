package p24;

public class GenericMethod { 

	public static<T,V> double makeRecrangle(Point <T,V> p1,Point <T,V> p2) {
		                                //      int x
		
		double left=((Number)p1.getX()).doubleValue(); //���� ��ǥ ���� ������ �� // ���� T���� ����
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double button=((Number)p2.getY()).doubleValue();
		
		double width= right-left; // 10-0
		double height= button-top; //10.0-0
		
		return width*height;
	}
	
	
	public static void main(String[] args) {
		
		Point <Integer,Double> p1=new Point<Integer,Double>(0,0.0); //�̷��� �ᵵ �ǰ�
		Point <Integer,Double> p2=new Point<>(10,10.0); // �̷��� �ᵵ �ȴ�
		
		double rect=GenericMethod.<Integer,Double>makeRecrangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� "+rect+"�Դϴ�.");
	}

}
