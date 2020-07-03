package pk6;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom=new Computer();
		
		System.out.println("========sum1 유형1==========");
		int[] values1= {1,2,3}; // 앞에 new만 빠졌지 값을 넣어준거 
		int result1=myCom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		System.out.println("========sum1 유형2==========");
		int result2=myCom.sum1(new int[] {1,2,3,4,5}); 
		System.out.println("result1 : "+result2);
		
		System.out.println("========sum2 유형1==========");
	    int result3=myCom.sum2(1,2,3);
		System.out.println("result3 : "+result3);
		
		System.out.println("========sum2 유형2==========");
		int result4=myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : "+result4);
	}
}
