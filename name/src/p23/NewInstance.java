package p23;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1=new Person();
		System.out.println(person1);
		
		Class pClass=Class.forName("p23.Person");
		System.out.println(pClass);
		
		
		Person person2=(Person)pClass.newInstance(); //new 연산자를 사용하지 않고 객체를 만드는법
		System.out.println(person2);
		
		

	}

}
