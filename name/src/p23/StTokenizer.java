package p23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		String str="Have a Nice Day";
		// StringTokenizer
		// (자르고 싶은 문자열,자르는 기준의 집합,자르는 기준을 넣을지 말지)
		
		
		StringTokenizer obj=new StringTokenizer(str," ",false);
		// StringTokenizer.hasMoreToken() - Token이 저장되어 있는 배열
		while(obj.hasMoreTokens()) { // 저장된게 있다면 
		
		String t=obj.nextToken(); // 받아서
		System.out.println(t); //출력
		}
	}

}
