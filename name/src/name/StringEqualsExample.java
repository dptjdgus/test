package name;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 =new String("이호진");
		String strVar2 ="이호진";
		String strVar3; //이렇게도 객체 생성 가능  new를 꼭 써야 객체가 생성 되는게 아님
		
		System.out.println(strVar1); //strVar1,strVar2 는 물리적으로는 다른게 사용됨 논리적으로는 같으나
		System.out.println(strVar2);
		
		if(strVar1==strVar2) { //물리적 비교 판단
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) { //논리적 비교 판단
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}
	}

}
