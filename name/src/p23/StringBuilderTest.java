package p23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// immutable �Һ��Ǵ�
		String javaStr=new String("java");
		//ó�� ��ü�� �ν���ȭ�� �޸� ��
		System.out.println("javaStr�� ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		// String���κ��� StringBuilder�� ��ü�� ����
		StringBuilder buffer=new StringBuilder(javaStr);
		
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� Buffer�� �޸��� �ּ� :"+System.identityHashCode(buffer));
		
		buffer.append(" and "); //�߰��ϴ°� 
		buffer.append("android");
		buffer.append(" programming is fun!");
		
		System.out.println("���� �� Buffer�� �޸��� �ּ� :"+System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr.toString());
		System.out.println("���� ������� javaStr�� ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		
	}
}
