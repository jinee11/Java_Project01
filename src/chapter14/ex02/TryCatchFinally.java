package chapter14.ex02;

public class TryCatchFinally {

	public static void main(String[] args) {
		/*
		  예외를 처리하는 방법
		  	1. 자신이 직접 예외를 처리 : try catch finally를 사용해서 처리
		  	2. 예외를 전가 : throws , 보통 메소드 뒤에 throws 뒤에 예외객체 던져줌
		  		- 메소드를 호출하는곳에서 예외를 처리
			
			throw : 예외를 발생시키는 키워드
		 
		 */
		System.out.println("========== try ~ catch =========================");
		
		//1 - 1. try ~ catch
		try {
			//try 블락에서 예외가 발생되면 catch 블락의 코드를 실행
			//try 블락에서 예외가 발생되지 않으면 catch 블락은 실행되지 않는다
			
			System.out.println( 3/0 ); //실행 예외: (ArithmeticException)
			
		} catch (ArithmeticException e) {
			//try블락에서 ArithmeticException 발생되었을때 작동
			System.out.println("try블락에서 오류가 발생되면 처리됨.");
		}
		
		//try catch를 이용하여 예외가 발생해도 작동 중단하지 않고 블락을 빠져나와 진행함
		System.out.println("프로그램의 마지막입니다.");
		
		System.out.println("========== try ~ catch ~ finally =========================");
		
		//1 - 2. try ~ catch ~ finally
			//finally 블락은 오류와 상관없이 실행되는 블락
		
		try {
			System.out.println("try 블락에 생성된 구문");
			System.out.println( 3/0 );
			System.out.println("try 블락에 생성된 구문"); // 3/0오류로 건너뜀
			//오류 없을시 여기까지 실행후 catch건너뛰고 finally실행
			
		}catch (ArithmeticException e){ //try에서 발생되는 Exception 캐치
			//try 블락에서 Exception이 발생이 되었을때 실행
			System.out.println("숫자 0으로는 나눌 수가 없다");
		}finally {
			//try블락에서 Exception 발생 유무와 상관없이 반드시 실행됨
			System.out.println("finally 블락 : 반드시 실행되는 블락");
		}
		
		
		System.out.println("프로그램의 마지막입니다.");
		

	}

}
