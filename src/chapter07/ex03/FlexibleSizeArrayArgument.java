package chapter07.ex03;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// 가변길이 배열 매개변수 처리, Argument로 전송되는 배열의 길이가 다이나믹하게 가변적으로 변화됨
		
		method1 (1,2);//(values안에 1,2 입력하고 호출)
		method1 (3,4,5,6,7,8,9); //()<-메소드로 호출할때 매개변수 갯수
		method1 (11,12,13,14,15,16,17,18);
		method1 ();
		
		System.out.println("=============================");
		method2 ("안녕");
		method2 ("안","녕","반","갑");
		method2 ("안녕","땡","큐","베리","감","사");
		
	}
	
	//가변 길이 배열 메소드 선언 : 정수를 인풋받는 가변 길이 배열
	public static void method1 (int...values) { //... <- 인풋매개변수를 호출에서 여러개로 인풋받을수있다
		System.out.println(Arrays.toString(values));
	}
	//가변 길이 배열 메소드 선언 : String을 인풋받는 가변 길이 배열
	public static void method2 (String...values) {
		for(int i = 0; i <values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}
	

}
