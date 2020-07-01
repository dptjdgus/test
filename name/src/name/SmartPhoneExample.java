package name;

public class SmartPhoneExample {

	public static void main(String[] args) {
		Smartphone myPhone1; // 이렇게만 해도 객체가 만들어짐 꼭 new 를 붙이지 않아도
		
		Smartphone myPhone=new Smartphone("삼성","안드로이드");
		
        //System.out.println(myPhone); //hashcode
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
	
	}

}
