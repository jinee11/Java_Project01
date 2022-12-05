package chapter12.ex06.a;

/*자식 클래스에서 인터페이스의 메소드 호출을 한다는 의미 :
  - 인터페이스의 default, static 메소드 호출 : 인터페이스 내에서 기능이 구현된 메소드 호출
*/

interface A { //인터페이스 : 추상 메소드만 존재해야함(예외: default(), static())
	default void abc1() {
		System.out.println("A 인터페이스의 default()");
	}
}
interface B {
	default void abc2() {
		System.out.println("B 인터페이스의 default()");
	}
}

class C { //일반 클래스 : 일반메소드 or 일반필드
	C (){}
	void cde() {
		System.out.println("일반 클래스 C의 일반 메소드");
	}
}

//C를 부모로 두고 인터페이스 A,B를 구현하고 있다
class D extends C implements A, B {
	//오류 난 이유 : 인터페이스 A와 B의 메소드 이름이 동일해서
	
	//부모의 메소드 호출
		// super : 클래스의 부모 메소드 호출
		// 인터페이스명.super : 클래스의 상속된 인터페이스의 메소드 호출
	void hij () {
		super.cde();//부모 클래스 C의 cde() 호출
	}
	void lmn () {
		A.super.abc1(); //상속된 인터페이스 abc1() 호출
		B.super.abc2(); //
	}
}

public class Interface_Super_Use02 {

	public static void main(String[] args) {
		// 객체 생성 후 확인
		D d1 = new D();
		
		d1.hij(); //클래스의 메소드 호출
		d1.lmn(); //인터페이스의 페소드 호출

	}

}
