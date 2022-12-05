package chapter16.ex07;

//제너릭 클래스로 들어오는 타입을 제한을 할 수 있다. extends 키를 사용해서 제한

class A {}
class B extends A {}
class C extends B {}

	//T 에 올수 있는 클래스는 B, C만 올 수 있다.
class D <T extends B> { //<T>타입으로 들어오는 타입을 extends 키를 사용하여 제한을 둔다
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric_Class {

	public static void main(String[] args) {

//		D <A> d1 = new D <>(); //!오류 A클래스는 <T>에 들어 갈 수 없다.
		D <B> d2 = new D <>(); //<T> : B 타입은 들어감
		D <C> d3 = new D <>(); //<T> : C 타입은 들어감
		
		D d4 = new D(); // 정상작동 == D<B> d4 = new D<>(); 와 같다
						//타입을 생락해서 호출하면 제한된 타입이 기본으로 들어감
		
		//setter를 사용해서 타입에 값 입력
		d2.setT(new B()); //d2는 B타입으로 정의해서 객체를 생성, 
						  //setter 주입할때 B타입의 객체를 주입
		d3.setT(new C()); //C타입 정의 객체 생성
		
		//객체 타입과 setter주입 타입이 다를 경우
//		d3.setT(new B()); //!오류 d3는 C타입으로 정의해서
						// B를 객체화하면 - A,B 내포 C는 없기 때문에 오류
		
		d2.setT(new C()); //정상작동 업캐스팅
						//d2는 B타입으로 정의해서
						//C를 객체화하면 - A,B,C를 내포하고 있어서 가능
		
		
	}

}
