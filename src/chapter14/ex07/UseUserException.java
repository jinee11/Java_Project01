package chapter14.ex07;

import javax.sound.midi.MidiChannel;

//사용자 정의 예외 응용
//점수가 특정 값이 아니면 예외 강제 발생 시키기
//테스트 클래스에서 객체 변수 안만들고 바로 적용하는 버전

//일반예외 - Exception

// 1. 점수가 음수이면 예외를 발생 시키는 사용자 정의 예외 "예외 발생됨 : 음수 값 입력 불가"
//0 - 1 Exception 상속한 클래스 생성
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

// 2. 점수가 100점을 초과하는 경우 사용자 정의 예외 "예외 발생됨 : 100초과 값 입력 불가"
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

//예외 발생 조건 2개니까 예외도 2개 만들어야한다

// 사용자 정의 예외를 처리할 테스트 클래스 
//0 - 2
class Aa {
	
	//0 - 3 메소드 생성(점수를 입력할)			//호출하는 곳으로 전가했다
	void checkScore(int score) throws MinusException, OverException {
		
		//0 - 4 if문 생성
		if (score < 0 ) { //score로 들어오는 값이 0보다 작으면 
			
			//0 - 5 MinusException 예외 호출하고 예외 발생 메시지 입력
			throw new MinusException("예외 발생됨 : 음수 값 입력 불가"); //일반예외
			//new로 테스트 클래스에서 객체를 따로 만들지않고 바로 호출
			
			//0 - 6 OverException 예외 호출하고 예외 발생 메시지 입력
		}else if (score > 100) { //score로 들어오는 값이 100보다 크면
			throw new OverException("예외 발생됨 : 100초과 값 입력 불가"); //일반예외
			//OverException 예외 호출
			
		}else { //1~100 점수면
			System.out.println("정상 값입니다.");
		}
	}
	
}


public class UseUserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 - 7
		Aa a1 = new Aa();
		
		//0 - 9 try
		try {
			
			//0 - 8 checkScore() 호출해서 try/multi~catch
			a1.checkScore(-20); //score 인풋값 입력
			
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			//테스트 클래스 checkScore() if문에 호출한 예외가 인풋값에 따라 바뀌며 출력
		}

		
	}

}
