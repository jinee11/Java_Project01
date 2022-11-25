package chapter11.ex04;

abstract class Car {	//클래스 : 트럭, 자가용, 굴삭기 <=추상 메소드를 구현한 클래스
	abstract void run();
	abstract void eat();
}

class C1 extends Car {
	@Override
	void eat() {
		System.out.println("트럭은 휘발유를 먹는다");
	}
	@Override
	void run() {
		System.out.println("트럭은 천천히 달린다");
	}
}
class C2 extends Car {
	@Override
	void eat() {
		System.out.println("자가용은 전기를 먹는다");
	}
	@Override
	void run() {
		System.out.println("자가용은 빠르게 달린다");
	}
}
class C3 extends Car {
	@Override
	void eat() {
		System.out.println("굴삭기는 기름을 먹는다");
	}
	@Override
	void run() {
		System.out.println("굴삭기는 느리게 달린다");
	}
}

public class Ex01 {

	public static void main(String[] args) {

		Car c1 = new C1();
		c1.eat();
		c1.run();
		
		Car c2 = new C2();
		c2.eat();
		c2.run();
		
		Car c3 = new C3();
		c3.eat();
		c3.run();
		
	}

}
