package p24;

class MyArray{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
}

public class MyArryTest2 {

	public static void main(String[] args) {
		MyArray myArray1=new MyArray();
		myArray1.add(new String("test"));
		String str=(String)myArray1.get(0); // ��������ȯ
		System.out.println(str);
		
		
		MyArray myArray2=new MyArray();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0); // ��������ȯ
		System.out.println(num);
	}
}