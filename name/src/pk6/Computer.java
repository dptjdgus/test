package pk6;

public class Computer {
	//메소드1 생성
	
	//int sum1(int[] values) // 여기에 int [] values = new values[] {1,2,3};이게 들어감 
	int sum1(int[] values) { //초기화를 안했음 //배열 선언만 해줌
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	//메소드2
	
	int sum2(int ...values) {//... 니가 뭘 쓸지 모르겠다.. 미지수 //1,2,3을 넣고 계산
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
