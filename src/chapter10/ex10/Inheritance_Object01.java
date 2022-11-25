package chapter10.ex10;

//java.lang 패키지의 모든 클래스는 Import 없이 사용 가능

class A extends Object { //Java의 모든 클래스는 extends Object가 생략되어있다.
				//Object 클래스의 모든 메소드를 상속 받는다.
				//자식 클래스는 하나의 부모만 가질 수 있다(부모 상위의 조상은 상속받는다)
				//자바는 다중 상속이 불가함.
				//인터페이스는 다중 Implements가 가능하다.
	int m = 3;
	int n = 4;
	
	String name;
	
	
	//toString() : object 클래스의 메소드, 
		//객체자체를 출력시 작동되고 기본적으로 참조주소를 담고있기때문에 오버라이딩해서 
		//객체의 필드의 값을 출력하도록 재정의해서 사용한다
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
}

public class Inheritance_Object01 {

	public static void main(String[] args) {
		// 
		A a = new A();
		
		//객체 자체를 출력시 object클래스의 toString() 작동
		//객체의 패키지명.클래스명@hashcode()
		// hashcode ==> 참조주소 : 객체에 저장된 heap 메모리의 주소
		System.out.println(a);
		System.out.println(a.toString());
		
		//String 클래스는 toString() 가 재정의 되어져있다.
		String s1 = new String("안녕");
		System.out.println(s1);
		
	}

}
