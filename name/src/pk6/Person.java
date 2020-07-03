package pk6;

public class Person {
	final String nation="Korea"; //final을 쓰면 메인에서 다시 나라를 재정의해도 못바꿈
	final String ssn;
	String name;
	
	public Person(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	}

}
