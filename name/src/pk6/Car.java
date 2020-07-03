package pk6;

public class Car {
    //필드(멤버변수) 
	String company="현대자동차"; // 필드를 초기화 해놓는 이유. 1.클래스를 참조해서 빨리빨리 불러올려고  2. 중복될리가 없음
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){ // 생성자가 4개니 똑같은 클래스가 4개 인것처럼 확장
		
	}
	Car(String model){
		this.model=model;
	}
    Car(String model, String color){
    	this.model=model;
    	this.color=color;
    }
    Car(String model, String color,int maxSpeed){
    	this.model=model;
    	this.color=color;
    	this.maxSpeed=maxSpeed;
    }
    //메소드

}
