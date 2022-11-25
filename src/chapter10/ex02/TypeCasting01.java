package chapter10.ex02;

class Animal {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal {
	
	String tigerSound;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}
class TigerChild extends Tiger {
	
	String tigerChildSound;
	void tigerChildEat() {
		System.out.println("새끼 호랑이는 젓을 먹습니다.");
	}
}

public class TypeCasting01 {

	public static void main(String[] args) {
		// TypeCasting (형 변환) :
		
		System.out.println("===== 업 캐스팅 ===========");
		
		//1. 업 캐스팅 (자동) : Tiger(자식)객체 생성 ==> Animal(부모)타입
		// 자식 객체를 생성해서 부모 타입으로 정의, 자동으로 일어남
			// a1 = Tiger 필드, 메소드 + Animal 필드,메소드를 포함하고 있음
		// 업캐스팅을 하면 a1에는 ! Animal 필드,메소드만 사용 가능
		
		Animal a1 = new Tiger(); //<- Tiger 객체를 생성해서 Animal 타입으로 지정
		  // = 타이거는 동물이다...대충 이렇게 이해
		
		//a1은 Animal 타입의 필드와 메소드만 사용 가능
		a1.name = "호랑이 업";
		a1.age = 10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		a1.eat();
		
		System.out.println("===== 다운 캐스팅 ===========");
		
		//2. 다운 캐스팅 (수동) : Animal(부모타입) --> Tiger(자식타입)으로 변환
			// a1 = Tiger 필드, 메소드 + Animal 필드,메소드를 포함하고 있음
			// a1 : Animal 타입 --> t2 : Tiger 타입으로 다운 캐스팅
		
		Tiger t2 = (Tiger) a1; //Animal타입의 a1을 t2의 Tiger타입으로 다운캐스팅 명시
		//t2는 Animal과 Tiger의 필드와 메소드를 모두 사용가능
			
		//Animal 의 필드와 메소드
		t2.name = "호랑이2 다운";
		t2.age = 5;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.eat();
		
		//Tiger 의 필드와 메소드도 접근가능
		t2.tigerSound = "어흥";
		System.out.println(t2.tigerSound);
		t2.tigerEat();
		
		System.out.println("======================");
		
		//3. Tiger 타입으로 Tiger 객체 생성
			//Animal, Tiger의 필드와 메소드 모두 접근 가능
		//t3 : Animal, Tiger 모두 내포
		Tiger t3 = new Tiger();
		
		
		//다운 캐스팅 오류.. t3 에는 TigerChild 클래스가 내포하고 있지 않기 때문에
			//오류! : 실행시 오류
//		TigerChild t4 = (TigerChild) t3;
		
		System.out.println("==== instanceof 출력 ======");
		//t3에 Animal을 가지고 있는지
		System.out.println(t3 instanceof Animal); //true
		System.out.println(t3 instanceof Tiger); //true
		System.out.println(t3 instanceof TigerChild); //false
		
		//다운 캐스팅은 반드시 확인하고 해야함 //다운캐스팅할때 반드시 instanceof 사용
		TigerChild t4 = null; //블락 밖에서 캐스팅할 변수 선언, 객체 초기화
		if (t3 instanceof TigerChild) { //t3에 TigerChild가 포함되어있는지 확인
			t4 = (TigerChild) t3; //true면 다운캐스팅 실행
		}
		
		System.out.println("===== 업캐스팅 ==============");
		
		//1. 업캐스팅 : a3 <- Animal, Tiger, TigerChild
			//Animal 타입의 필드와 메소드만 접근가능
		Animal a3 = new TigerChild();
		System.out.println(a3 instanceof Animal); //true
		System.out.println(a3 instanceof Tiger); //true
		System.out.println(a3 instanceof TigerChild); //true
		
		//a3 <- Animal 의 필드와 메소드만 접근가능
		a3.name = "호랑이4 업";
		a3.age = 7;
		System.out.println(a3.name);
		System.out.println(a3.age);
		a3.eat();
		
		System.out.println("======= 다운 캐스팅 =============");
		// 2. 다운캐스팅 : a3를 Tiger 타입으로
		Tiger t5 = null; //블락 밖에서 캐스팅할 변수 선언, 객체 초기화
		if(a3 instanceof Tiger) {
			 t5 = (Tiger) a3;
		}
		
		//Animal
		t5.age = 10;
		System.out.println(t5.age);
		t5.name = "호랑이5 다운";
		System.out.println(t5.name);
		
		//Tiger
		t5.tigerSound = "어훙";
		System.out.println(t5.tigerSound);
		
		System.out.println("======= 다운 캐스팅 =============");
		//3. 다운 캐스팅 : a3를 TigerChild 타입으로
		
		TigerChild t6 = null;
		if (a3 instanceof TigerChild) {
			t6 = (TigerChild) a3;
		}
		
		//t6 : TigerChild 타입(Animal,Tiger,TigerChild의 필드,메소드 모두 사용가능
		t6.age = 2;	//Animal
		t6.tigerSound = "어흥어응"; //Tiger
		t6.tigerChildSound = "어흥어흥어흥"; //TigerChild
		
		//4. 업캐스팅 : t6 (TigerChild) --> (Animal), (Tiger)타입으로
		
		Animal t7 = t6; //t7 <- Animal,Tiger,TigerChild 내포하지만 Animal만 사용가능
		Tiger t8 = t6; //t8 <- Animal,Tiger,TigerChild 내포하지만 Animal, Tiger만 사용가능
		
	}

}
