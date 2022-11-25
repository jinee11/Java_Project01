package chapter07.ex04;

class A{
	//필드 : 인스터드 필드(객체를 생성해야 호출), static 필드(객체생성x클래스명으로 호출)
	int m;
	//기본생성자 생략 : 다른 생성자가 없을시 생략
//	A(){}//기본생성자
	
	//메소드 
	void work() {
		System.out.println(m);	//기본값으로 : int 0 할당
	}
}
class B{
	int m ;
	B(){}	//기본 생성자 : 명시함
	void work() {
		System.out.println(m); //기본값으로 : int 0 할당
	}
}
class C{
	int m;
	//기본생성자 생략됨 : 인풋값이 없는 생성자
//	C(){} //기본 생성자 생성
	C(int m){	//생성자 : 인풋값을 1개를 받는 생성자
		this.m = m;	 //인풋 매개변수 ==> 실행블락의 변수 ==> 필드의 변수 이름이 모두 동일할 경우
	}			 //this <- 명시해야한다 자신의 객체를 필드
	void work() {
		System.out.println(m);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		// 생성자(constructor) : 객체를 생성할때 호출
			//리턴 없고 클래스 이름과 동일한 메소드
			//기본 생성자는 생략 가능 : A(){}, 클래스 내부에 다른 생성자가 존재할때
		
		//1. A 클래스의 객체를 생성하고 메소드 호출
		A a = new A(); //new 다음에 오는 A();는 기본생성자호출:생략되있는 기본생성자를 호출하는것
		a.work(); //출력
		
		//2. B 클래스 : 기본생성자가 명시
		B b = new B();
		b.work();
		
		//3. C 클래스 : 기본생성자 생략, 인풋값 1개 받는 생성자 존재
//		C c = new C(); //오류발생! 클래스내에 다른생성자가 존재하는데 기본생성자를 생략해서
		C c1 = new C(3); //정수가 하나 들어간 생성자 호출
		c1.work();
		
		
		

	}

}
