package chapter05.ex09;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		// String 클래스에서 사용되는 주요 메소드(함수)
			//기본자료형 : 8가지 <=첫자 모두 소문자
			//참조자료형 : 배열 / 열거 / 객체 / 인터페이스 <==첫자 모두 대문자
		
		//1. 문자열의 길이 (length())
		//[참조]자료형   [참조]변수
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());	//11=글자의 갯수(공백까지 포함)
		System.out.println(str2.length());	//13
		
		//2. 문자열 검색 ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1)); //=e/1번방의 문자를 출력
		System.out.println(str2.charAt(1)); //=녕/1번방의 문자를 출력
		
		System.out.println("======================");
		
			//indexOf(), lastIndexOf(); : << 한 문자의 방번호를 검색 >>
		System.out.println(str1.indexOf('a'));//=7/문자 a가 저장된 방번호 출력(검색을 왼쪽에서부터 시작)
		System.out.println(str1.lastIndexOf('a')); //=9/a가 저장된 마지막 방번호 출력(검색을 오른쪽에서부터 시작)
		
		System.out.println(str1.indexOf('a', 8));//8번방부터 오른쪽으로 a를 검색 =9
		System.out.println(str1.lastIndexOf('a', 8));//8번방부터 왼쪽으로 검색 =7
		
//		String str1 = "Hello Java!";
//		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println("=========================");
		
			//문자열을 검색 해서 방번호를 출력
		System.out.println(str1.indexOf("Java")); //6 (문자가 시작하는 번호 한자리만 출력)
		System.out.println(str2.indexOf("하세요")); //2
		System.out.println(str1.lastIndexOf("ello")); // 1
		
			//문자열 검색에 실패시 : -1 값을 출력
		System.out.println(str1.indexOf("bye")); //-1
				
		
		//3. 문자열 변환 및 문자열 연결 : String.valueOf(), concat()
		// String.valueOf() : 기본자료형 => String 자료형으로 변환
		
//			String str3 = 2.3;	//오류발생! 2.3 (double형 데이터를 String에 저장시 오류)
			String str3 = String.valueOf(2.3);
//			String str4 = true;	//오류발생! boolean
			String str4 = String.valueOf(true);
			
			System.out.println(str3); //2.3
			System.out.println(str4); //true
			System.out.println("==============================");
			
			//concat() : + 연산자와 같은 문자열과 문자열을 연결시켜주는 메소드
			
			String str5 = str3.concat(str4);
			String str6 = str3 + str4;
			System.out.println(str5); // 2.3true
			System.out.println(str6); // 2.3true
			
			//String.valueOf() + concat() ==> +
			String str7 = "안녕" + 3 ; //안녕3 ,3이 string 형으로 자동변환
			String str8 = "안녕".concat(String.valueOf(3)); //내부적으로 작동됨
			
			System.out.println(str7);//안녕3
			System.out.println(str8);//안녕3
			
			System.out.println("======================");
			
			//4. 문자열 ==> byte[] ( gatBytes() )
			//	 문자열 ==> char[] ( toCharArray() )
			
			String str10 = "Hello Java!";
			String str11 = "안녕하세요! 반갑습니다.";
		
			//gatBytes() : 문자열을 1글자씩 잘라서 byte 배열에 저장, 아스키 코드값이 출력
			byte[] arr1 = str10.getBytes(); //str10의 문자열 어쩌구..아스키코드값을 배열변수 arr1에 저장
			byte[] arr2 = str11.getBytes(); //한글은 유니코드
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("======================");
			
			//toCharArray() :
			char[] arr3 = str10.toCharArray();//문자열을 한글자씩 잘라서 저장
			char[] arr4 = str11.toCharArray();
			
			System.out.println(Arrays.toString(arr3));//[H, e, l, l, o,  , J, a, v, a, !]
			System.out.println(Arrays.toString(arr4));//[안, 녕, 하, 세, 요, !,  , 반, 갑, 습, 니, 다, .]
			
			System.out.println(arr3[0]); //H
			
			//5. 문자열 수정, 대문자로 출력 : toUpperCase();, 소문자로 변환: toLowerCase();
			System.out.println(str1.toLowerCase()); //소문자로 변환 =hello java!
			System.out.println(str1.toUpperCase()); //대문자로 =HELLO JAVA! 
			
			System.out.println("=============================");
			
			//6. 문자열 수정 : replace("수정할원본", "수정할내용");
							// substring(시작방법호, 잘라올 방번호);
			String str13 = "안녕 자바 world";
			
			System.out.println(str1.replace("Hello", "안녕")); //안녕 Java!
			System.out.println(str13.replace("world", "월드")); //안녕 자바 월드
			
			//substring( 0, 5); //0번방에서부터~5번 방 !앞 까지 잘라서 출력 /0,1,2,3,4/
			System.out.println(str13.substring(0,5));//안녕 자바/0,1,2,3,4/
				//모든 프로그램에서 시작은 포함, 끝은 미포함
			System.out.println(str13.substring(3,11));//자바 world
			
			//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장
			String[] strArray = "abc/def-ghi jkl".split("/|-| ");//문자열 자르는 기준(" / or - or 공백 ")
			// abc=0번방, def=1번방, ghi=2번방, jkl=3번방
			
			System.out.println(Arrays.toString(strArray));//[abc, def, ghi, jkl]
			
			System.out.println("====================");
			
			//trim() : 문자열 앞, 뒤 공백을 제거하는 메소드
			
			System.out.println("       abc           ".trim());
			
			System.out.println("====================");
			
			//7. 문자열의 내용비교 ( equals(), equalsIgnoreCase() )
			
				//equals() : heap의 값을 비교, 대소문자까지 체크
				//equalsIgnoreCase() : heap의 값을 비교, 대소문자 체크 안함
			String str20 = new String("Java");
			String str21 = new String("Java");
			String str22 = new String("java");
			
			//== : stack 메모리의 참조 주소 비교.
			System.out.println(str20 == str21);//false (new라서)
			System.out.println(str20 == str22);//false
			System.out.println(str22 == str21);//false
			
			System.out.println("===========================");
			
			//equals() : 대소문자를 체크하면 heap의 값 비교.
			System.out.println(str20.equals(str21)); //true
			System.out.println(str21.equals(str22)); //false(대소문자구별)
			System.out.println(str21.equalsIgnoreCase(str22)); //true(대소문자구별x)
			
			
			
		
		
		
		

	}

}
