package chapter13.ex02;

//이너클래스에서 외부 클래스의 필드와 메소드 접근

/*메소드 오버라이딩과 비교 : 
  메소드 오버라이딩
	1. 반드시 상속 관계가 있어야한다
	2. 인스턴스 메소드만 오버라이딩 가능
	3. 인스턴스 필드, 정적 필드, 정적 메소드 오버라이딩 불가능
*/

class A { //외부클래스
	//필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	
	//메소드 //중복메소드
	void abc() { //오버라이딩 되지 않는다
		System.out.println("A 클래스의 메소드 abc() 외부");
	}
	
	void def() {
		System.out.println("A 클래스의 def() 외부");
	}
	
	//내부클래스
	class B {
		int a = 5;
		int b = 6;
		
		//중복메소드
		void abc() { //이름이 같아도 오버라이딩이 아니다
			System.out.println("B 클래스의 메소드 abc() 내부");
		}
		
		void bcd() {
			//필드의 값 호출
			System.out.println(a); //내부 //this.a와 같다 //5
			System.out.println(b); //6
			System.out.println("==========================");
			
			//이너 클래스에서 외부클래스의 필드 호출
			System.out.println(A.this.a); //외부 //A클래스의 this //3
			System.out.println(A.this.b); //4
			
			//메소드 호출 
			abc(); //내부 //this.abc()와 같다
			
			//중복메소드 호출
			A.this.abc(); //외부 //A클래스의 this
			
			System.out.println("========================");
			//이너 클래스와 아웃터 클래스에서 중복되지 않는 필드 호출
			System.out.println(c); //아웃터클래스 A의 필드
			System.out.println(d); //아웃터클래스 A의 필드
			
			//중복되지 않는 외부클래스 메소드 : A.this 안붙여도됨
			def();
			A.this.def(); //위아래 둘다 같은 호출
		}
	}
	
}

public class InnerClass02 {

	public static void main(String[] args) {
		// 이너클래스 사용하기
		
		//1. 외부 객체 생성
		A a = new A();
		
		//2. 내부 객체 생성
		A.B b = a.new B();
		
		b.abc();
		b.bcd();
	}

}
