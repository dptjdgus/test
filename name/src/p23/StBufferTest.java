package p23;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf=new StringBuffer("Nice Day! ");
		
		System.out.println(buf.toString()); //toString�� �̿��� ���
		System.out.println(buf.length());  //���ڿ� ũ��(����)
		System.out.println(buf.capacity()); //�뷮
		buf.ensureCapacity(100); //100��ŭ ���� //�뷮�� ������Ű�� �޼ҵ�
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! " ); //���� ���� ����
		buf.insert(14, "Everybody^^");
		System.out.println(buf);
		buf.delete(0, 4); //hi ������
		System.out.println(buf);//����°͵� ����
		

	}

}
