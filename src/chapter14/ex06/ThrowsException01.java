package chapter14.ex06;

/*예외 처리 :  
 	1. 직접처리 (try ~ catch)
  	2. 예외 전가 : 예외를 내가 처리하지 않고 호출하는 곳으로 미루는 것
		- 호출하는 곳에서 예외를 처리해야 한다.
*/

//1 - 1. 하위 메소드에서 직접 예외를 처리하는 방법
class A { //1-1 클래스 생성
	
	void abc() { //1-2 메소드 abc 생성
		bcd(); //1-5 //abc()메소드에서 bcd()메소드호출됨(try가 있는)
	}
	
	void bcd() {//1-3 메소드 bcd생성 //bcd() 메소드 내부에서 예외 처리가 됨(sleep으로...)
		
		try {
			Thread.sleep(1000); //1-4
			//쓰레드를 1초뒤에 잠재워라(아직 안배움), 
			// 일반예외고 두가지 처리방법 1. 직접처리 try누르면 try~catch 메소드 생성
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}

//2 - 1. 예외를 호출하는 메소드로 전가 : throws
class B { //2-1
	
	void abc() { //2-2
		
		try {
			
			bcd(); //2-5 try누르면 try~catch 메소드 생성
			//여기서 직접 처리한다는뜻(한번 전가당함)
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	void bcd() throws InterruptedException { //2-3
		Thread.sleep(1000); //2-4
		// 일반예외고 두가지 처리방법 
		//2. throws누르면 bcd()메소드를 호출하는 곳에서 예외를 처리하도록 미룬다
	}
}

public class ThrowsException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
