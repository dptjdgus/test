package pk6;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();//new Calculator(); �⺻ ������ �¾!
		                                   // Calculator myCalc; ��ü ����!
		
		myCalc.powerOn();
		System.out.println("x+y : "+myCalc.plus(10,20));
		System.out.println("x/y : "+myCalc.divide(10,5));
		myCalc.powerOff();
		
		
		int result1 =myCalc.plus(10,20); //���μ� ���� �־���   <-- Ŭ���̾�Ʈ
		System.out.println(result1);
		
		byte x=10;
		byte y=4;
		double result2=(myCalc.divide(x,y));//���μ��� �Ѱ��ִ� ��� 
		System.out.println(result2);
	}
}
