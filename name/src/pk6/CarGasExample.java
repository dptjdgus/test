package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		
		// CarGas의 setGas()메소드 호출
		myCarGas.setGas(5);
		
		//CarGas의 isLeftGas()메소드 호출)
		boolean gasState=myCarGas.isLeftGas();
				if(gasState) {
					System.out.println("출발합니다.");
					myCarGas.run();
					// CarGas의 run() 메소드 호출
				}
		        //주유의 필요 유무
		        if(myCarGas.isLeftGas()){
		        	System.out.println("gas 잔여량이 남아 있습니다.");
	            }
		        else {
		        	System.out.println("주유가 필요합니다.");
		        }
	   }
}

