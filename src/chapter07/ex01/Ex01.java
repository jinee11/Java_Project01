package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		System.out.println(sum1(3,10));
		int n = sum1(3,4);
		System.out.println(n);
		
		//2
		System.out.println(sum2(2.0,3.1,5.2));
		double n1 = sum2(2,4,5);
		System.out.println(n1);
		
		//3
		Ex01 p1 = new Ex01();
		System.out.println(p1.sum3("가나초콜릿", "4", "1000"));
		String n2 = p1.sum3("갤럭시북", "2", "1000000");
		System.out.println(n2);
		
		System.out.println("=================");
		//4
		Ex01 p2 = new Ex01();
		System.out.println(p2.sum4(10, 20, 50));
		
		//5
		sum5();
		Ex01.sum5();
		
		//6
		int n3 = Ex01.sum6(12, 14);
		System.out.println(n3);
		System.out.println(Ex01.sum6(3, 5));
		
		//7
		Ex01 p3 = new Ex01();
		System.out.println(p3.sum7("하이", "미디어"));
	}
	
	//1.정수 값 3개를 인풋받아 더한값을 정수로 리턴하는 메소드(static)
	public static int sum1(int a, int b) {
		return a + b;
	}
	//2.실수 3개를 인풋받아서 더한값을 실수로 리턴하는 메소드(static)
	public static double sum2(double a, double b, double c) {
		return a + b + c;
	}
	//3.문자열을 연결해서 출력하는 메소드(인스턴스)
	 //"제품이름", "제품수량", "제품가격"
	 //객체생성 매개변수3개
	public String sum3(String a, String b, String c) {
		return a +" "+ b +" "+ c;
	}
	
	public int sum4(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void sum5() {
		System.out.println("안녕");
	}
	//6
	public static int sum6(int a, int c) {
		return a + c;
	}
	
	public String sum7(String a, String b) {
		return a +" "+b;
	}

}
