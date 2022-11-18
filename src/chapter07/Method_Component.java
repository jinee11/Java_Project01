package chapter07;

class Method {
	
	//필드 생략
	//기본생성자 생략
	
	//1. 리턴 타입 : void + 매개변수: 없는 메소드
	void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴 타입 : int + 매개변수: 없는 메소드
		//메소드를 호출 시 돌려주는 값
	int data() { 
		int a ;
		a = 3;
	
		return a;//data()를 호출하면 a변수에 담긴 값을 돌려줌
	}
	
	//3. 리턴 타입 : double + 매개변수가 2개인 메소드
	double sum (int a, double b) { //첫번째는 정수 두번째는 실수
		return a + b;
	}
	
	//4. 리턴 타입 : void + 내부에 리턴 포함 (함수를 종료한다는 의미)
	void printMonth (int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력입니다.");
			return;	//void로 선언된 메소드 내에서 return을 사용하면 메소드를 종료(void)
		}
		System.out.println(m + "월 입니다" );
	}
	
}

public class Method_Component {

	public static void main(String[] args) {
		/* 
		 Method(메소드) : 실행블락의 프로그램 기능을 저장
			- 호출시 작동,
			- 메소드 이름 앞에 리턴 타입이 반드시 존재해야한다.
				void : 리턴 타입이 존재하지 않을때.
				int : 정수 값을 리턴
				boolean : true,false를 리턴
				....double, char,
				String : 문자열을 리턴
			
		*/
		
		//1. 객체 생성 : class를 객체로 class => Object (Instance)
		Method m = new Method();//클래스를 메모리로 로드시키는것=객채생성
		
		//2. 메소드 호출 : 객체.메소드명 ex) m.data();
		m.print();//(매개변수가 없는걸 호출할때 print) =안녕
		
		int k = m.data(); //data()를 호출하는 순간 정수 3값이 리턴됨 변수 k에 저장
		System.out.println(k); //=3
		
		double l = m.sum(50, 60.6); 
		//sum은 매개변수의 값을 2개의 값을 던져줘야한다. 첫번째는 정수 두번재는 실수- 리턴값은 실수
		System.out.println(l);//=110.6
		
		m.printMonth(10);
		//정수의 매개변수를 던져줘야하고 리턴값은 없다
		m.printMonth(13);
		
		
	}

}
