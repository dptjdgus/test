package p23;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf=new StringBuffer("Nice Day! ");
		
		System.out.println(buf.toString()); //toString을 이용해 출력
		System.out.println(buf.length());  //문자열 크기(길이)
		System.out.println(buf.capacity()); //용량
		buf.ensureCapacity(100); //100만큼 증가 //용량을 증가시키는 메소드
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! " ); //삽입 변경 가능
		buf.insert(14, "Everybody^^");
		System.out.println(buf);
		buf.delete(0, 4); //hi 지워짐
		System.out.println(buf);//지우는것도 가능
		

	}

}
