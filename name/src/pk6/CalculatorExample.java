package pk6;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();//new Calculator(); 기본 생성자 태어나!
		                                   // Calculator myCalc; 객체 선언!
		
		myCalc.powerOn();
		System.out.println("x+y : "+myCalc.plus(10,20));
		System.out.println("x/y : "+myCalc.divide(10,5));
		myCalc.powerOff();
		
		
		int result1 =myCalc.plus(10,20); //실인수 값을 넣어줌   <-- 클라이언트
		System.out.println(result1);
		
		byte x=10;
		byte y=4;
		double result2=(myCalc.divide(x,y));//가인수를 넘겨주는 방법 
		System.out.println(result2);
	}
}
