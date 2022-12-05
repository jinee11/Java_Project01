package chapter12.ex02;

public class Animal_Test {
	
	public static void main(String[] args) {
		
		//1.구현한 객체를 생성 후 Animal 타입으로 지정
		//Animal : 인터페이스
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		Animal a4 = new Eagle();
		
		//2. Animal 배열에 저장
		Animal[] arr = new Animal[] {a1,a2,a3,a4};
		
		//3. for문을 통해서 오버라이딩된 메소드 출력
		for (int i = 0; i < arr.length ; i++) {
			arr[i].run(); //Animal 메소드 호출 시
			arr[i].cry(); //구현한 클래스의 오버라이딩된 메소드 호출
		}
		
		System.out.println("=====================");
		//4. Enhanced for문 출력
			//arr 각방의 값을 변수 k에 던진다
		for (Animal k : arr) {
			k.run();
			k.cry();
		}
		

	}

}
