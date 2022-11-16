package Java_Jungsuk.ch0203;


public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		System.out.println('3'-'0'+4); //7 ='3'문자에서 '0'을 빼서 숫자가됨
////		System.out.println("33" - "" + 4); //오류! 문자열은 해당안됨
//		System.out.println(Integer.parseInt("33")+4); //37
		
		
		int x = 3;
		
		System.out.println(-x + 5); //2
		System.out.println(x + 5 * 2); //13
		System.out.println(x + 3 < 5 * 2);//true
//		System.err.println(x > 3 || x < 5);// 앞의 값이 거짓 뒤의 값이 참 이라서 true
//		System.err.println(x > 3 && x < 5);// false
		
		int result = x + 2 * 3;
		
		System.out.println(x);//3
		System.out.println(result); //9
		
		System.out.println(x + 2 - 1);//4
		
		int a = x = 4;
		
		System.out.println(x); //4
		System.out.println(a); //4
			

		System.out.println(++a);//5
		System.out.println(a++);//5
		
			
			
	}

}
