package chapter10.ex03;

class A { //부모클래스 (super class)
	
	void print() {	//인스턴스 메소드 : 메소드 오버라이딩이 가능하다.
		System.out.println("A 클래스의 print()");
	}
}
class B extends A { //자식 클래스 (child class)
		//부모 클래스의 메소드를 제정의 하겠지만 이름은 그대로 쓰겠다
	@Override	// @ : 어노테이션(주석), @Override : 부모의 메소드를 재정의시 오류를 방지하는 어노테이션 선언
	void print() {
		System.out.println("B 클래스의 print()");
	}
}

public class Method_Overriding01 {

	public static void main(String[] args) {
		/*
		 Method Overloading : 동일한 이름의 메소드를 시그니처에 따라서 다르게 식별(메소드,생성자)
		 	-시그니처 : 인풋 매개변수의 갯수,타입을 식별 (상속과 상관없다)
		 Method Overriding  : 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용하는 것
		 	<인스턴스 메소드>
		 */
		
		//1. A타입 - A 생성자 호출
		A aa = new A();
		aa.print();	//A클래스의 메소드 호출
		
		//2. B타입 - B 생성자 호출
		B bb = new B();
		bb.print(); //B클래스의 메소드 호출
		
		//3. !! A타입 - B 생성자 호출 !! 많이 쓴다 중요
		A ab = new B();
		ab.print(); //B클래스의 메소드 호출(객체의 타입인 A의 메소드가 아닌 오버라이딩된 B의 메소드 호출)
		/*
		 타입은 A지만 객체는 B라서...몰라 이해안됨 여튼 이름이 같아서 덮어쓴 B클래스 메소드 호출
		오버라이딩으로 print 메소드는 같은 공간에 오버라이딩으로 A클래스의 print위에 B클래스의 print가 덮어썼고
		타입은 A지만 객체는 B로 만들어서 메소드 호출시 B클래스의 메소드가 호출됨 몰라 ㅜ 여튼 이게 오버라이딩...
		아 알겠다
		그냥 간단하게 타입 객체가 동일하면 상관없지만 타입과 객체가 다르면
		객체를 기준으로 오버라이딩된 메소드가 출력된다고 생각하자
		아니다 호출 했는데 A타입 메소드가 먼저 호출됐지만 B의 객체가 뒤에 호출되서 B의 메서드가 오버라이딩되서 덮어썼다고 생각...
		
		*/
		

	}

}
