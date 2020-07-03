package ch23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
	 
	  HashMap<String, Integer> nations=new HashMap<String, Integer>();
	  Scanner scanner=new Scanner(System.in);
	  //입력부
	  while(true) {//"그만" 입력 될때까지 입력을 반복
		  System.out.println("나라 이름, 인구 >>"); //korea 5000
		  String nation=scanner.next();
		  if(nation.equals("그만")) {
			  break;
		  }
	     int population=scanner.nextInt();
	     nations.put(nation,population);
	  }
	  
	  //인구검색부
	  while(true) {
		  System.out.println("인구 검색할 나라명을 입력하세요  >>");
		  String nation=scanner.next();
		  if(nation.equals("그만")) {
			  break;
		  }
		  Integer population=nations.get(nation);
		  if(population==null) {
			  System.out.println(nation+"그런 나라는 없습니다.");
		  }
		  else {
			  System.out.println(nation+"의 인구는"+population);
		  }
	  }
	  scanner.close(); //scanner 하고 close함..
		
	
		
	}
}
