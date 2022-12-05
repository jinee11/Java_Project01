package chapter13.ex05;

//! 인터페이스를 출력하는 4가지 방법

//첫번째 방법 <== 빈번하게 사용될경우 쓰는 방법

interface C {
	//public abstract 생략됨
	void bcd();
}
class A {
	C c = new B(); //인터페이스C 타입 이너클래스B의 객체 생성
	void abc() { //A클래스의 abc()메소드에서
		c.bcd(); //C인터페이스의 bcd() 호출, 구현한 클래스 B의 메소드가 오버라이딩되어 덮어써짐
	}
	
	//이너클래스 : 인터페이스를 상속하는
	class B implements C{
		@Override
		public void bcd() {
			System.out.println("인스턴스 이너클래스 C");
		}
	}
}
public class AnonymousClass01 {
	public static void main(String[] args) {
		// 1. 객체 생성 후 메소드 호출
		
		A a = new A();
		a.abc(); //호출시 인터페이스의 구현한 클래스의 메소드 호출
	}
}
