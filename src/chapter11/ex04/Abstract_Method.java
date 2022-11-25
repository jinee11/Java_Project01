package chapter11.ex04;

abstract class Animal { //추상클래스<-추상메소드가 하나라도 있으면 추상클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}

class Cat extends Animal { //콘크리트 클래스 : 추상메소드를 모두 구현한 자식 클래스
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");
	}
	@Override
		void run() {
			System.out.println("고양이가 달린다");
		}
	@Override
		void cry() {
			System.out.println("고양이는 야옹");
		}
}

abstract class Dog extends Animal { //추상 클래스의 추상 메소드를 일부만 구현 한 경우 : 추상 클래스
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}
	@Override
	void eat() {
		System.out.println("개는 뼈다귀를 먹는다");
	}
}

class DogChild extends Dog { //콘크리트 클래스 <- 조상의 모든 추상클래스를 모두 구현
	@Override
	void run() {
		System.out.println("강아지는 깡충");
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못한다. 타입으로 지정은 가능하다
		// Animal, dog는 추상 클래스라서 객체 생성이 안된다.
		
		//1. Animal 객체 생성
		
//		Animal a1 = new Animal(); //오류발생! 추상클래스는 객체화 할 수 없다
		
		//Cat()을 객체화 해서 Animal 타입으로 정의,
		//Animal의 메소드 호출시 오버라이딩된 Cat 메소드 호출
		Animal a2 = new Cat();
		a2.cry();
		a2.run();
		a2.eat();
		
		System.out.println("=================");
		//Cat객체화해서 Cat 타입으로 지정
		Cat c2 = new Cat();
		c2.cry();
		c2.eat();
		c2.run();
		
		System.out.println("=================");
		//Dog는 추상클래스 이므로 객체화 할 수 없다.
//		Dog d1 = new Dog(); //오류발생!
		
		//DogChild()객체화 타입 Animal
		Animal a3 = new DogChild();
		a3.cry(); //Dog 오버라이딩
		a3.eat(); //Dog 오버라이딩
		a3.run(); //DogChild 오버라이딩
		
		System.out.println("=================");
		//DogChild 객체화해서 Dog타입으로 지정
		Dog d3 = new DogChild();
		d3.cry(); //Dog 오버라이딩
		d3.eat(); //Dog 오버라이딩
		d3.run(); //DogChild오버라딩
		
		System.out.println("=================");
		//DogChild 객체화 DogChild타입
		DogChild d4 = new DogChild();
		d4.cry(); //Dog 오버라이딩
		d4.eat(); //Dog 오버라이딩
		d4.run(); //DogChild오버라딩
		

	}

}
