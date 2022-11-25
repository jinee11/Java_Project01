package chapter07.ex05;

class B {
	
	//1. 기본 생성자
	B() {
		System.out.println("기본 생성자를 호출 했습니다.");
	}
	B(int a) {
		this();	//반드시 생성자 내부의 첫라인에 위치
		//매개변수가 없는 생성자를 호출 (기본생성자 호출)
		System.out.println("매개변수가 하나인 생성자입니다.");
	}
	B(int a, int b){
		this(3);	//매개변수가 정수 1개인 생성자 호출
		System.out.println("매개변수가 정수 두개인 생성자 입니다.");
	}
	B(int a, int b, int c) {
		this (4, 5);
		System.out.println("매개변수가 정수 3개인 생성자 입니다");
	}
}

public class This_Method {

	public static void main(String[] args) {
		// This() <-메소드 : 자신의 객체의 다른 생성자를 호출할때 사용
			//반드시 생성자 내부에서만 사용
			//반드시 생성자 내부에 첫 라인에 위치해야한다.
		
		//1. 정수 1개인 생성자 호출
		System.out.println("=== 매개변수 1개인 생성자 호출======");
		B b1 = new B(3);//this()키로 기본생성자(부모)도 같이 호출
		
		System.out.println("====매개변수 2개인 생성자 호출===============");
		B b2 = new B(3,4);//this()키로 매개변수1개생성자, 기본생성자도 같이 호출...
		
		System.out.println("====매개변수 3개인 생성자 호출===============");
		B b3 = new B(3,4,5);
	}
}
