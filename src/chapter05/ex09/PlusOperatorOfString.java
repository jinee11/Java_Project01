package chapter05.ex09;

public class PlusOperatorOfString {

	public static void main(String[] args) {
		// + : 문자열일때 문자열을 연결
		// + : 정수일때는 + 연산자로 사용
		
		//1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);//안녕하세요!
		
		String str2 = "반갑"; //<- 많이 쓰는 형식
		str2 += "습니다";		//str2 = str2 + "습니다"
		str2+= "!";			//str2 = str + "!"
		
		System.out.println(str2);//반갑습니다!
		
		//2. 문자열 + 기본자료형 연결(8가지)
		String str3 = "안녕" + 1; 
		String str4 = "안녕" + false;
			//기본자료형은 String 자료형으로 변환 : String.valueOf(1); //
		String str5 = "안녕" + String.valueOf(1);//1을 문자열로 바꾸어라
		String str6 = "안녕" + "1";
		
		System.out.println(str3);//안녕1
		System.out.println(str4);//안녕false
		
		
		

	}

}
