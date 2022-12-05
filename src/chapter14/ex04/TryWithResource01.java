package chapter14.ex04;

//일반 예외 처리 하는 방법 & 객체 사용후 제거하는 방법 2가지

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {
										//*1 - 1
	public static void main(String[] args)  {
		// Try 구문에서 리소스 자동 해제, 객체를 사용후에 반드시 그 객체를 제거해서 메모리를 최적화한다.
		//	객체를 사용후 finally 블락에서 객체를 제거함
		
		System.out.println("문자를 입력 하세요! >>");
		
		//1. 리소스 수동 해제 : finally 블락에서 객체를 close() 메소드를 호출해서 객체를 메모리에서 제거
		
		//콘솔을 사용해서 문자열을 입력 받도록 하는 클래스 : InputStreamReader
		InputStreamReader ir1 = null;
		
		//일반예외 (Catched Exception) : 프로그램 작성시 컴파일 단계에서 오류
		 //- IOException 발생하기 때문에 반드시 처리해아함
			//*1. 예외를 남에게 전가 : throws를 사용해서 호출하는 쪽에서 처리하도록 미루는 방법
				//- 메소드 블락에서 적용됨, 메소드를 호출하는 곳에서 예외 처리 해야함
			//*2. 예외를 내가 처리 : try ~ catch 블락을 만들어서 내가 처리
		
		ir1 = new InputStreamReader(System.in);
		
		//*2 - 1.
		try {
			char input = (char) ir1.read(); //예외처리가 되어야함. 일반예외
			System.out.println("입력하는 글자는 : " + input);
		} catch (IOException e) {
			//블락안 내용이 없어도 처리가 됨
			System.out.println("IPException 이 발생 되었습니다. 하나의 문자만 넣어주세요");
			e.printStackTrace(); //여기까지 일반예외 처리
		} finally {
			//일반적으로 객체를 사용 후 finallay 블락에서 객체를 제거함
				//객체를 제거할때도 예외 처리가 되야한다
			if (ir1 != null) { //객체가 null일때는 실행안함, 객체가 null이 아닐때 아래블락 실행
				try {
					ir1.close(); //객체 제거. 일반예외 : 반드시 예외 퍼리를 해야함
				} catch (IOException e) {
					System.out.println("객체 제거시 예외 발생함");
					e.printStackTrace();
				}
			}	
		}
		
		

	}

}
