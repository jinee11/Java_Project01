package chapter10.ex07;

class Aa {
	Aa(){
		System.out.println("Aa 클래스의 생성자");
	}
}
class Bb extends Aa {
	Bb(){
		//super(); 생략되있음
		System.out.println("Bb 클래스의 생성자");
	}
}
class Cc extends Bb {
	Cc(){
		//super(); 생략되있음
		System.out.println("Cc 클래스의 생성자");
	}
}

public class Super_Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성 후 생성자 작동 확인
		Cc cc = new Cc();
		//조상 생성자부터 나이순대로 생성후 자식 생성자 호출

	}

}
