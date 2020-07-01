package name;

public class Key {
   
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	@Override
	public int hashCode() {
	    return number;
		
	}
	@Override
	public boolean equals(Object obj) {
	//�θ� ��ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
	  if(obj instanceof Key) {
		//�ٿ� ĳ�������� obj�� key Ŭ������ comparekey�� ����
		Key comparekey=(Key)obj;
		// this�� number�� comparekey�� number ���� ������ true �ƴϸ� false
		if(this.number==comparekey.number) {
			return true;
		} 
	  }
	  return false;
	}
	
}
