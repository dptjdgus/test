package Chapter22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap: Key 값을 주면 value값을 반환해주는 메소드
		HashMap<Key, String> hashmap=new HashMap<Key, String>();//<Key, String> 에 Key가 클래스
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashmap.put(new Key(1), "홍길동"); //put으로 HashMap(Key,String)값에 갑을 넣어줘
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		String value=hashmap.get(new Key(1)); // 해당 HashMap에 있는 new Key(1), "홍길동"을 get으로 불러와 그런데 여기선 new Key(1)값을 불러오니 
		                                      // 홍길동도 같이 가지고 와 이걸 value값에 넣어주고 이걸 출력해줘
		System.out.println(value);
		
	}

}
