package chapter10.ex06;

class Aa {
	void abc() {
		System.out.println("Aa 클래스의 abc메소드");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab메소드");
	}
}
class Bb extends Aa {
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc메소드"); //오버라이딩
	}
	void bcd() {
		abc();	//this.abc() 생략 (자기자신의 필드,메소드 호출)
	}
	void cde() {
		super.abc(); //부모 클래스의 abc()
	}
	void def() {
		super.ab(); //부모 클래스의 ab()
	}
}
public class Super_Keyword02 {

	public static void main(String[] args) {
		// 
		
		//1. 객체 생성
		 //bb : Aa, Bb 내포 Ab, Bb 접근가능
		Bb bb = new Bb();

		//2. 메소드 호출
		bb.bcd(); //Bb 클래스의 abc메소드 = 자기 자신의 abc 
		bb.cde(); //Aa 클래스의 abc메소드 = 부모클래스의 abc
		bb.def(); //Aa 클래스의 ab메소드 = 부모클래스의 ab

	}

}
