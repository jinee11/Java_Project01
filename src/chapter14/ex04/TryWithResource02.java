package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

//try 사용한 객체 자동으로 객체제거하는 방법 (TryWithResource01 방법은 finally 코드가 너무 길어서 이걸 많이 쓰는듯)

public class TryWithResource02 {

	public static void main(String[] args) {
		/* 
		 Try with resource : java 1.7ver부터 추가
		 일반적인 try 구문 : try {} catch (exception e) {}
		 Try With Resource :
			- try ( 객체선언[Resource] ) {} catch (exception e) {}
			  ㄴ 자동으로 객체를 close()
			  ㄴ 자동으로 객체를 제거하기 위해서는 AutoClosable() 인터페이스를 구현 클래스만이 자동으로 제거됨
		*/
		
		
		//1. 자동으로 객체를 제거하는 예제
			// (Resource : 객체를 선언) <= 객체를 자동으로 close() 하게된다.
			// InputStreamReadersms AutoClosable() 인터페이스를 구현하고 있다.
		
		System.out.println("한글자를 입력하세요>>>");
		
				//리소스블락 <- 선언하면 자동으로 객체를 제거해주겠다...
		try (InputStreamReader ir1 = new InputStreamReader(System.in);) {
			//입력한 글자를 reader해서 읽어서 ir1에 할당
			
			char input = (char) ir1.read(); //일반예외 : IOException
			//ir1을 char(한글자)로 다운캐스팅해서 input에 할당
			
			System.out.println("입력한 글자는 : " + input);
			
		}catch (IOException e) {
			
			System.out.println("IOException 발생되었습니다.");
			//여기까지 일반예외처리
		}
		
		/*try (객체 선언 및 생성) 하면
		 finally 블락에 close() 메소드를 사용하지 않더라도 자동으로 close()됨
		*/
		
		
		
		
		
		
	}

}
