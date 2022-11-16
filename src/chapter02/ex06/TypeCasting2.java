package chapter02.ex06;

public class TypeCasting2 {

	public static void main(String[] args) {
		// 자동 타입 변환(업캐스팅) VS 수동 타입 변환(다운캐스팅)
		//1. 자동 타입변환 (업캐스팅 : 낮은 자료형에서 높은 자료형으로 자동 변환)
			// byte => short => int => long => float => double
		
		float value1 = 3; //int => float으로 업캐스팅 되어 들어감 = 3.0
		long value2 = 5; //int => long으로 업캐스팅 = 5 (long도 정수)
		double value3 = 7; //int => double = 7.0
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	System.out.println("========================");
		
		//2. 수동 타입변환 (다운캐스팅 : 높은 자료형에서 낮은 자료형으로 자동 변환)
	
		int value4 = (int) 3.5; //double => int 다운캐스팅 (수동) = 3
	//	float value5 = 7.8; // 오류 발생 double => float로 넣으려니까 오류
		float value5 = 7.8f; // double => float 다운캐스팅 = 7.8
		
		System.out.println(value4);
		System.out.println(value5);
		

	}

}
