package chapter09.ex03;

class D {
	int a; //인스턴스 필드 : 객체를 생성할때 초기값을 할당, 생성자를 통해서 기본값
	static int b; //static (정적)필드, static {정적 필드의 초기값 할당}
	
	//정적 필드의 초기값 할당
	static {	//클래스가 JVM에 로드될때 작동, 객체 생성전에 작동 <= 생성자와 같은 역할
		b = 5;
		System.out.println("클래스 A가 JVM에 로딩 되었습니다.");
	}
	
	//생성자를 사용해서 초기값 할당 : a 필드
	D () {
		a = 10;
	}
}

public class Static_Initial_Block {

	public static void main(String[] args) {
		// static 필드의 초기값 세팅 : static{초기값 할당} <= 객체를 생성하기 전에 메모리에 로드됨
		// 인스턴스 필드의 초기값 세팅 : 객체를 생성할때 1.생성자 2.setter를 사용해서 할당
		
		//객체 생성 없이 호출 : static b
		System.out.println(D.b); //static 메소드 -> 필드 순서로 호출
		
		//객체 생성 후 호출 : a (instance)
		D d1 = new D();
		System.out.println(d1.a);
	}

}
