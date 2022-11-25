package chapter10.ex07;

class A {
	A() {System.out.println("A 생성자");}
}
class B extends A {
	B() {
//		super(); //생략되어있다...컴파일러가 자동으로 추가
		System.out.println("B 생성자");
	}
}
class C {
	C(int a) {
		System.out.println("C 생성자");
	}
}
class D extends C {
		D() {super(3); //부모(C클래스) 생성자 매개변수에 3을 넣는다
		System.out.println("D 생성자");
		}
}
public class Super_Method {

	public static void main(String[] args) {
		// super method : 부모클래스의 생성자 호출시 사용
		//	- 자식 클래스 생성자는 기본적으로 super() 생략
		
		//1. A 객체 생성
		A aa = new A(); //A생성자
		
		System.out.println("================");
		
		//2. B 객체 생성
		B bb = new B(); //A생성자, B생성자 //상속관계라서 부모 메소드가 먼저 출력되고 자식 메소드 출력
		
		System.out.println("===============");
		
		//3. D 객체 생성
		D dd = new D(); //C생성자, D생성자 //상속관계...
		

	}

}
