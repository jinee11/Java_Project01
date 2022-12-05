package chapter13.ex06;
//인터페이스를 출력하는 4가지 방법

//두번째. 인터페이스를 구현한 클래스를 생성하지 않고 출력하는 경우
	//익명 클래스 사용

interface C {
	void bcd();
}

class A {
	
	//익명 클래스 //원래 인터페이스를 객체로 생성한다는건 말이 안되는 코드
		C c = new C() {
			@Override
			public void bcd() {
				System.out.println("익명클래스를 사용해서 출력");
			}
		};
		
		void abc() {
			c.bcd();
		}
	
}

public class Anonymous_Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		A a = new A();
		a.abc(); //인터페이스 bcd()호출 <- 익명 이너클래스에서 오버라이딩된 내용 덮어써서 출력

	}

}
