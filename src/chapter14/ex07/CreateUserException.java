package chapter14.ex07;
//다시 보면서 정리하기

//1. 사용자 정의 일반 예외 (checked Exception) - 내가 예외 만드는거
	//Exception 하위 클래스는 일반예외

class MyException extends Exception { //1 - 1 Exception 상속한 클래스 만들기
	
	//1 - 2. 2개의 생성자 정의
	public MyException() { //기본 생성자(인풋값없음) //!생성자는 클래스와 동일한이름 메서드와 다르다
		super(); //상속한 Exception 객체의 기본 생성자 호출
	}
	public MyException(String message) { //인풋값이 String인 생성자
		super(message); //상속한 Exception 객체의 message 호출?
	}
}

//2. 사용자 정의 실행 예외 (Unchecked Exception, RunTime Exception)
	//RuntimeException 하위 클래스는 실행예외

class MyRTException extends RuntimeException {//2 - 1. RunTime Exception을 상속한 클래스 만들기
	
	//2 - 2. 2개의 생성자 정의
	public MyRTException () { //기본생성자
		super();
	}
	public MyRTException (String message) { //인풋값이 String인 생성자
		super(message);
	}
}

//*1 - 3. 사용자 정의 예외를 테스트하는 클래스
class A {
	//*1 - 4. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException(); //기본생성자 호출
	MyException me2 = new MyException("예외 메세지 : MyException"); //String 생성자 호출
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	//*1 - 5. 예외 던지기 ( throws ) : 던진 시점에서 예외발생
			//throws : 예외를 전가함.
			//throw  : 예외를 발생시킴. 헷갈리지말자!
	
// *1 - 6. 예외를 내가 직접 처리하는 경우 : try ~ catch
	//1 - 7 메소드 생성
	void abc_1(int num) {
		// 1 - 8 try ~ catch 작성
		try { 
			// 1 - 9 if문
			if (num > 70) { //num 값이 70 이상이면 적상작동하고
				System.out.println("정상 작동");
			}else { //그렇지 않으면 아래 블락 실행 (예외 실행)
//				throw me1; //예외를 강제로 발생시킴 
				throw me2; // 2** //MyRTException클래스에서 만든 예외
				//(me1은 MyException클래스에서 만든 일반예외)
			}
		} catch (MyException e) {
			System.out.println("사용자 정의 예외가 처리됨 직접처리");
			
			System.out.println(e.getMessage());// 2** Exception 클래스의 메소드
			//MyRTException클래스의 메시지가 덮어써서 출력
		}
	}
	
	//1 - 10
	void bcd_1() {
		abc_1(65); //abc_1()메소드 호출하면서 여기 값을 기준으로 if문이 작동한다
	}
	
// *1 - 6. 예외를 전가하는 경우 : throws
	//1 - 7 메소드 생성
	void abc_2 (int num) throws MyException  {
		// 1 - 8 if문
		if (num > 70) {
			System.out.println("정상 작동");
		}else {
			//throws로 전가
//			throw me1; //예외를 강제로 발생시킴
			throw me2; // 2**
		}
	}
	
	//1 - 9 abc()호출해서 try 직접처리
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("사용자 정의 예외2 예외 전가");
			System.out.println(e.getMessage()); // 2**
			//e.printStackTrace();
		}
	}
}

public class CreateUserException {

	public static void main(String[] args) {
		/* 사용자 정의 Exception : 자신이 직접 생성한 예외.
			ex) 점수가 70점 이하면 예외를 발생시켜라(프로그램 실행을 멈춰라)
			- Exception을 상속해서 자신의 일반 예외를 생성할 수 있다.
		*/
		
		//객체 생성 후 사용자 정의 예외가 잘 처리되는지 확인
		
		//테스트 클래스 객체 생성
		A a = new A();
		
		//인풋값이 없는 메소드 호출해서 확인
		a.bcd_1();
		a.bcd_2();

	}

}
