package chapter07;

class Calc{
	
	
	//두 정수의 값을 받아서 더해서 값을 리턴
	int add (int a, int b) {
		return a + b;
	}
	
	// 빼기 diff
	int diff (int a, int b) {
		return a - b;
	}
	
	// 곱하기 mul
	int mul (int a, int b) {
		return a * b;
	}
	
	//나누기 div : double 두 정수 받아서 나누기 2
	double div (int a, int b) {
		return a / b;
	}
	
	//면적 rec (가로 :x 세로 :y)
	double rec (double x,double y) {
		return x * y; 
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Calc a = new Calc();
		System.out.println("더하기:"+a.add(10, 3));
		System.out.println("빼기:"+a.diff(5, 3));
		System.out.println("곱하기:"+a.mul(2, 3));
		System.out.println("나누기:"+a.div(100, 42));
		System.out.println("면적:"+a.rec(4, 2.2));
		
	}

}
