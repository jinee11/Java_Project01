package chapter10.ex08;

class A {
	A(){
		this(3); //자신의 객체의 매개변수 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	A(int a) {
		System.out.println("A 생성자 2(매개변수 정수 1개");
	}
}
class B extends A { //자식 클래스는 생성자 첫 라인에 super(),this()
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		//super();
		System.out.println("B 생성자 2(매개변수 정수1개)");
	}
}

public class Super_Method03 {

	public static void main(String[] args) {
		//
		
		//1. 객체 생성 후 출력
		A aa1 = new A(); //A생성자2,A생성자1
		//첫줄 this(3)부터 호출하기 때문에 생성자2가 먼저 출력
		
		System.out.println("=======================");
		
		//2.
		A aa2 = new A(3); //A생성자2
		//상속관계가 없는 그냥 A클래스의 메소드 출력
		
		System.out.println("======================");
		
		//3. B 생성자 호출
		B bb1 = new B(); //A생성자2,A생성자1,B생성자2,B생성자1
		// this(3)부터 호출하기 때문에 B생성자2에서 상속된 부모부터 출력 B생성자1이 꼴찌로 출력
		
		System.out.println("===============");
		
		B bb2 = new B(3); //A생성자2,A생성자1,B생성자2

	}

}
