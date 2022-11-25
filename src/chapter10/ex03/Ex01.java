package chapter10.ex03;

import java.util.Arrays;

class Fruit { //부모의 메소드를 오버라이딩해서 출력. 자식:Apple, Banana, Orange
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit {
	@Override
	void eat() {
		System.out.println("사과는 아삭합니다.");
	}
}
class Banana extends Fruit {
	@Override
	void eat() {
		System.out.println("바나나는 달콤합니다.");
	}
}
class Orange extends Fruit {
	@Override
	void eat() {
		System.out.println("오렌지는 상큼합니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Orange();
		
		f1.eat();
		f2.eat();
		f3.eat();
		
		Fruit[] arr1 = new Fruit[3];
		arr1[0] = f1;
		arr1[1] = f2;
		arr1[2] = f3;
		
		Fruit a1 = arr1[0];
		Fruit a2 = arr1[1];
		Fruit a3 = arr1[2];
		
		a1.eat();
		a2.eat();
		a3.eat();
	}
}
