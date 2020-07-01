package name;

class BK{
	int booknumber;
	String booktitle;

	BK(int booknumber,String booktitle){
		this.booknumber=booknumber;
		this.booktitle=booktitle;
	}
	@Override
	public String toString() {
		return booknumber+","+booktitle;
	}
	
}


public class ToStringEx2 {

	public static void main(String[] args) {
		
		BK book1 =new BK(200,"°³¹Ì");
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
