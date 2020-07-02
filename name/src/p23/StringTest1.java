package p23;

public class StringTest1 {

	public static void main(String[] args) {
		// 객체 인스턴스는 각각 heap메모리에 저장됨
		String str1 =new String("abc"); 
		String str2 =new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)); //--> 원래는 다른데 억지로 같게 만듬
		
		// 문자열은 상수값으로 데이터 역역에 고정된 주소를 사용 --> 상수풀에 저장
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4)); // 원래도 같으니 당연히 같은게 나옴

	}

}
