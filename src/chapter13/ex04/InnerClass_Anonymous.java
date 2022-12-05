package chapter13.ex04;

/*
  지역 이너클래스(Anonymous Inner Class) : 메소드 내부에 선언된 클래스 <=중요! 굉장히 많이 사용
	 - 메소드 내부의 필드를 이너클래스가 사용할 경우 final 키가 자동으로 할당(컴파일러에서 자동으로 할당)
 */

class A { //외부 클래스
	int a = 3;
	A(){}
	A(int a){ //생성자를 사용해서 필드의 값 할당
		this.a = a;
	} 
	public void setA (int a) { //setter를 사용해서 필드의 값 할당
		this.a = a;
	}
	
	//메소드
	void abc() { 
		
		int b = 5;
		
		class B { //지역 이너 클래스 : 메소드 내부에 선언된 클래스
					//메소드 abc() 호출시 작동되는 클래스므로 메소드 내부에서 객체를 생성해야함
			void bcd() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		
		B bb = new B(); //메소드 내부에서 지역 이너클래스 B 객체 생성 1 - 1
		bb.bcd(); //객체 생성후 메소드 호출 1 - 2
	}
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		// 1. 객체 생성 후 메소드 호출
		A a = new A(); //외부 클래스 객체 생성 1 - 3
		a.abc(); //메소드 호출시 지역 이너 클래스 B 객체 생성이 되고 B클래스의 메소드 bcd() 호출 1 - 4
	}

}
