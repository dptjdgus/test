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
	//부모 객체와 자식객체가 형성되어서 형변환이 가능한지 판단
	  if(obj instanceof Key) {
		//다운 캐스팅으로 obj가 key 클래스의 comparekey로 대입
		Key comparekey=(Key)obj;
		// this의 number와 comparekey와 number 값이 같으면 true 아니면 false
		if(this.number==comparekey.number) {
			return true;
		} 
	  }
	  return false;
	}
	
}
