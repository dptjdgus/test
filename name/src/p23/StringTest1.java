package p23;

public class StringTest1 {

	public static void main(String[] args) {
		// ��ü �ν��Ͻ��� ���� heap�޸𸮿� �����
		String str1 =new String("abc"); 
		String str2 =new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)); //--> ������ �ٸ��� ������ ���� ����
		
		// ���ڿ��� ��������� ������ ������ ������ �ּҸ� ��� --> ���Ǯ�� ����
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4)); // ������ ������ �翬�� ������ ����

	}

}