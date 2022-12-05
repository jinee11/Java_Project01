package chapter12.ex01;

abstract class Calc { //사칙 연산을 계산하는 계산기 클래스
	
	Calc(){}
	abstract int add (int a, int b); //더하기 연산
	abstract int diff (int a, int b); //빼기 연산
	abstract int mul (int a, int b); //곱
	abstract double div (int a, int b); // 나누기 리턴 값 double 업캐스팅
}

class Calc_Impl extends Calc { //콘크리트 클래스(Calc)
	
	Calc_Impl(){}
	
	@Override
	int add(int a, int b) {
		return a + b;
	}
	@Override
	int diff(int a, int b) {
		return a - b;
	}
	@Override
		int mul(int a, int b) {
			return a * b;
		}
	@Override
		double div(int a, int b) {
			return (double) a / (double) b;
		}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		//1. 구현클래스의 메소드 호출후 출력
		Calc a1 = new Calc_Impl();
		System.out.println(a1.add(a, b));
		System.out.println(a1.diff(a, b));
		System.out.println(a1.mul(a, b));
		System.out.println(a1.div(a, b));
		
		
		//2. 익명클래스로 메소드 호출후 출력
		Calc a2 = new Calc() {
		@Override
		int add(int a, int b) {
			return a + b;
		}
		@Override
			int diff(int a, int b) {
				return a - b;
			}
		@Override
			int mul(int a, int b) {
				return a * b;
			}
		@Override
			double div(int a, int b) {
				// TODO Auto-generated method stub
				return  a / (double) b;
			}
		};
		
		System.out.println(a2.add(a, b));
		System.out.println(a2.diff(a, b));
		System.out.println(a2.mul(a, b));
		System.out.println(a2.div(a, b));
		
	}

}
