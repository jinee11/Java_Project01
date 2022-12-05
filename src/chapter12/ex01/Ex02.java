package chapter12.ex01;

abstract class Calc2 { //사칙 연산을 계산하는 계산기 클래스
	
	abstract void add (int a, int b); //더하기 연산
	abstract void diff (int a, int b); //빼기 연산
	abstract void mul (int a, int b); //곱
	abstract void div (int a, int b); // 나누기 리턴 값 double 업캐스팅
}

class Calc_Impl2 extends Calc2{
	
	
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a/(double)b);
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		//구현클래스
		Calc2 a1 = new Calc_Impl2();
		a1.add(a, b);
		a1.diff(a, b);
		a1.mul(a, b);
		a1.div(a, b);
		
		//익명
		Calc2 a2 = new Calc2() {
			@Override
			void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
				
			}
			@Override
			void diff(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a*b);
			}
			@Override
			void mul(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a-b);
			}
			@Override
			void div(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println((double)a/(double)b);
			}
			
		};
		
		a2.add(a, b);
		a2.diff(a, b);
		a2.mul(a, b);
		a2.div(a, b);
		
		
	}

}
