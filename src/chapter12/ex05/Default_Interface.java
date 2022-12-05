package chapter12.ex05;

interface A { //인터페이스의 모든 필드와 메소드는 public키가 생략되어있다
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스가 추가됨
	default void cde() { //
		//default 메소드라서 기존 인터페이스를 구현한 하위 클래스에 오류가 사라졌다
		System.out.println("new 블루투스 기능 추가");
	} //2022년 새로운 기능 추가
	void abc(); //2000년에 구현된 메소드(추상)
	void bcd(); //2005년에 구현된 메소드(추상)
}

//설정 : interface A를 구현한 클래스가 1000개 존재한다.

class Aa implements A {
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 1");
	}@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 2");
	}
}
class Aaa implements A {
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 3");
	}@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 4");
	}
}

class Aaaa implements A {
	@Override
	public void abc() {
		System.out.println("와이파이 기능 구현 5");
	}@Override
	public void bcd() {
		System.out.println("와이파이 기능 구현 6");
	}
	
	//default() 오버라이딩 가능하다
	@Override
	public void cde() {
		System.out.println("A 인터페이스의 default 메소드 오버라이딩");
	}
}

public class Default_Interface {

	public static void main(String[] args) {
		/*
		 interface : 인터페이스의 모든 필드와 메소드는 public키가 생략되어있다
		 	- 모든 필드는 public static final
		 	- 모든 메소드는 추상 메소드 여야한다 : public abstract
		 		! 예외 : 1.8버전부터 새로운 기능이 추가 -> default, static 메소드가 추가됨
		 			ㄴ 인터페이스에서 구현부가 있는 메소드(default, static 키가 들어간 메소드)
		 	- ! 구현된 클래스에서 오버라이딩을 할때 반드시 public키를 넣어야한다
		 	- 인터페이스는 객체화 할 수 없지만 구현한 클래스를 객체화해서 타입 지정은 가능하다
		 	 
		 	 *1.8ver
		 	default : 인터페이스에서 구현부가 있는 메소드
		 	 쓰는이유 - 기존 인터페이스에 새로운 기능을 추가할때 하위의 구현된 클래스에 오류없이 적용 가능하다
		 		- 인터페이스를 구현한 모든 클래스에 상속되어 적용
		 		- 오버라이딩도 가능
		 */
		
		//1. 인터페이스를 구현한 클래스를 객체화해서 타입으로 인터페이스 A를 지정한다
		A a1 = new Aa();
		A a2 = new Aaa();
		A a3 = new Aaaa();
		
		//2. 인터페이스의 메소드 호출 ==> 오버라이딩된 메소드가 덮어쓰기되서 호출
		a1.abc(); //오버라이딩
		a1.bcd(); //오버라이딩
		a1.cde(); //default 메소드(오버라이딩 안함)
		
		System.out.println("===========================");
		a2.abc(); //a1과 모두 동일
		a2.bcd();
		a2.cde();
		
		System.out.println("===============================");
		a3.abc(); //오버라이딩
		a3.bcd(); //오버라이딩
		a3.cde(); //default 메소드 오버라이딩
		
	}

}
