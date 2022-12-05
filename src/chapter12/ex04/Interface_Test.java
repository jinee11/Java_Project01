package chapter12.ex04;

//인터페이스에서 선언된 메소드를 구현하는 방법 2가지
	// 1. 인터페이스에 선언된 메소드를 구현한 클래스를 생성 후 출력
		// - 매번 자주 사용하는 경우
	// 2. 익명 클래스로 바로 출력하는 방법
		// - 한번만 사용하고 버릴경우, 별도의 클래스를 생성하지 않고 바로 출력

//첫번째 방법
interface A {
	void abc();
}

//1 - 1. A 인터페이스의 메소드를 구현하는 클래스를 생성후 출력
class Aa implements A{
	@Override
	public void abc() {
		System.out.println("객체 생성 후 메소드 완성 : A인터페이스 Aa클래스");
	}
}

//두번째 방법
interface B {
	void bcd();
}

public class Interface_Test {

	public static void main(String[] args) {
		
		//1 - 2. A인터페이스의 선언된 메소드를 구현한 클래스(Aa)를 생성하여 출력
			// 매번 자주 사용 할 경우 구현된 자식 클래스를 생성 후 출력
		A a1 = new Aa();
		a1.abc();
		
		A a2 = new Aa();
		a2.abc();
		
		//2 - 1. 구현된 자식 클래스를 생성하지 않고 익명 클래스로 출력
//		B b1 = new B(); //오류! B는 인터페이스이므로 객체 생성 불가
		B b1 = new B() {
			@Override
			public void bcd() {
				System.out.println("B 인터페이스의 구현된 bcd()");
			}
		};
		
		b1.bcd();
		
		B b2 = new B() {
			@Override
			public void bcd() {
				System.out.println("객체생성없이 바로 오버라이딩됨");
			}
		};
		
		b2.bcd();
	}

}
