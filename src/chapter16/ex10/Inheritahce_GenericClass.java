package chapter16.ex10;

//제너릭 클래스의 상속, 자식 클래스는 부모 클래스의 타입변수의 갯수가 같거나 많아야한다.

class Parent<T> {
	T t;
	//getter,setter 생략
}

//제너릭을 상속하는 클래스도 <> 있어야함
class Child1<T> extends Parent<T> {
	
}
class Child2<T, V> extends Parent<T> {
		//T는 상속 받은거, V는 자식에서 추가한것
	V v;
	
}

public class Inheritahce_GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
