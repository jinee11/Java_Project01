package chapter10.ex02;

//클래스의 상속관계
class A {
	void aa() {
		System.out.println("a");
	}
}
class B extends A {
	void bb() {
		System.out.println("b");
	}
}
class C extends B {}
class D extends B {}

public class TypeCasting02 {

	public static void main(String[] args) {
		//1. 업 캐스팅(자동) : 생략시 컴파일러가 자동으로 추가, 자식 클래스 객체 생성 ==> 타입을 부모로
		//ac라는 객체는 A,B,C클래스를 내포하고 있고 사용은 A클래스만 가능하다(A타입으로 정의되어 있다)
		A ac = new C(); //ac는 객체C(자식) 타입은 A(부모)라서 업캐스팅
			System.out.println(ac instanceof A);//true
			System.out.println(ac instanceof B);//true
			System.out.println(ac instanceof C);//true
			System.out.println(ac instanceof D);//false
			System.out.println("================");
		//bc라는 객체는 A,B,C클래스를 내포하고 있고 정의는 B타입, 사용은 A,B클래스만 가능하다
		B bc = new C();
			System.out.println(bc instanceof A);//true
			System.out.println(bc instanceof B);//true
			System.out.println(bc instanceof C);//true
			System.out.println(bc instanceof D);//false
		
		//bc는 B 타입으로 정의 되어있고 A타입으로 업캐스팅 ->
			A a = bc;
			
			System.out.println("===== 다운캐스팅 ==========");
		//2. 다운 캐스팅(수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않음, 실행시 예외 발생
			//instanceof 사용
		
		//A클래스 A타입객체 내포된게 A클래스 뿐이라서 다운캐스팅 불가
		A aa = new A(); 
			System.out.println(aa instanceof A); //true
			System.out.println(aa instanceof B); //false
			System.out.println(aa instanceof C); //false
			System.out.println(aa instanceof D); //false
		//A클래스만 내포된 aa객체를 B로 다운캐스팅 시도	
//		B ba = (B) aa; //오류가 없다. 실행시 오류발생
		
		if (aa instanceof B) {
			B ba = (B) aa; //오류가 없다. 실행시 오류발생
		}else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가합니다");
		}
		
		if (aa instanceof C) {
			C ca = (C) aa; //오류가 없다. 실행시 오류발생
		}else {
			System.out.println("aa는 C를 내포하고 있지 않아서 다운캐스팅이 불가합니다");
		}
		
			System.out.println("=========================");
		//bd : A,B,D 클래스 내포, 사용은 A,B만 가능
		B bd = new D();
			System.out.println(bd instanceof A); //true
			System.out.println(bd instanceof B); //true
			System.out.println(bd instanceof C); //false
			System.out.println(bd instanceof D); //true
			
	}

}
