package chapter10.ex11;

import java.util.HashMap;

class A { //equals() 만 재정의 된 상태, hashCode()는 재정의 안됨
			//
	//필드 
	String name;
	//생성자
	A(String name){
		this.name = name;
	}
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name ) {
			return true;
		}else {
			return false;
		}
	}
	//toString() 재정의
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
}

class B { //equals(), hashCode() 두개를 재정의 함 
	//필드 
	String name;
	//생성자
	B(String name){
		this.name = name;
	}
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name ) {
			return true;
		}else {
			return false;
		}
	}
	
	//hashCode() 재정의
	@Override
	public int hashCode () {
		return name.hashCode();
	}
	
	//toString() 재정의
	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
	
}

public class Object_Method03 {

	public static void main(String[] args) {
		// HashMap : Key, Value 2가지 형태가 들어감 <==컬렉션에서 자세히 배울거임
			// - Key(int) : 중복된 데이터를 넣을 수 없도록 하는 자료 구조
				//- equals(), hashCode(); 두개 재정의 해줘야함
			// - Value(String)
		
				//Integer는 클래스
		HashMap <Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1"); //1(key)가 중복데이터라서 출력안됨
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		
		System.out.println(hm1); //1=데이터2, 2=데이터3
		
		// Integer 클래스 : java에서 만든 클래스
			//- equals(), hashCode() 가 재정의 되어있기때문에
			 // Map 자료 구조의 Key로 사용할 수 있다
		
		//자신의 만든 객체를 Map에 Key로 사용할 수 있다.
		//	- equals(), hashCode(); 두개 재정의 해야 Map에 Key로 사용 가능
		
		System.out.println("======= A클래스 equasls()만 재정의=====================");
		
		HashMap <A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2); //모두출력
		//내가 만든 A타입 객체를 key로 잡았지만 hashCode()를 재정의 안해서 중복 출력됨
		//Map의 key로 사용할 수 없음
		
		System.out.println("======== B 클래스 equasls(), hashCode() 재정의 ====================");
		HashMap <B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1"); //중복 출력안됨
		hm3.put(new B("첫번째"), "데이터2"); //중복 출력안됨
		hm3.put(new B("첫번째"), "데이터4");
		hm3.put(new B("두번째"), "데이터3");
		
		System.out.println(hm3);//B [name=첫번째]=데이터4, B [name=두번째]=데이터3
		

	}

}
