package pk6;

public class CarExample {

	public static void main(String[] args) {
		Car car1=new Car(); //너는 카 소속의 자손임 car1 car클래스가서 일을 해
		//초기화된 필드지만 변경이 가능하다
		//car1.company="기아자동차"; //현대 자동차가 맘에 안들어 그럼 여기서 바꿀수 있음.. 
		
		System.out.println("---------필드 황용1-------------");
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		System.out.println("---------필드 황용2-------------");
		Car car2=new Car("소나타");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();
		
		System.out.println("---------필드 황용3-------------");
		Car car3=new Car("소나타","빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);//car2.model 를 여기다가 쓰면 소나타가 나옴 위에 언니가 먼저 썼으니
		System.out.println("car3.color: "+car3.color);
		System.out.println();
		
		System.out.println("---------필드 황용4-------------");
		Car car4=new Car("택시","검정",200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed); //car2.maxSpeed로 쓰면 쓸수는 있음 가족이니 하지만 값은 null값이 나옴
	}
}
