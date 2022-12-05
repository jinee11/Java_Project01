package chapter12.ex07;

interface A {
	//public 키가 생략, 객체 생성없이 바로 호출가능
		//구현 코드가 있는 메소드
	static void abc() {
		System.out.println("인터페이스의 static 메소드");
	}
}

public class Interface_Static_Method {

	public static void main(String[] args) {
		/*
		  interface 블락에서 구현된 메소드 : default, static
		  	- 메소드 이름 앞에 static 메소드 : 인터페이스 이름으로 바로 호출 가능
		  	
		  interface : 모든 필드와 메소드 앞에 public이 모두 생략되어 들어있다
		  	1. 모든 필드 : public static fanal
		  	2. 메소드 : 
		  	 	- 2-1. 추상메소드(기본) : public abstract 생략되어 들어있다, 선언만되고 구현부없는 메소드
		  	 	- 2-2. default 메소드 : public키가 생략되어 들어있다, 구현부가 있는 메소드
		  	 		ㄴ 모든 자식 클래스에 상속되는 메소드, 1.8ver부터 지원
		  	 	- 2-3. static 메소드 : public키가 생략되어 들어있다, 구현부가 있는 메소드
		  			ㄴ 1.8ver부터 지원, 객체 생성없이 인터페이스이름으로 바로 호출 가능
		 */
		
		//객체 생성없이 인터페이스 이름으로 바로 호출
		A.abc();
		
		

	}

}
