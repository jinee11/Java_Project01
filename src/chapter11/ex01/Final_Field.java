package chapter11.ex01;

class A { //선언과 동시에 값을 할당
	int a = 3;	//필드 : 값을 수정할 수 있다
	final int b = 5; //상수 : 값을 수정 할 수 없다.
	
	A() {}
}

class B { //선언, 값 할당 분리
	int a ;	//필드 : 값을 수정할 수 있다
	final int b; //상수 : 값을 수정 할 수 없다.
	
	B () {
		a = 3;
		b = 5;
	}
}

class C {
	int a = 3;
	final int b = 5;
	C(){
		a = 7;
//		b = 10; //!오류발생 상수는 수정할 수 없다
	}
}

public class Final_Field {

	public static void main(String[] args) {
		// final modifier :
			//1. 필드 : 값을 수정하지 못하도록 [상수]
			//2. 메소드 : 자식클래스에서 overriding 불가
			//3. 클래스 : 상속이 불가한 클래스
		
		A a1 = new A();
		
		//a : 필드 [변수] : 값을 수정 할 수 있다.
		//b : 상수 <- 값을 수정 할 수 없다.
		a1.a = 5;
//		a1.b = 6;//오류발생! 상수는 값을 수정할 수 없다.
		
		B b1 = new B(); //생성자 생성순간 생성자에 입력한 값이 필드에 할당
		b1.a = 10;
//		b1.b = 20;//오류발생! 상수는 값을 수정할 수 없다.

	}

}
