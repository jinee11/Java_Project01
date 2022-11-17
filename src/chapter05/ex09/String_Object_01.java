package chapter05.ex09;

import java.util.Arrays;

public class String_Object_01 {

	public static void main(String[] args) {
		// 참조 자료형 : 객체 ( String )
		/*
		 	String 문자열을 저장하는 자바에서 생성해놓은 객체 (객체는 첫글자가 대문자로 시작됨)
		 		- 다른 개체와 다른 특수한 기능들이 들어있다.
		 */
		
		//1-1 String으로 객체 생성 방법 <= 별도의 주소에 생성됨.
		String str1 = new String ("안녕");	//생성자를 사용해서 값을 넣는 방법
		System.out.println(str1);
		
		//1-2 String으로 객체 생성 방법  <= 다른 객체와 공유
		String str2 = "안녕하세요";			//리터럴 형식으로 값을 넣는 방법 
		System.out.println(str2);
		
		System.out.println("=====문자열 수정============");
		
		//2. 문자열 수정 (객체 내의 내용 변경 불가 => 새로운 객체가 생성)
			//! String만 특수한 경우 다른 int나 double는 수정가능
		String str3 = new String("안녕2");
		String str4 = str3;	//str3의 번지를 복사
		
		str3 = "안녕하세요"; //haep의 기존 값을 수정하는게 아니라 별도의 값 생성
		
		System.out.println(str3); //생성한 새 번지 출력 //안녕하세요
		System.out.println(str4); //기존 srt3의 번지 출력 //안녕2
		
		System.out.println("========배열의 참조 볌수===========");
		
		//배열의 참조 볌수 : 객체 내부의 값을 수정할 수 있다
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1; //번지를 복사
		
		arr1[0] = 7; //내부의 값을 수정하는거라 번지수는 그대로다
		arr1[1] = 8;
		arr1[2] = 9;
		
		System.out.println(Arrays.toString(arr1)); //7,8,9
		System.out.println(Arrays.toString(arr2)); //7,8,9
		
		
		

	}

}
