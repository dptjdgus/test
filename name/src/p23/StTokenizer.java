package p23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		String str="Have a Nice Day";
		// StringTokenizer
		// (�ڸ��� ���� ���ڿ�,�ڸ��� ������ ����,�ڸ��� ������ ������ ����)
		
		
		StringTokenizer obj=new StringTokenizer(str," ",false);
		// StringTokenizer.hasMoreToken() - Token�� ����Ǿ� �ִ� �迭
		while(obj.hasMoreTokens()) { // ����Ȱ� �ִٸ� 
		
		String t=obj.nextToken(); // �޾Ƽ�
		System.out.println(t); //���
		}
	}

}
