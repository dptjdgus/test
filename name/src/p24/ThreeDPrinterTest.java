package p24;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreePrinter printer=new ThreePrinter();
		
		Powder p1=new Powder();
		printer.setMaterial(p1);
		//�ٿ� ĳ����
		Powder p2=(Powder)printer.getMaterial();
		
	}

}
