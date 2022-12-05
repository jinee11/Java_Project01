package chapter14.ex06;

//<문제>

//1. 예외 발생할때 각 메소드내부에서 직접처리함
class Aa {
	void abc() { //bcd() 메소드 호출
		bcd();
	}
	void bcd() { //직접처리
		
		
		try {
			System.out.println(3/0);
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
		} catch (ArithmeticException e){
			System.out.println("숫자 0으로 나눌 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("방번호가 존재하지 않습니다");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("쓰레드 종료");
		}
		
	}
}

//2. 예외 전가 : 메소드 호출하는 곳에서 예외 처리함
class Bb {
	void abc() { //bcd() 메소드 호출 여기서 처리
		try {
			bcd();
		} catch (ArithmeticException e){
			System.out.println("숫자 0으로 나눌 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("방번호가 존재하지 않습니다");
		} catch (InterruptedException e) {
			System.out.println("쓰레드 종료");
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException {
		
		System.out.println(3/1);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[1]);
		Thread.sleep(1000);
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==1. 직접처리 ==");
		Aa a1 = new Aa();
		a1.abc();
		
		System.out.println("==2. 예외전가 ==");
		Bb b1 = new Bb();
		b1.abc();

	}

}
