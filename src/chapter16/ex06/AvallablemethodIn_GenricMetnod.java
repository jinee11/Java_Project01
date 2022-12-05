package chapter16.ex06;

class A {
	public <T> void method (T t) {
		//제너릭 메소드 내부에서 사용가능한 메소드는 Object의 메소드만 사용가능하다.
		//단, 제너릭에 들어오는 타입이 제한이 적용된 경우는 Object의 메소드가 아니더라도 
		//해당 메소드를 사용할 수 있다.
		
//		System.out.println(t.length()); //!오류 length() : String 클래스의 메소드
		//String에서만 쓸수있는 메소드인데 제너릭 메소드는 다양한 타입이 들어올 수 있으니까
		//String이 들어올지 안들어올지 몰라서 쓸수 없다
		//String만 들어오라고 제한을 두면 쓸 수 있다?
		
		System.out.println(t.equals("안녕")); //equals() : Object 클래스의 메소드
		//메인메소드에서 인풋값이 "안녕"이면 true 출력 아니면 falus
		
	}
}


public class AvallablemethodIn_GenricMetnod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요. 반갑습니다.".length()); //13
		
		A a = new A();
		a.method("안녕");
		a.method("하세요");
		

	}

}
