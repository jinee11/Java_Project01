package chapter14.ex06;

class Aaaa {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//해당 클래스의 클래스가 존재하지 않는다
		Class cls2 = Class.forName("java.lang.Object2");
	}
}

public class ThrowsException03 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		/*
		Class cls = Class.forName("java.lang.Object"); //패키지내의 클래스가 존재하므로
		//main()에 예외 전가해도 오류가 발생 안하고 아래 단락이 실행됨
		
		Class cls2 = Class.forName("java.lang.Object2"); //존재하지 않는 클래스
		//main()에 예외 전가하면 오류 발생 이럴 경우 try catch로 묶어줘야한다는거 아 이제 이해함
		 오류가 발생해도 프로그램이 실행을 진행 할 수 있도록 오류를 처리해야한다!!
		*/
		
		Aaaa a1 = new Aaaa();
		
		try { //오류가 나서 직접처리하고 "프로그램종료" 단락으로 진행이 멈추지 않게함
			a1.abc();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //이건 오류가 아니라 <오류 메시지> 출력 헷갈리지말자
		}
		
		System.out.println("프로그램 종료"); //throws

	}

}
