package chapter14.ex03;
//<문제>
import java.nio.file.spi.FileSystemProvider;

public class Ex01 {

	public static void main(String[] args) {
		// 3개의 예외를 하나의 try~catch 블락에 넣고
			//각각 예외에 대해서 catch
			//한꺼번에 처리
		
		int[] arr = new int[] {1,2,3};

		//1 각각의 try 블락에서 처리
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로 나눌 수 없습니다");
		}
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arr[5]번방은 없습니다");
		}
		
		try {
			int num1 = Integer.parseInt("20A");
		} catch (NumberFormatException e) {
			System.out.println("문자로 변환할 수 없습니다");
		} finally {
			System.out.println("첫번째 프로그램 종료");
		}
		
		System.out.println("===============");
		
		//2 한번에
		try {
		System.out.println(3/0); //정상처리인데도 catch실행.. & && == 이런걸 써야하는거 아닌가?
		System.out.println(arr[5]); 
		int num2 = Integer.parseInt("20A"); 
		} catch(ArithmeticException  | ArrayIndexOutOfBoundsException  | NumberFormatException e) {
			System.out.println("모든 예외를 하나의 블락에서 처리");
			
			System.out.println(e.getMessage()); //예외의 간단한 정보를 출력할때 
			e.printStackTrace(); 				//예외의 세부적인 정보를 출력
		} 
		

	}

}
