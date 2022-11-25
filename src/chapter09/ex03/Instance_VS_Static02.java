package chapter09.ex03;

class C {
	int a = 10; //인스턴스 필드 : 객체화해야함, 다른 객체화는 공유되지 않는 값
	static int b = 20; //정적 필드 : 객체화 하지 않고 사용가능,
						//모든 객체에서 공유되는 변수
	
	void print1() {
		System.out.println(a + " " + b);
	}
	static void print2() {	//정적 메소드에는 instance 필드가 올 수 없다
		System.out.println(b);//오류! a는 인스턴스 필드
	}
}

public class Instance_VS_Static02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		C c1 = new C();
		//객체 필드의 값 수정
		c1.a = 100;		//인스턴스 필드 : 자신의 객체에만 적용(그 객체 고유한 값)
							//메모리의 heap공간에 변수와 값을 저장
		c1.b = 777;		//정적 필드 : 다른 객체와 공유 되는 공간
							//메모리의 클래스 영역에 변수와 값을 저장, heap영역에는 번지값만 있다
		
		System.out.println(c1.a); //10 //100
		System.out.println(c1.b); //20 //777

		System.out.println("=====================");
		
		C c2 = new C();
		System.out.println(c2.a); //10 //10
		System.out.println(c2.b); //20 //777
		
		System.out.println("===================");
		
		C c3 = new C();
		
		c1.a = 888;
		c2.a = 999;
		c3.a = 777;
		c1.b = 111;
		C.b = 333;
		
		System.out.println("=============");
		
		System.out.println(c1.a); //888
		System.out.println(c2.a); //999
		System.out.println(c3.a); //777
		System.out.println(c1.b); //111 //333
		System.out.println(c2.b); //111 //333
		System.out.println(c3.b); //111 //333
	}

}
