package pk6;

public class Calculator {
    //메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result1=x+y;
		return  result1;
	}
	double divide(int x,int y) {
		double result2=(double)x/(double)y;
		return result2;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
