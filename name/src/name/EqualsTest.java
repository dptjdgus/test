package name;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		// 다른 주소를 갖고 있는 객체의 물리적 논리적 비교
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		if(studentLee.equals(studentSang)) { //equals를 붙여줬는데 왜 값이 동일하지 않다고 나올까?
			                                 // 학생 클래스는 내가 equals를 재정의 해줘야 함 
			System.out.println("studentLee와 studentSang는 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		}
		System.out.println("studentLee의 hashcode 값 : "+studentLee.hashCode()); //인스턴스 생성시 만들어지는 heep 메모의 주소
		System.out.println("studentSang의 hashcode 값 : "+studentSang.hashCode());//heep 메모리 주소
		
		System.out.println("studentLee의 실제 주소 값 : "+System.identityHashCode(studentLee)); //인스턴스 전에 주어지는 실제 주소
		System.out.println("studentSang의 실제 주소 값 : "+System.identityHashCode(studentSang));

	}
}
