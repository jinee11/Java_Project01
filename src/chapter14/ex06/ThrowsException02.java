package chapter14.ex06;
//예외를 계속 전가하면 어떻게 되는가

//예외처리 두가지방법
	//1. 직접처리 - try ~ catch
	//2. 예외전가 - throws

//예외를 무한히 전가하는 경우 : main 메서드에서 예외가 발생되며 멈춘다

class Ass {
	void abc() throws InterruptedException { //abc()를 호출하는 곳에서 예외를 처리하도록 전가
		bcd();
	}
	void bcd() throws InterruptedException { //bcd()를 호출하는 곳에서 예외를 처리하도록 전가
		cde(); 
	}
	void cde() throws InterruptedException {  //cde()를 호출하는 곳에서 예외를 처리하도록 전가
		Thread.sleep(1000); //일반예외 : 반드시 예외 처리가되어야함
		} 
}

public class ThrowsException02 {

	public static void main(String[] args) {
		// 객체 생성 후 abc() 메소드 호출
		Ass a1 = new Ass();
		
		try {
			a1.abc();
		} catch (InterruptedException e) {
			
		}
	}

}
