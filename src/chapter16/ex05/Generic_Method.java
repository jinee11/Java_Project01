package chapter16.ex05;

/*
 제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드
  - 접근제어자 <외부에서타입지정> 리턴타입 메소드명 (타입 변수)
  - 제너릭 메소드를 호출할때 외부에서 지정한 타입이 <외부에서타입지정>에 들어오고 
    리턴타입과 (타입 변수)의 타입에 들어가서 호출된다
  - 다양한 타입의 값을 리턴으로 되돌려주는 메소드
 */

class GenericMethod {
	
	//제너릭 메소드 생성
	public <T> T method1 (T t) { //method1() 호출 할때 제너릭메소드<타입>이 메소드의 타입과 
						//(인풋변수)의 타입에 들어가 호출된다
		return t;
	}
	
	//동일한 타입의 두 값을 인풋받아서 같다면 true 아니면 false
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	//인풋값 타입 상관없이 출력해라
	public <K, V> void method3 (K k, V v) {
		System.out.println(k + " : " + v);
	}
}

public class Generic_Method {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기
		
		// method1() 호출
		//1-1. 일반 클래스의 객체생성
		GenericMethod gm = new GenericMethod();
		GenericMethod gm2 = new GenericMethod();
		
		//1-2 객체명.메소드 호출해서 메소드 이름앞에 <타입지정>해주고 인풋값 넣어주기
		String str1 = gm.<String>method1("안녕"); //변수에 담아줘도 되고 바로 출력해도됨
		String str2 = gm.method1("하세요"); //뒤의 인풋 값으로 타입을 유추할 수 있는 경우 생략가능
		
		System.out.println(str1+str2);
		
		Integer int1 = gm.<Integer>method1(100);
		Integer int2 = gm.method1(200);
		
		System.out.println(int1 + int2); //정수라서 더하기 연산
		
		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		System.out.println(gm.method1("입력값으로 타입 유추가능"));
		System.out.println(gm.method1(2==2)); //true
		System.out.println(gm.method1("안녕".equals("안녕"))); //true
		System.out.println(gm.method1("안녕".equals("hello"))); //false
		
		System.out.println("================================");
		//2. method2() 호출
		
		//리턴 타입은 일반 타입
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.4, 2.5); 
		
		System.out.println(bool1); //true
		System.out.println(bool2); //false
		System.out.println(gm.<String>method2("안녕", "안녕"));//true
		System.out.println(gm.method2("배", "고프다"));//false
		
		System.out.println("=============================");
		//3. method3() 호출
		
		gm.<String, Integer> method3("국어", 80);
		gm.method3("영어", 88);
		
		System.out.println("============================");
		gm.method3("아바타2", "롯데시네마");
		gm.method3(1000, 50);
		gm.<Integer,Double> method3(1000,3.2);
		
		int num1 = gm.method1(2);
		System.out.println(num1); //2

	}

}
