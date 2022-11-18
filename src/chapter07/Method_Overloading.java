package chapter07;

class MethodOverloading {
	
	//메소드 오버로딩 : 동일한 이름의 메소드를 시그니쳐에 따라서 다른 메소드를 호출하는 것
		//시그니처 : 매개변수 갯수, 매개변수의 데이터 타입 <==
	
	void print() { //print () : 인풋 매개변수가 없는 메소드
		System.out.println("데이터가 없습니다. ");
	}
	void print (int a) { //print(int a) : 인풋 매개변수에 정수 1개를 인풋받는 메소드
		System.out.println("int: "+ a);
	}
	void print(double a) {
		System.out.println("double: "+ a);
	}
	void print(int a, int b) {
		System.out.println("int 2개 : "+ a + " " + b);//연산안되고 연결되서
	}
	void print(double a, int b) {
		System.out.println("double 1개, int 1개 : " + a + " " + b);
	}
	void print (int c, double k) {
		//시그니쳐 중복 항목이 없다 위배 없음
	}
	//메서드 오버로딩의 위배
	/*
	void print (double c, int k) {//오류발생! 똑같은 시그니쳐와 충돌
		
	}
	*/
	
}




public class Method_Overloading {

	public static void main(String[] args) {
		// !메소드 오버로딩 : 동일한 이름의 메소드를 시그니쳐에 따라서 다른 메소드를 호출하는 것
		  	// - 시그니쳐 : 메소드의 인풋 매개변수 갯수, 인풋되는 타입이 다를 경우 다른 메소드로 식별
		// !메소드 오버라이딩 : 상속에서만 적용됨
			//부모클래스에서 선언된 메소드를 자식클래스에서 재정의해서 사용하는 것
		
		MethodOverloading mo = new MethodOverloading();
		
		//1. 매개변수가 없는 메소드 호출
		mo.print();
		//2. 매개변수가 정수 1개인 메소드 호출
		mo.print(30);
		//3. 매개변수가 실수 1개인 메소드 호출
		mo.print(22.222);
		//4. 매개변수가 정수 2개인 메소드 호출
		mo.print(10, 22);
		//5. 매개변수가 실수 1개 정수 1개인 메소드 호출
		mo.print(50.1, 1);
		

	}

}
