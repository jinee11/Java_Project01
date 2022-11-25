package chapter10.ex08;

import java.util.Arrays;

//<문제>
class Animal {
	void run () {
		System.out.println("모든 동물은 달립니다");
	}
}
class Man extends Animal {
	@Override
	void run () {
		System.out.println("모든 남자는 달립니다");
	}
}
class Woman extends Animal {
	@Override
	void run () {
		System.out.println("모든 여자는 달립니다");
	}
}
class Lion extends Animal {
	@Override
	void run () {
		System.out.println("모든 사자는 달립니다");
	}
}
class Tiger extends Animal {
	@Override
	void run () {
		System.out.println("모든 호랑이는 달립니다");
	}
}
class Cat extends Animal {
	@Override
	void run () {
		System.out.println("모든 고양이는 달립니다");
	}
}
class Dog extends Animal {
	@Override
	void run () {
		System.out.println("모든 개는 달립니다");
	}
}
class DogChild extends Dog {
	@Override
	void run () {
		System.out.println("모든 강아지는 달립니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// Animal : 부모 클래스, run() 정의
		//	자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog -- DogChild (다형성)
		//		- 부모의 run 메소드 재정의
		// Animal 타입으로 배열 arr 저장 후 for, enhanced for 문으로 출력, run() 메소드 출력

		Animal a1 = new Animal();
		Animal m1 = new Man();
		Animal w1 = new Woman();
		Animal l1 = new Lion();
		Animal t1 = new Tiger();
		Animal c1 = new Cat();
		Animal d1 = new Dog();
		Animal dc1 = new DogChild();
		
		Animal[] arr = new Animal[] {a1,m1,w1,l1,t1,c1,d1,dc1};
		
		System.out.println("========= for문 출력 =======");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].run();
		}
		
		System.out.println("=========Enhanced for문 출력 =======");
		for(Animal k : arr) {
			k.run();
		}
		
	}

}
