package chapter12.ex02;

interface A { //인터페이스 이름 : 첫자는 반드시 영문대문자 
//정식 표현
	//모든 필드 : public static final(생략)
	 //static : 객체 생성없이 호출 가능 (A.a로 가능)
	 //final : 상수(값을 수정할 수 없다)
	public static final int a = 3;
	
	//모든 메소드 : public abstract(생략)
	public abstract void abc(); 
}

//인터페이스의 구현되지 않는 메소드를 구현한 클래스
class Aa implements A { //인터페이스를 구현한 클래스
	
	@Override
	public void abc() {
		System.out.println("A 인터페이스를 구현한 메소드");
		
	}
}

//일반적인 표현, 축약표현 <== 주로사용
interface B {
	//public static final 생략
	int a = 3;
	
	//public abstract 생략
	void abc(); // 모든 메소드는 선언부만 있어야한다(예외:default,static)
}

class Bb implements B {
	
	@Override
	public void abc() { //!오류발생 : 접근제어자가 생략되있어서
				//(인터페이스 메소드가 public라서 오버라이드하려면 defaule가 아니라 public여야한다) 
		System.out.println("B 인터페이스를 구현한 메소드");
	}
}

//추상클래스 : 추상클래스내에 추상 메소드는 abstract 키를 생략하면 안된다
abstract class C {
	
	int m = 4; //일반 인스턴스 필드 : 수정가능
	
	void bcd() {//일반 인스턴스 메소드(구현부가 있는)
		System.out.println("추상메소드 C 클래스의 메소드");
	} 
	
	//추상 메소드는 abstract 키를 생략할 수 없다
	abstract void abc();
	
}

class Cc extends C {
	@Override
	void abc() {
		System.out.println("추상클래스 C를 구현한 메소드: Cc클래스의 오버라이딩된 메소드");
	}
}

public class Interface01 {

	public static void main(String[] args) {
		/*
		 인터페이스 : 내부와 외부를 연결시켜주는 접점 ex)콘센트
		 	- 객체 생성 불가. 타입으로 지정은 가능
		 	- 인터페이스의 !모든 필드는 public static final 생락됨
		 		: final이라서 값을 수정 할 수 없다.
		 	- !모든 메소드는 public abstract 생략됨 (예외: default, static 메소드 <- 1.8 버전)
		 		: abstract라서 모든 메소드는 선언부만 있어야한다. {구현부}가 있으면 안됨
		 		: 예외)default, static메소드는 인터페이스에서 유일하게 구현부를 가지는 메소드
		 	- 하나의 클래스는 하나의 부모 클래스를 상속해야한다. 자바는 다중 상속 불가.
		 	- 하나의 클래스는 여러개의 !인터페이스를 다중 상속이 가능하다.
		 */
		
		//1. 인터페이스는 객체화 할 수 없다. (구현되지 않는 메소드가 있기 때문에)
//		A a = new A(); !오류발생
//		B b = new B(); !오류발생
		
		//2. 인터페이스는 타입 지정은 가능하다. <== 중요! 많이 씀
		A a1= new Aa(); // A : 인터페이스, Aa : 인터페이스를 구현한 클래스
		a1.abc(); // 오버라이딩 된 메소드 호출
		
		B b1 = new Bb();
		b1.abc(); // 오버라이딩 된 메소드 호출
		
		System.out.println("========================");
		
		//3. 인터페이스의 필드는 public static final 생략됨
			// static : 객체 생성 없이 호출 가능 - 클래스이름.호출할필드선택 ex)A.a
			// final  : 값을 수정 불가
		
		System.out.println(A.a); //인터페이스명.필드명
		System.out.println(B.a); //인터페이스명.필드명
		
		//4. 필드의 값 수정 불가
//		A.a = 10; //!오류발생 final=상수라서 수정 불가
//		B.a = 20; //!오류발생 final=상수라서 수정 불가
		
		System.out.println("======= 추상 클래스 C ==========================");
		
		//1. 추상 클래스 : 객체 생성 불가
//		C c1 = new C(); //!오류 추상클래스임
		
		//2. 추상 클래스 : 구현한 클래스를 객체화해서 타입지정은 가능
		C c2 = new Cc();
		System.out.println(c2.m); //인스턴스 필드 : 객체 생성 후 호출가능
//		System.out.println(C.m); //오류! 인스턴스 필드라서 클래스이름으로 호출 불가능
		
		c2.m = 44;
		System.out.println(c2.m); //final키가 안들어가서 값 수정가능
		
		c2.bcd(); //C클래스의 일반 메소드(인스턴스)
		c2.abc(); //오버라이딩 메소드, C타입의 abc()호출, Cc타입의 abc()덮어쓰기
		
		
		
		
		
		

	}

}
