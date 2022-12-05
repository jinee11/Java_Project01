package chapter16.ex03;


//1-3
class Apple {String apple = "애플";}
class Pencil {String pencil = "연필";}
class Banana {String banana = "바나나";}

//1-1 제너릭 클래스 : 다양한 타입의 저장 할 수 있는 클래스 (다운캐스팅 없이)
		/*
		- 클래스이름 뒤<>(꺽쇄 안)로 타입을 입력 받음, <>안에 타입 변수가 선언이 된 클래스
		 	보통 사용하는 대문자
		  		ㄴ T : type, K : key, V : value, N : number
		- 객체를 생성할때 <> 들어오는 타입을 지정해서 객체를 생성함
		- <>에 들어오는 타입은 객체형 타입만 들어와야한다, wrapper class
		 ㄴ wrapper class : 기본 자료형을 객체형 자료형으로 만들것
		   - boolean -> Boolean, char -> Charter
		   - byte -> Byte, short -> Short, int -> Integer, long -> Long
		   - float -> Float, double -> Double  
		   - 기본 자료형은 아니지만 void -> Void
		*/
class MyClass<T> { //<>안의 T는 변수다 (타입 아무거나 담길 수 있음)
	
	//1-2 제너릭 클래스 타입이 들어올 필드 선언 후 getter,setter
	 private T t;
	 
	 public T get() {
		 return t;
	 }
	 public void set(T t) {
		 this.t = t;
	 }
}

public class Single_GenericArgument {

	public static void main(String[] args) {
	//제너릭 타입의 객체 생성하기
		//1-4
		//변수 T에 Apple 던져줌 -> 1-2 과정의 T변수타입에 Apple이 다 들어감
		MyClass<Apple> app1 = new MyClass<Apple>();
		
		//1-5 Apple 객체화 해서 setter를 사용해서 주입
		app1.set(new Apple());
		//1-6 app1.get()가 Apple객체고 .apple는 필드 String 호출
		System.out.println(app1.get().apple);
		
		//Pencil 객체를 setter를 사용해서 주입하고 값 가져오기
		MyClass<Pencil> pen1 = new MyClass<>();//앞에 <Pencil>넣어서 <>안은 생략가능
		pen1.set(new Pencil());
		System.out.println(pen1.get().pencil);
		
		//Banana
		MyClass<Banana> ba1 = new MyClass<>();
		ba1.set(new Banana());
		System.out.println(ba1.get().banana);
		
		System.out.println("=================");
		
		//String 값을 넣고 출력하기
		MyClass <String> str1 = new MyClass<>(); //1-2 과정의 T변수타입에 String이 다 들어감
		str1.set("안녕하세요"); 
		System.out.println(str1.get());
		
		//int 값을 넣고 출력 하기 : Integer 객체타입
		MyClass<Integer> int1 = new MyClass<>();
		int1.set(50);
		System.out.println(int1.get());
		
		//double 값을 넣고 출력하기 : Double 객체타입
		MyClass<Double> dou1 = new MyClass<>();
		dou1.set(11.11);
		System.out.println(dou1.get());

	}

}
