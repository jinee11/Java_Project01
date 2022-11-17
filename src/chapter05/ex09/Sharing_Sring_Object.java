package chapter05.ex09;

public class Sharing_Sring_Object {

	public static void main(String[] args) {
		// 문자열 객체의 공유
		
		//1. 문자열 객체의 공유 : 리터럴로 객체를 생성시 공유됨
		//	- new 생성자를 사용해서 객체를 생성할때는 공유되지 않는다. 별도의 공간에 생성됨(Heap)
		
		String str1 = new String("안녕"); 
		//new(참조)라서 동일한 글자여도 리터럴과 별도로 heap에 값 생성
		String str2 = "안녕"; //리터럴이라서 동일한 글자 번지 공유
		String str3 = "안녕";
		String str4 = "안녕";
		String str5 = new String("안녕");
		
		//2. Stack 메모리의 주소값 비교 (==:Stack의 값을 비교)
		//	- Heap 의 값을 비교 : (참조객체.equals(비교객체));
		
		System.out.println(str1 == str2);//false/같은 번지인지 비교하는 거라서 값은 같지만 다른 번지
		System.out.println(str2 == str3);//true/리터럴(변수)로 만들어서 같은 번지 공유
		System.out.println(str4 == str3);//true
		System.out.println(str2 == str4);//true
		System.out.println(str1 == str3);//false
		
		System.out.println("========================");
		//3. equals() : Heap 영역의 값을 비교(equals는 메소드)
		System.out.println(str1.equals(str2)); //true
			//heap 값이 str5까지 동일해서 모두 true
		
		
		
		
		

	}

}
