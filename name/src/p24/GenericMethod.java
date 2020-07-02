package p24;

public class GenericMethod { 

	public static<T,V> double makeRecrangle(Point <T,V> p1,Point <T,V> p2) {
		                                //      int x
		
		double left=((Number)p1.getX()).doubleValue(); //왼쪽 좌표 값을 가지고 옴 // 왼쪽 T값을 받음
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double button=((Number)p2.getY()).doubleValue();
		
		double width= right-left; // 10-0
		double height= button-top; //10.0-0
		
		return width*height;
	}
	
	
	public static void main(String[] args) {
		
		Point <Integer,Double> p1=new Point<Integer,Double>(0,0.0); //이렇게 써도 되고
		Point <Integer,Double> p2=new Point<>(10,10.0); // 이렇게 써도 된다
		
		double rect=GenericMethod.<Integer,Double>makeRecrangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
	}

}
