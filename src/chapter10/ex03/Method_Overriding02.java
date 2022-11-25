package chapter10.ex03;

class Animal {
	
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다.");
	}
}
class Tiger extends Animal {
	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
}
class Eagle extends Animal {
	@Override
	void animalSound() {
		System.out.println("독수리는 끼오 하고 웁니다.");
	}
}
class Lion extends Animal {
	@Override
	void animalSound() {
		System.out.println("사자는 어흥흥 하고 웁니다.");
	}
}

public class Method_Overriding02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		Animal t1 = new Tiger(); //t1: Animal, Tiger <-업캐스팅되어 사용은 Animal만 가능
		Animal t2 = new Lion();  //t2: Animal, Lion <-업캐스팅되어 사용은 Animal만 가능
		Animal t3 = new Eagle(); //t3: Animal, Eagle <-업캐스팅되어 사용은 Animal만 가능
		
		//Animal(부모) 메서드가 호출됐지만 오버라이딩된 자식의 메서드가 덮어써서 출력!!
		t1.animalSound();
		t2.animalSound();
		t3.animalSound();
		
		System.out.println("==================");
		
		//1. 배열에 객체를 저장
		
		//arr1에 Animal 객체를 저장
		Animal[] arr1 = new Animal[3];
		
		//arr1 배열의 각방에 Animal 객체 저장
		arr1[0] = t1; //0번방에 t1객체 저장
		arr1[1]	= t2;
		arr1[2]	= t3;
		
		//2. arr1 배열에 Animal 타입의 객체가 저장되어 있음.
			//배열 각방의 값을 가지고 오기
		Animal a1 = arr1[0]; //Animal 변수를 선언하고 배열 각방의 값을 가지고 와서 저장
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
		
		System.out.println("=====================");
		
		//3. Animal 타입의 객체를 출력
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();

	}

}
