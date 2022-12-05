package chapter12.ex01;

//추상메소드를 구현하는 방법 2가지
	//1. 자식클래스에서 구현한 클래스를 생성하고 출력 : 매번 자주 사용해야하는 경우
		// - 출력코드가 간결하다. 구현한 클래스를 생성해야한다.
	//2. 익명클래스를 생성해서 출력 : 한번 사용하고 버릴 경우 - 안드로이드 폰 개발할때, 이벤트 처리할때 사용
		// - 추상클래스의 구현한 자식 클래스 생성없이 바로 사용 가능,
		// - 여러번 사용할때는 구현한 코드를 매번 생성해야 한다.

//1 - 1 첫번째 방법 : 추상클래스 (A) <== 구현한 클래스 (B)
abstract class A { //추.클
	abstract void cru();
}

//구현 클래스를 생성 : 

class B extends A { //1 - 2 첫번째 방법. 자식클래스에서 추상클래스의 메소드를 구현한 클래스를 생성
	@Override
	void cru() {
		System.out.println("모든 동물은 웁니다.(자식클래스에서 추상메소드 완성)");
	}
}

//2 - 1 두번째 방법 : 추상클래스를 구현한 클래스 없이 바로 출력
abstract class C { // 2 - 2 두번째 방법. 익명클래스를 사용해서 출력
	abstract void run();
}

public class Abstract_Class02 {

	public static void main(String[] args) {
		
		//추상클래스는 객체화 할 수 없다. 타입으로 지정은 가능하다.
//		A a = new A(); //추상클래스 : 객체생성 불가능
		
		// 첫번째 방법 : A(추.클) <-- B(구.클)
		A a1 = new B();
		a1.cru();
		
		A a2 = new B();
		a2.cru();
		
		//두번째 방법 : 구현클래스 없이 바로 출력(익명클래스), C는 추.클이라서 객체화 불가
		 //익명 클래스 만들기
		C c1 = new C() {
			//C <- 추.클의 구현되지 않은 메소드를 구현하는 블락
			@Override
			void run() {//추.메 오버라이딩
				System.out.println("미완성=>완성 (익명클래스에서 메소드 구현");
			}
		};
		
		c1.run();
		
		C c2 = new C() {
			@Override
			void run() {
				System.out.println("미완성2=>완성2(익명)");
			}
		};

		c2.run();
		
	}

}
