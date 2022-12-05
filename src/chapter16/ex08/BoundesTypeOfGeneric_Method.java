package chapter16.ex08;
//제너릭 메소드의 타입제한

class A {
	//Number : Boolean, Charter를 제외한 정수, 실수를 처리하는 클래스
		//<T>에 Byte, Short, Integer, Long, Float, Double만 올 수 있게 제한
	
	public <T extends Number> void method1(T t) {
		//Object 클래스의 메소드 외의 Number 클래스의 메소드를 사용가능함
		System.out.println(t.intValue()); //intValue() : Number의 메소드
	}
}

//인터페이스 
interface MyInterface {
	void print(); //public abstract 생략
}

class B {
	
	//T : MuInterface 하위의 구현 클래스가 올 수 있다.
		//주의! 인터페이스를 상속할때 클래스는 implements를 쓰지만 메소드는 extends를 쓴다
	public <T extends MyInterface> void method1 (T t) {
		t.print();//인터페이스의 print() 호출
	}
}

public class BoundesTypeOfGeneric_Method {

	public static void main(String[] args) {
		// A클래스
		A a = new A();
		a.<Double>method1(10.11);
		a.method1(5.8); //double
		a.<Integer>method1(100);
		
//		a.<String>method1("안녕"); //오류! String은 올수 없도록 제한을 뒀다
		
		//B클래스
			//MyInterface 인터페이스를 상속한 모든 클래스도 올 수 있다
		B b = new B(); 
		
		b.<MyInterface> method1 (new MyInterface() {
			//타입 객체 모두 인터페이스 원래는 말이 안되는 코드
			@Override //상속된 자식이 익명으로 오버라이딩되어 메소드 출력
			public void print() {
				System.out.println("안녕");
			}
		});
		
		//MyInterface 생략버전
			//인풋되는 타입을 생략
		b.method1 (new MyInterface() {
			@Override
			public void print() {
				System.out.println("안녕");
			}
		});
		

	}

}
