package chapter16.ex01;


//각각의 상품을 저장하는 클래스가 별도로 존재함

//1. Apple 클래스와 Apple 클래스를 담을 수 있는 클래스
class Apple {} //1-1(상품)클래스 선언
class Goods1 { //1-2 상품(Apple)타입의 객체를 담는 클래스
	//접근제어자 : private이기 때문에 외부에서 apple 참조 변수에 값을 넣거나 가져오기 위해서 
	//getter, setter 통해서만 apple 참조변수에 값을 수정할 수 있다
	//getter : apple 참조변수 값을 가져올때 사용
	//setter : apple 참조변수의 다른 값을 할당할때
	
	       //setter로 apple로 인풋값이 옴
	private Apple apple = new Apple(); //1-3 Apple 객체생성
		//getter로 apple 호출
	
	//1-4 getter : 필드의 값을 리턴으로 돌려줌
	
	//리턴하면 여기 Apple로 옴
	public Apple getApple() {
		return apple; //필드 apple의 값을 호출하고 public !Apple! 타입으로 보냄
	}
	//1-4 setter
	public void setApple(Apple apple) {
		this.apple = apple; // 인풋 타입을 호출하고 private Apple !apple! 객체로 보냄
	}
}

//2. Pencil 클래스와 Pancil 클래스를 담을 수 있는 클래스
class Pencil {}
class Goods2 { //pencil 타입의 객체를 담는 클래스
	private Pencil pencil = new Pencil();

	
	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

//단점 : 상품을 만들때마다 상품 바구니도 새로 만들어야함
//해결 : Object에서 해결가능

public class ProbleamsBeforeGeneric {

	public static void main(String[] args) {
		// 1-5. Goods1을 통해서 Apple객체를 추가하고 가져오기
		Goods1 goods1 = new Goods1();
		goods1.getApple(); //private이라서 getter를 사용해서 Apple 객체를 가져온다
		goods1.setApple(new Apple()); //setter를 사용해서 Apple 객체를 추가함
		
		Apple apple = goods1.getApple();
		
		// 1-5. Goods2를 사용해서 Pencil객체를 추가하고 가져오기
		Goods2 goods2 = new Goods2();
		Pencil pencil = goods2.getPencil();
		//getter를 사용해서 Pencil 객체를 가져온다
		goods2.setPencil(new Pencil()); //setter를 사용해서 Pencil 객체를 추가함
		
		Pencil pencil2 = goods2.getPencil();
		

	}

}
