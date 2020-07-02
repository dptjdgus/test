package p23;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// 객체를 생성하서 클래스이름 획득
		Person person =new Person();
		//object의 getClass() 메소드를 사용
		
		Class pClass1=person.getClass(); //객체를 가지고온거 (Class pClass1 이거 기존에 있는 클래스임 만든 클래스 아님 pClass1 는 이름)
		System.out.println(pClass1.getName()); // getName은 클래스 이름을 가지고 오는거
	    
		// 클래스가 접근해서 클래스 이름을 획득
		Class pClass2=Person.class; // 클래스를 가지고 온거
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("p23.Person");
		System.out.println(pClass3.getName());
		

	}

}
