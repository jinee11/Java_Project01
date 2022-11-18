package chapter07;

class A {	//A클래스 : 객체를 생성하기 위한 틀
	
	//필드 : 객체를 생성시 heap 영역에 필드의 값이 저장됨
		//heap 변수[필드]의 값이 비어있을 경우 강제 초기화 
	int a;			//0
	boolean b;		//false
	double c;		//0.0
	String d;		//null(공백)
	
	//생성자 : A(){} 	:기본 생성자 생략됨
	
	//필드의 기본값을 출력하는 메소드
	void defaultValue () { //메인 메소드에서 출력하기 위해서
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B {
	
	//필드 선언 heap
	int m = 3;
	int n = 4;
	
	//기본생성자 생략됨 : B(){}
	
	//메소드 선언
	void work1() {
		int k = 5;	//지역변수 : stack 
		System.out.println(k); //5
		work2(3); //같은 클래스 블락안의 메소드 호출하는데 매개변수에 3을 넣어서
	}
	
	void work2 (int i) {//인풋 매개변수 i에 3값이 인풋 =3
		int j = 4;	//지역변수
		System.out.println(i+j);//3+4 = 7
	}
}

public class Field_Component {

	public static void main(String[] args) {
		// 클래스 내부 구성요소. 4가지
		//1.Field : 필드
		//2.Method :메소드
		//3.Constructor : 생성자
		
		//메소드 내부에서 선언된 변수의 값은 stack
		int e; // 메소드 내부에서 선언된 변수는 stack에 변수와 값이 저장됨
		
		//객체 생성
		A abc = new A();	//
		
		abc.defaultValue(); //메소드 호출
		//0 false 0.0 null 출력
		
		System.out.println("==========================");
		
		A bcd= new A();
		bcd.defaultValue();
		//동일
		
		System.out.println("==========================");
		B b = new B();
		
		b.work1(); //=5 7
	}

}
