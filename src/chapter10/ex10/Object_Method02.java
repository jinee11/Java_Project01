package chapter10.ex10;

class Aa {	//equals()가 재정의 되어있지 않은 클래스
			//Object 클래스의 equals()는 stack의 참조주소를 비교하도록 되어있다
	//필드 1개
	String name;
	
	//생성자 : 인풋 값 1개
	Aa(String name){ 
		this.name = name;
	}
}

class Bb {	//object의 equals()를 재정의해서 heap의 값을 비교하도록 재정의
	String name;
	
	Bb(String name){
		this.name = name;
	}
	
	//equals()를 재정의 방법                 b2가 object타입으로 업캐스팅되서 들어옴
	@Override			//obj <- Bb타입 b1.equals(b2) 인풋값을 던져줌(메인()에서)
	public boolean equals(Object obj) { //인풋값이 Object타입으로 업캐스팅해서 들어옴
		if (this.name/*b1*/ == ((Bb)obj).name/*b2*/ ) { //Object타입을 Bb타입으로 다운캐스팅
			return true; //heap(필드)비교 값이 같으면 true 리턴
		}else {
			return false; //heap(필드)비교 값이 다르면 false 리턴
		}
	}
	
}

public class Object_Method02 {

	public static void main(String[] args) {
		// Object클래스의 equals() 메소드 : 기본적으로 == 참조 주소를 비교함.
			//객체의 heap의 값을 비교하는 것이 아니라 stack 메모리의 참조주소 값을 비교
		// String 클래스는 equals()가 재정의 되어있어서 heap값을 비교하도록 설정되어있다.
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		// == <- 참조자료형 : stack 영역 참조 주소를 비교
		// equals() <- String : 참조자료형 == 와 동일하나 String을 쓸땐 재정의되어 heap의 값을 비교
		System.out.println(s1 == s2); //false= stack 주소 값이 달라서
		System.out.println(s1.equals(s2)); //true= heap 값을 비교
			//String클래스는 Object의 equals()가 재정의 되어있다.
		//! 내가 만든 객체에 equals를 쓰려면 String처럼 재정의해야한다 
		
		System.out.println("===========================");
		Aa a1 = new Aa("안녕");
		Aa a2 = new Aa("안녕");
		
		System.out.println(a1 == a2); //false = stack 참조주소 비교
		System.out.println(a1.equals(a2)); //false = stack 참조주소 비교
		
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		
		System.out.println(b1 == b2); //false = stack 참조주소 비교
			//Bb클래스는 equals() 재정의해서 heap의 값을 비교하도록 재정의했다
		System.out.println(b1.equals(b2)); //true = 재정의해서 heap값(필드의 값) 비교
		
	}

}
