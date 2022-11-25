package chapter07.ex01;

public class InernalcallMethod {

	//main : 메소드 <= static ...메소드는 반드시 클래스 영역에서 만들어야한다
	public static void main(String[] args) {
		// 클래스 내부에서 다른 메소드 호출
			//main 메소드는 메소드 이름 앞에 public : 다른 패키지에서 호출이 가능하다.
			//static : 인스턴스화 하지 않고 사용 가능하다. 객체를 생성하지 않고 사용가능하다.
		
		//print 메소드 호풀 (객체 생성 없이 바로 호출 가능)
		print();
		System.out.println("===================");
		
		//twice(33); 호출
		int ab = twice(33); //매개변수로 정수 하나를 인풋하고 호출
		System.out.println(ab); //2배 곱해서 호출
		
		System.out.println(twice(22)); //변수 안만들고 바로 호출
		
		System.out.println("===============");
		
		//sum 호출
		double bc = sum (4, 5.0);
		System.out.println(bc);
		System.out.println(sum(8,11.5));

		//sum2는 바로 호출시 오류가 발생 <== 객체화해서 호출
//		double de = sum2(20,33.3);//오류! 객체화 하지 않아서
		
		//sum2 메서드 호출(인스턴스 메소드) : 객체화해야 사용가능
		InernalcallMethod p1 = new InernalcallMethod(); //객체생성
		double cd = p1.sum2(33, 44.4); //변수생성
		System.out.println(cd);
		
		System.out.println(p1.sum2(20, 21.5));
	}
	
	//static 메소드는 객체화 하지 않고 바로 호출가능
	
	public static void print() { //main이외의 메서드는 호출하기 위해 만듦
		System.out.println("안녕 ");
	}
	//정수를 인풋 받아서 2배로 만들어서 돌려줌(리턴타입 int)
	public static int twice(int k) {
		return k * 2;
	}
	//리턴값이 더블로 업캐스팅되어 리턴
	public static double sum(int m, double n) {
		return m + n;//double n을 인트로 다운캐스팅해서 int로 리턴할수 있음
	}
	
	//static 키 없이 메소드 생성 : 인스턴스 메소드(반드시 객체화해야 호출 가능)
	public double sum2(int m, double n) {
		
		return m + n;
	}

	
}
