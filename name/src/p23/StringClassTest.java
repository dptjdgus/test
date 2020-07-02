package p23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons=strClass.getConstructors(); //»ý¼ºÀÚ¸¸ »Ì¾Æ¼­ º¸¿©ÁÜ
		for(Constructor i:cons) {
			System.out.println(i);
		}
	    System.out.println();
	    
	    Method[] methods =strClass.getMethods();
	    for(Method i:methods) {
	    	System.out.println(i);	
	    }
	    System.out.println();
	    
	    Field[] fields=strClass.getFields();
	    for(Field f: fields) {
	    	System.out.println(f);
	    	
	    }
	}
}
