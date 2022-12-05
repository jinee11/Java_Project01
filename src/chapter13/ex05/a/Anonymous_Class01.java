package chapter13.ex05.a;

//인터페페이스를 상속한 이너클래스를 출력하는 4가지 방법

//첫번째. 인터페이스를 구현한 클래스를 생성 후 출력 <= 빈번하게 사용되는 경우

interface A {
	void cry();
	void fly();
}

class B {
	
	A a1 = new C();
	void abc() {
		a1.cry();
		a1.fly();
	}
	
	//이너클래스: 외부파일에 별도로 생성하지 않고 클래스 내부에 생성 후 바로 사용
	class C implements A {
		@Override
		public void cry() {
			System.out.println("운다");
		}@Override
		public void fly() {
			System.out.println("난다");
		}
	}
}

public class Anonymous_Class01 {

	public static void main(String[] args) {
		// B클래스의 abc()메소드를 호출했을때 이너클래스 C의 구현된 메소드 출력
		B b1 = new B();
		b1.abc();

	}

}
