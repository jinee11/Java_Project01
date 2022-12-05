package chapter12.ex06;


interface A { //인터페이스의 모든 필드와 메소드는 public키가 생략되어있다
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스가 추가됨
	//drfault 메소드 : 인터페이스 내에서 구현부가 있는 메소드,
		//모든 자식클래스에서 상속되어 내려감. 새로운 기능을 추가할때 자식클래스에서 오류 없이 기능 추가 가능
	default void cde() { //
		//default 메소드라서 기존 인터페이스를 구현한 자식 클래스에 오류가 사라졌다
		System.out.println("new 블루투스 기능 추가");
	} //2022년 새로운 기능 추가
	
	//추상메소드 : public abstract 키 생략됨 <= {실행부}가 없는 메소드
		//하위클래스에서는 선언만된 메소드를 구현해야할 의무가 있다
	void abc(); //2000년에 구현된 메소드
	void bcd(); //2005년에 구현된 메소드
}

class B implements A { //모든 클래스는 extends Object 생략되어 있다
	@Override
	public void abc() {
		System.out.println("와이파이 기능 1");
	}@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");
	}
	public void def() { 
		//중요! 자식클래스에서 인터페이스의 메소드 호출 : A(인터페이스명).super.메소드명
		//인터페이스의 메소드 호출 시 :
		A.super.cde(); //인터페이스 A의 cde() 메소드 호출
//		super.cde(); //!오류 Object 클래스의 cde()메소드 호출(없는 메소드)
		super.toString(); //Object 클래스의 toString() 호출(있는 메소드)
	}
}

public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식클래스에서 인터페이스에 구현된 default 메소드 호출시 : 
		
		//1. 객체 생성
		A a1 = new B();
		a1.abc(); //A 인터페이스의 존재함 - B클래스에서 오버라이딩
		a1.bcd(); //A 인터페이스의 존재함 - B클래스에서 오버라이딩
		a1.cde(); //A 인터페이스의 존재함 - default 메소드 오버라이딩안함
		
		System.out.println("====================");
		//a1을 B타입으로 다운캐스팅해야 def() 호출 가능
		
		B b1 = (B) a1;
		b1.def(); //A 인터페이스의 cde를 호출하도록 설정
		
	}

}
