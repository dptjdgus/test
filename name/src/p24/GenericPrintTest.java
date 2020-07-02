package p24;

public class GenericPrintTest {

	public static void main(String[] args) {
		//TŸ���� ��ü�� ��� Ŭ�������� ����� �����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������
		
		GenericPrinter<Powder> PowderPrinter=new GenericPrinter<Powder>();
		PowderPrinter.setMaterial(new Powder());
	    Powder powder=PowderPrinter.getMaterial(); //����ȯ ���� ����
	    System.out.println(PowderPrinter);
	    System.out.println(powder);
	    
	    //ThreePrintPlastic ���׸��� �Ⱦ��� �̷��� �ؼ� Ŭ������ ������ �;� �Ѵ�. 
	    GenericPrinter<Plastic> plasticPrinter=new GenericPrinter<Plastic>();
	    plasticPrinter.setMaterial(new Plastic());
	    Plastic plastic=plasticPrinter.getMaterial(); //����ȯ ���� ����
	    System.out.println(plasticPrinter);
	    System.out.println(plastic);
	    
//	    //���� ���� ���Ǽ��� �ȵ����� ���׸��� Ư���� ����ϴ� ��� �߻�
//	    GenericPrinter<Water> WaterPrinter=new GenericPrinter<Water>();
//	    WaterPrinter.setMaterial(new Water());
//	    Water water=WaterPrinter.getMaterial(); //����ȯ ���� ����
//	    System.out.println(WaterPrinter);
//	    System.out.println(water);

	}

}
