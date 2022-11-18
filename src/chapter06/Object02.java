package chapter06;

//외부 클래스 : 객체를 생성하기 위한 설계도, 템플릿 (틀)
class A { //!패키지내에서 같은 클래스 이름을 만들 수 없다.
	
	//필드(field),멤버 필드or변수 : 클래스 블락에서 선언된 변수
	int m = 3;
	int n = 7;
	double d = 10.5;
	
	// 생성자 : 필드의 내용을 초기화 할때 사용(일반적으로),객체를 생성할때 생성자를 반드시 호출해야 한다.
		// - 리턴 타입이 존재하지 않는다. 
		// - 메소드 이름이 클래스 이름과 동일한 메소드
	
//클래스이름과 통일 //기본 생성자 : 생략될 수 있다, 생성자도 하나의 메소드(특별한)
    A(){
		//기본 생성자( : 인풋 매개 변수가 비어있는 생성자를 기본 생성자
	}
	
	//메소드 : 함수 , 호출시 작동
	//리턴타입<-void 메소드명<-print(인풋매개변수) {메소드 호출시 프로그램 실행 코드}
		//void : 메소드 호출시 리턴을 돌려주지 않음을 정의
	void print () {
		System.out.println("print 메소드를 호출했습니다.");		
	}
	
}

public class Object02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수[지역] : 메소드 내에서만 유지
		int b = 10 ; 
		
		//자료형
		//클래스명 참조변수 = new A();
		//클래스명:A 객체 자료형 - 동일한 패키지내에 클래스가 존재할때 임포트 없이 사용가능
		//참조변수:a - stack에는 heap의 번지 저장/heap에는 필드,메소드 저장
		//new - heap 공간에 필드와 메소드를 저장하라
		//A();- 생성자호출
		
		// 1. 객체 생성 - A:class, a:Object(객체)
		A a = new A();
		
		// 2. 필드(멤버 변수) 출력
		System.out.println("==== a객체의 필드의 값을 출력 ======");
		System.out.println(a.m); //3
		System.out.println(a.n); //7
		System.out.println(a.d); //10.5
		
		
		// 3. 메소드 호출
		System.out.println("==== a객체의 메소드 호출 ==========");
		a.print();		//a객체의 print() 메소드 호출
		
	System.out.println("====== aa 객체 ===============");
	//하나의 클래스를 생성하면 클래스를 기준으로 여러개의 객체를 생성할 수 있다.
	
	//A 클래스를 기준으로 2번재 객체 생성
		//1. 객체 생성
		A aa = new A(); //aa객체 생성
		
		//2. aa객체의 필드 호출
		System.out.println(aa.m);
		System.out.println(aa.n);
		System.out.println(aa.d);
		
		//3. 메소드 호출
		aa.print();
		
		System.out.println("====== a1 객체 ===============");
		
		A a1 = new A();
		System.out.println(a1.d);
		a1.print();
		
		System.out.println(aa.m==a1.m); //true
		System.out.println(aa.m==a1.n); //false
		System.out.println(aa.m<a.n);
		
		
	}

}
