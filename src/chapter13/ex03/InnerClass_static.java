package chapter13.ex03;

/*
   static Inner Class : 외부클래스의 인스턴스필드, 인스턴스메소드는 static inner class 블락에 올 수 없다.
    - 외부클래스의 정적 필드, 정적 메소드만 올 수 있다.
    
    인스턴스 필드, 인스턴스 메소드는 객체 생성후에 사용 가능
    정적 필드, 정적 메소드는 객체 생성 없이 사용가능, 객체 생성 이후에도 사용가능
 */

class A { //외부클래스
	//외부 클래스에서 필드 선언
	int a = 3; //인스턴스 필드
	static int b = 4; //정적 필드
	
	//외부 클래스에서 메소드 선언
	void method1() { //인스턴스 메소드
		System.out.println("외부 인스턴스 메소드");
	}
	static void method2() { //정적 메소드
		System.out.println("외부 정적 메소드");
	}
	
	static class B { //내부정적클래스 //정적 필드, 정적 메소드만 포함할 수 있다
		void bcd() {
			//1.외부클래스의 인스턴스 필드와 메소드 : 접근 불가
//			System.out.println(a); //오류!a는 외부 인스턴스필드
			System.out.println(b); //외부 정적필드 접근가능 //4
			
//			method1(); //오류! 외부 인스턴스메소드
			method2(); //외부 정적메소드 접근가능
		}
	}
}

public class InnerClass_static {

	public static void main(String[] args) {
		// static 이너 클래스의 객체 생성 : 외부 객체를 생성하지 않고 바로 내부 객체 생성 가능
		
		//1. static 이너 클래스의 객체 생성
		A.B b = new A.B();
		b.bcd();
		
	}

}
