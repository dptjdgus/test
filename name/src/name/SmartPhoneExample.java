package name;

public class SmartPhoneExample {

	public static void main(String[] args) {
		Smartphone myPhone1; // �̷��Ը� �ص� ��ü�� ������� �� new �� ������ �ʾƵ�
		
		Smartphone myPhone=new Smartphone("�Ｚ","�ȵ���̵�");
		
        //System.out.println(myPhone); //hashcode
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
	
	}

}
