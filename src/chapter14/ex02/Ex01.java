package chapter14.ex02;
//<응용>
public class Ex01 {

	public static void main(String[] args) {
		//try catch finally 구문을 사용해서 예외처리
		int[] arr = new int[] {1,2,3,4};
		
		//실행시 예외발생 : ArrayIndexOutOfBoundsException
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arr[5]번 방은 없습니다");
		} finally {
			System.out.println("finally 반드시 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
