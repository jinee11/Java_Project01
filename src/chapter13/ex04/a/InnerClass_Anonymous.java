package chapter13.ex04.a;

class A { //아웃터클래스
	int a = 3; //필드
	
	//지역 이너클래스는 메소드 내부에서 객체 생성하고 객체의 내부 메소드 호출한다
	void abc() {//외부클래스의 메소드
		int b = 5; //지역 변수 : 메소드 실행시 만들어지고 메소드가 블락이 끝나면 없어짐
			//메소드 내부의 지역변수가 지역 이너클래스에서 사용될 경우 상수로 바뀐다 final
		
		class B { //지역 이너클래스 : 메소드 내부에 존재하는 클래스
			void cde() {
				System.out.println(a); //3
				System.out.println(b); //5 <= 상수로 변경됨 : 값 수정 불가
				
				a = 10;
//				b = 20; //!오류 상수가 되서 값 수정 불가(final키 자동 등록)
				System.out.println(a); //10
				System.out.println(b); //5(그대로)
				
			}
		}
		
		B b1 = new B();
		b1.cde();
	}
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		// 객체 생성 후 지역 이너클래스 출력
		//1. 외부 객체 생성 
		A a = new A();
		a.abc(); //메소드 호출시 내부 객체생성/내부 객체의 메소드 호출

	}

}
