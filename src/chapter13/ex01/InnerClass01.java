package chapter13.ex01;

/*
  이너클래스(Inner Class) : 클래스 내부의 클래스
  	1. instance 이너클래스 : static키가 붙지 않은 내부 클래스
  		- 외부 클래스의 객체를 먼저 생성후에 사용이 가능
  	2. 정적(static) 이너클래스 : static키가 붙어있는 내부 클래스
  	3. 지역 이너클래스 : 메소드() {내부}에 선언된 이너클래스
  	
  이너클래스 특징(쓰는 이유) : 
  	1. Outer Class의 접근제어자의 제한없이 모두 접근 가능(필드,메소드)
  	2. 다른 객체를 외부에 생성하지 않고 내부에 객체를 만들어서 빠르게 사용하기 위해서
  		- 클래스의 필드와 메소드는 객체화해야 사용 가능하다
 */

class A { //outer class : 필드나 메소드에 접근제어자가 붙어 있고
			//inner 클래스 생성하면 아웃터클래스의 접근제어자 상관없이 접근 가능
	
	public int a = 3; //다른패키지에서도 접근가능 범위가 젤 넓다
	protected int b = 3; //다른패키지에서도 접근가능하지만 상속 관계 일때만
	int c = 5; //default 같은 패키지내에서만 접근가능
	private int d = 6; //같은 클래스에서만 접근가능
	
	void abc () {
		System.out.println("A클래스의 메소드 abc()");
	}
	
	//class B 내부에 outer class의 필드와 메소드를 활용해서 기능 구현을 함
	class B { //인스턴스 이너클래스
		void bcd() {
			//1. 아웃터클래스의 필드,메소드에 접근할때 접근제어자와 상관없이 모두 접근가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			abc();
		}
	}
}

public class InnerClass01 {

	public static void main(String[] args) {
		//이너클래스 사용 방법
		//1. 이너클래스를 사용하려면 아웃터클래스의 객체를 먼저 생성해야 한다.
		A a = new A(); //아웃터클래스 객체 생성
		
		//2. 이너클래스의 객체 생성
		
	//A.B: 외부클래스.내부클래스 : 내부클래스의 타입 
		A.B b = a.new B(); //b : 참조변수
	//a.new B(); : 외부인스턴스명.new 내부클래스생성자호출;
		b.bcd();
	}

}
