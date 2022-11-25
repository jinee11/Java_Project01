package chapter10.ex04;
	//복습
class Animal {
	//Animal 필드
	String name;
	int age;
	
	//기본생성자가 생략되어있다 : Animal () {}
//	Animal () {}
//	
//	Animal (String name, int age){
//		this.name = name;
//		this.age = age;
//	}
	
	//Animal 메소드
	void cry() {
		System.out.println("Animal 클래스의 cry()");
	}
}
class Tiger extends Animal { //!오류발생 부모클래스에서 기본생성자를 생략해서
	//자식 클래스의 생성자에는 기본적으로 super()가 생략되어 있다.(부모클래스의 기본생성자)
	//부모에 다른 생성자가 있는데 기본 생성자가 생략되어있으면 자식클래스에서도 오류가 난다
	
	//기본생성자가 생략되어 있다 : Tiger(){}
	/*
	 Tiger(){
		super();
	}
	*/
	int tigerNo; //Tiger 필드
	
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("Tiger 클래스의 cry: 어흥");
	}
}
class Eagle extends Animal {
	int eagleNo;
	
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("Eagle 클래스의 cry : 짹짹");
	}
}
class TigerChild extends Tiger {
	int tigerChildNo;
	
	void tigerChildMethod() {
		System.out.println("TigerChild 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("TigerChild의 cry : 응애~");
	}
}

public class MethodOverriding_Test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속 관계에서 부모클래스의 메소드를 자식 클래스에서 재정의
		
		//1. 객체의 타입
		 //a1 : Animal 클래스 내포, Animal 접근가능
		Animal a1 = new Animal();
		a1.name = "동물이름";
		a1.age = 10;
		a1.cry();
		
		System.out.println("=========================");
		//2. Tiger 객체를 생성하면서 Tiger 타입으로 지정
		 //t1 : Animal, Tiger 클래스 내포, 둘다 접근 가능
		Tiger t1 = new Tiger();
		
		//부모의 필드와 메소드 호출
		t1.name = "호랑이1";
		t1.age = 5;
		t1.cry(); //오버라이딩
		
		//Tiger 필드와 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		t1.cry(); //오버라이딩
		
		System.out.println("=====================");
		//3. Tiger 객체를 생성하면서 Animal 타입으로 지정
		 //a2 : Animal, Tiger 내포하면서 접근은 Animal만 가능
		Animal a2 = new Tiger();
		a2.name = "타입 Animal, 객체 Tiger";
		a2.age = 5;
		a2.cry(); //오버라이딩(타입은 Animal이지만 객체는 Tiger이라서 오버라이딩되서 호출된다)
					
		//다운 캐스팅 : Animal 타입 a2를 Tiger 타입으로 다운
		Tiger t2 = null;
		
		if (a2 instanceof TigerChild) {
			t2 = (TigerChild) a2;
		} else {
			System.out.println("a2에는 TigerChild를 내포하고 있지 않습니다.");
		}
		if (a2 instanceof Tiger) {
			t2 = (Tiger) a2;
			System.out.println("a2에는 Tiger를 내포하고 있습니다.");
		}
		
		t2.cry(); //
		
		System.out.println("======================");
		//3. TigerChild 객체를 생성하면서 Animal 타입으로 지정
		 //a4 : Animal, Tiger, TigerChil 내포, Animal 접근가능
		Animal a4 = new TigerChild();
		a4.cry(); //TigerChild 오버라이딩
		
		Tiger t10 = (Tiger) a4;
		t10.cry(); //TigerChild 오버라이딩
		//최초의 객체가 TigerChild라서 다 오버라이딩 되어있음
		//(덮어쓰기가 되있다는 말=포토샵으로 따지면 레이어가 젤 위에 있다)
		
		TigerChild tc10 = (TigerChild) t10;
		tc10.cry();
		
		//업캐스팅
		Animal a20 = tc10;
		a20.cry(); //TigerChil 오버라이딩
		
		System.out.println("======= 배열 ==============");
		
		//배열에 객체를 저장하고 값을 출력 하기 위한 객체 생성, Animal타입으로 지정
		Animal a29 = new Animal(); //A..
		Animal a30 = new Tiger(); //A,T.. A만 접근가능
		Animal a31 = new Eagle(); //A,E...A만 접근가능
		Animal a32 = new TigerChild(); //A,T,TC.. A만 접근가능
		
		//배열에 Animal 타입의 객체 저장
		Animal[] arr = new Animal[] {a29,a30,a31,a32};
		
		//배열의 값을 출력 index 0~3
		System.out.println("===Enhanced fog문===");
		for(Animal k : arr) {
			k.cry();//각 최초의 객체에 오버라이딩된 메소드 호출
		}
		
		System.out.println("===fog문 1 ===");
		//1. 배열의 값을 Animal 변수에 할당하고 출력
		for (int i = 0; i < arr.length ; i++) {
			Animal aa = arr[i]; //Animal타입의 변수aa에 arr[0~3]의 각방의 정보를 담는다
			aa.cry(); //각 최초의 객체에 오버라이딩된 메소드 호출
		}
		
		System.out.println("===fog문 2 ===");
		//2. 변수에 담지않고 바로 출력
		for (int i = 0; i < arr.length ; i++) {
			arr[i].cry(); //각 최초의 객체에 오버라이딩된 메소드 호출
		}
		
		System.out.println("===fog문 3 ===");
		//3. 객체 변수를 블락 밖에서 선언 후 출력
		Animal aaa = null;//Animal은 객체형 변수, 초기화할때 기본값 null 할당
		for (int i = 0 ; i < arr.length ; i++) {
			aaa = arr[i];
			aaa.cry();
		}
		System.out.println("==============");
		aaa.cry(); //마지막밖에 안나옴
		System.out.println("===Arrays.toString===");

	}

}
