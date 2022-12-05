package chapter16.ex09;

//메소드에 인풋으로 들어오는 타입을 제한

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

//제너릭 클래스
class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test {
	//메소드의 매개변수로 들어오는 타입의 제한을 둔다
	void method1 (Goods<A> g) {} 		//case 1 : g <- A 타입만 가능
	void method2 (Goods<?> g) {} 		//case 2 : ? <- 모든 타입이 올 수 있다 A,B,C,D
	void method3 (Goods<? extends B> g) {} //case 3 : B타입부터 상속된 하위클래스 B,C,D
	void method4 (Goods<? super B> g) {} //case 4 : B와 부모만 올 수 있다 A,B
}

public class BoundedTypeOfInputType_Argument {

	public static void main(String[] args) {
		// 메소드로 인풋되는 제너릭 타입의 제한
		Test t = new Test();
		
		//1. case 1 : g <- A 타입만 가능 - (Goods<A> g)
		t.method1(new Goods<A>()); 
		//Test타입의 method1()에 A타입 객체가 만들어지느냐 -> O
		
//		t.method1(new Goods<B>()); 
		//!오류 method1()는 A만 내포하고 있디
		
		//2. case 2 : ? <- 모든 타입이 올 수 있다 A,B,C,D - (Goods<?> g)
		t.method2(new Goods<A>()); 
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. case 3 : B타입부터 상속된 하위클래스 B,C,D - (Goods<? extends B> g)
//		t.method3(new Goods<A>()); //!오류 B보다 상위 클래스라서 올 수 없다
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//4. case 4 : B와 부모만 올 수 있다 A,B - (Goods<? super B> g)
		t.method4(new Goods<A>()); 
		t.method4(new Goods<B>()); 
//		t.method4(new Goods<C>()); //!오류 B의 하위클래스라서 올 수 없다
//		t.method4(new Goods<D>()); //!오류 B의 하위클래스라서 올 수 없다
		

	}

}
