package chapter14.ex05;

//1. 우리가 생성한 객체를 자동으로 리소스 해제하기 //메모리를 비우기 위해 하는것
	//AutoCloseable 인터페이스를 구현해야한다.
		//close() 메소드를 재정의 해야한다.

class A implements AutoCloseable{ //1-1 AutoCloseable 인터페이스를 상속한 클래스 만들기
	
	String resource; //1-2 String 필드만들기
	
	A (String resource){ //1-3 String 인풋값 생성자 만들기
		this.resource = resource;
	}
	
	@Override //1-4 인터페이스의 close() 호출해서 재정의
	public void close() throws Exception { 
				//close() 메소드를 호출하는 곳에서 예외처리 필요
		
		//1-5
		if (resource != null) { //resource가 null값이 아니면 아래블락 실행
			resource = null; //resource에 null값 할당하면 리소스해제
			System.out.println("리소스가 해체 되었습니다."); //확인하게 걍 출력
		}
	}
}

public class TryWithResource03 {

	public static void main(String[] args) {
		
		System.out.println("===== 2. 리소스를 수동으로 제거하기 ====");
		// 2. 리소스를 수동으로 제거하기
		A a1 = null; //2-1
		
		try { //2-2
			
			a1 = new A ("문자열 입력"); //2-3
			System.out.println(a1.resource); //"문자열 입력" 출력
			System.out.println("===================");
			
		} catch (Exception e) {
			
			System.out.println("예외가 발생되었습니다."); //2-4
			e.printStackTrace();
			
		} finally {
			
			//객체의
			if (a1.resource != null) { //2-5
//				a1.close(); //2-6 여기서 마우스 갖다대고 with try/catch 아래 블락 만들어짐
				try { //2-7
					a1.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				} 
			}
		}
		System.out.println(a1.resource); //2-8 null로 호출
		
		
		System.out.println("===== 1. 자동으로 객체 리소스 제거 =============");
		// 1. 그 객체가 AutoCloseable 인터페이스의 close() 메소드를 재정의가 필요.
		// 2. try (객체를 선언, 생성) 경우 : 자동으로 close()
		
							//resource 필드에 값 저장
		try ( A a2 = new A("생성자 필드에 값 입력");){//1-6
			//객체를 생성하고 선언하면 자동으로 close() 메소드 호출
			
			System.out.println(a2.resource);
			//1-6에 입력한 "생성자필드에 값 입력"이 resource 필드에 할당되어 출력
			
		}catch (Exception e) { //1-7
			
		}

	}

}
