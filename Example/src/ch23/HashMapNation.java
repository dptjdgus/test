package ch23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
	 
	  HashMap<String, Integer> nations=new HashMap<String, Integer>();
	  Scanner scanner=new Scanner(System.in);
	  //�Էº�
	  while(true) {//"�׸�" �Է� �ɶ����� �Է��� �ݺ�
		  System.out.println("���� �̸�, �α� >>"); //korea 5000
		  String nation=scanner.next();
		  if(nation.equals("�׸�")) {
			  break;
		  }
	     int population=scanner.nextInt();
	     nations.put(nation,population);
	  }
	  
	  //�α��˻���
	  while(true) {
		  System.out.println("�α� �˻��� ������� �Է��ϼ���  >>");
		  String nation=scanner.next();
		  if(nation.equals("�׸�")) {
			  break;
		  }
		  Integer population=nations.get(nation);
		  if(population==null) {
			  System.out.println(nation+"�׷� ����� �����ϴ�.");
		  }
		  else {
			  System.out.println(nation+"�� �α���"+population);
		  }
	  }
	  scanner.close(); //scanner �ϰ� close��..
		
	
		
	}
}
