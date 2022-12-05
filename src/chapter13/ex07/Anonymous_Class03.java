package chapter13.ex07;
//인터페이스를 출력하는 4가지 방법

//세번째. 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스가 없는 경우, 메소드의 인풋매개변수를 인터페이스로 설정
//	- 인터페이스를 전송 후 출력

//인터페이스
interface A {
	void abc();
}

class C {
	//메소드의 인풋매개변수의 타입이 인터페이스 A
	void cde(A a) {
		a.abc();
	}
}


public class Anonymous_Class03 {

	public static void main(String[] args) {
		
		C c = new C();
		
		//인터페이스를 구현한 클래스(x), 참조변수 생성 후 참조변수를 매개변수로 입력 후 출력
			//참조 변수 생성 : 인터페이스를 구현한 클래스를 생성
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("세번째. 참조변수를 사용해서 메소드 매개변수로 입력후 출력");
			}
		};
		
		//c 객체의 cde객체의 매개변수로 A타입의 a객체를 매개변수로 던짐
		c.cde(a);
		
		System.out.println("=====================");
//네번째. 인터페이스를 구현한 클래스(x), 참조변수생성(x) 제일 많이쓰는 방법
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("세번째. 참조변수를 사용해서 메소드 매개변수로 입력후 출력");
			}
		});
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("네번째");
			}
		});

	}

}
