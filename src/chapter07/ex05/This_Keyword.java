package chapter07.ex05;

class A {
	//필드 : heap 영역에 저장
	int m ;
	int n ;
	
	//메소드 정수값 2개 인풋, this키를 생략한 경우
	void init(int a, int b) {	//메소드 내의 : a, b, c <==지역 변수 : stack에 저장
		int c;
		c = 3;
		m = a; //this.m : 기본적으로 this키가 생략되어 있다(필드,실행블락,인풋매개변수 모두 동일하면 this명시)
		n = b; //this.n
	}
	
	//this 키를 반드시 명시해야하는 경우
	void init2 (int m, int n) {
		this.m = m;
		this.n = m;
	}
	//메소드
	void work() {
		this.init (2,3); //init 메소드에 정수값 2개 인풋후 호출 this : 자산의 객체나 필드나 메소드 호출
		System.out.println(m + " " + n); //m2,n3 인풋후 출력
	}
}
public class This_Keyword {

	public static void main(String[] args) {
		// this : 자기 자신 객체의 필드나 메소드		<== 필드, 메소드에 적용
		// this()<- 메소드 : 자신 객체의 다른 생성자 호출시 사용
		// super : 상속에서 부모의 객체의 필드나, 메소드를 사용. 
		// super() : 부모 클래스의 생성자 호출 할때 사용
		
		A a = new A();
		a.work(); //work메소드의 init(2,3) 호출후 출력
	}
}
