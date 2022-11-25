package chapter10.ex05;

class A {
	int m = 3; //인스턴스 필드 : 오버라이딩 안됨
}
class B extends A {
	int m = 4; //인스턴스 필드 : 오버라이딩 안됨
}

public class Override_Instan_Field {

	public static void main(String[] args) {
		// 메소드 오버라이딩 [인스턴스 메소드 오버라이딩]
		//	-- 인스턴스 필드	: 오버라이딩 x , Heap 공간에 값이 저장
		//	-- 정적 필드		: 오버라이딩 x , 클래스 영역에 값이 저장
		//	-- 인스턴스 메소드	: 오버라이딩 o , 인스턴스 메소드 영역에 메소드가 저장
		//	-- 정적 메소드		: 오버라이딩 x , 클래스 영역에 메소드가 저장
		
		//1. 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//2. 인스턴스 필드 정보 출력
		System.out.println(aa.m); //3
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3 = 오버라이딩 안되서 타입 A클래스 필드가 출력
		//A m, B m의 객체는 (heap영역)별개로 존재하나 bb(리모컨)이 가리키는 번지(stack영역)가 같아서 B m(A m내포)이 출력된다
		//왜 같은 번지냐면 B가 A를 상속받아서
		

	}

}
