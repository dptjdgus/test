package name;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		// key ��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� HasMap ��ü ����
		HashMap<Key,String> hashMap =new HashMap<Key,String>();
		
		//�ĺ�Ű(hashcode)�� put���� �Է�
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��
		String value=hashMap.get(new Key(1));
		System.out.println(value);
		

	}

}
