package Chapter22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap: Key ���� �ָ� value���� ��ȯ���ִ� �޼ҵ�
		HashMap<Key, String> hashmap=new HashMap<Key, String>();//<Key, String> �� Key�� Ŭ����
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		hashmap.put(new Key(1), "ȫ�浿"); //put���� HashMap(Key,String)���� ���� �־���
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		String value=hashmap.get(new Key(1)); // �ش� HashMap�� �ִ� new Key(1), "ȫ�浿"�� get���� �ҷ��� �׷��� ���⼱ new Key(1)���� �ҷ����� 
		                                      // ȫ�浿�� ���� ������ �� �̰� value���� �־��ְ� �̰� �������
		System.out.println(value);
		
	}

}
