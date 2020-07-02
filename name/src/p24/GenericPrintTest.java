package p24;

public class GenericPrintTest {

	public static void main(String[] args) {
		//T타입의 객체는 모든 클래스에서 상속이 가능하여 자동으로 클래스로 형변환이 가능함
		
		GenericPrinter<Powder> PowderPrinter=new GenericPrinter<Powder>();
		PowderPrinter.setMaterial(new Powder());
	    Powder powder=PowderPrinter.getMaterial(); //형변환 하지 않음
	    System.out.println(PowderPrinter);
	    System.out.println(powder);
	    
	    //ThreePrintPlastic 제네릭을 안쓰면 이렇게 해서 클래스를 가지고 와야 한다. 
	    GenericPrinter<Plastic> plasticPrinter=new GenericPrinter<Plastic>();
	    plasticPrinter.setMaterial(new Plastic());
	    Plastic plastic=plasticPrinter.getMaterial(); //형변환 하지 않음
	    System.out.println(plasticPrinter);
	    System.out.println(plastic);
	    
//	    //물의 재료는 허용되서는 안되지만 제네릭의 특성상 허용하는 모순 발생
//	    GenericPrinter<Water> WaterPrinter=new GenericPrinter<Water>();
//	    WaterPrinter.setMaterial(new Water());
//	    Water water=WaterPrinter.getMaterial(); //형변환 하지 않음
//	    System.out.println(WaterPrinter);
//	    System.out.println(water);

	}

}
