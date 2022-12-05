package chapter13.ex08;

interface Animal {
	void cry();
	void fly();
}
//<문제>인터페이스를 4가지 형태로 구현

class A {
	
	//1
	class B implements Animal{
		@Override
		public void cry() {
			System.out.println("1이 웁니다");
		}@Override
		public void fly() {
			System.out.println("1이 납니다");
		}
	  }
	
	Animal a1 = new B();
	void aa () {
		a1.cry();
		a1.fly();
		
	}
	
	//2
	Animal a2 = new Animal() {
		@Override
		public void cry() {
			System.out.println("2가 웁니다");
		}@Override
		public void fly() {
			System.out.println("2가납니다");
		}
	};
	
	void aa2() {
		a2.cry();
		a2.fly();
	}
	
	//3
	void aa3(Animal a3) {
		a3.cry();
		a3.fly();
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//1. Animal을 구현한 이너클래스 생성후 메소드 출력
		A a = new A();
		a.aa();
		
		System.out.println("===================");
		//2. Animal을 익명 클래스로 생성해서 출력
		a.aa2();
		
		System.out.println("===================");
		//3. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 생성 후 출력
		Animal a3 = new Animal() {
			@Override
			public void cry() {
				System.out.println("3이 웁니다");
			}@Override
			public void fly() {
				System.out.println("3이 납니다");
			}
		};
		
		a.aa3(a3);
		
		System.out.println("===================");
		//4. 객체 메소드의 인풋 매개변수로 Animal타입을 인풋 받아서 출력 : 참조변수 없이 바로 출력
		a.aa3(new Animal() {
			@Override
			public void cry() {
				System.out.println("4가 웁니다");
			}@Override
			public void fly() {
				System.out.println("4가 납니다");
			}
		});

	}

}
