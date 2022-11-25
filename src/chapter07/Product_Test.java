package chapter07;
//복습
//하나의 Java 파일에서 pubilc class는 하나만 올 수 있다(보통mail메소드가 들어간 class)

//외부 패키지에서는 접근이 불가
class Product{ //클래스: 객체를 생성하기 위한 틀(객체를 생성하기 위해 만든다)
			//객체는 main method에서 만든다 Product p = new Product(); <=객체화
	//1. 필드 (필드가 모여서 객체...객체의 속성값)
	String proName; //제품이름
	int proNo; //제품번호
	int proPrice; //제품가격
	int proCount; //제품의갯수
	
	//2. 생성자 : 1. 리턴타입이 존재하지 않는 메소드 2. 클래스 이름과 동일한 메소드
		//클래스 이름과 동일한 이름을 가지고 리턴 타입이 없는 메소드
		//객체 생성시 생성자 호출이 되야하고 필드의 기본값을 할당하는 역할.
	  //기본생성자 : 필드의 기본값을 로드	
	Product() {}	//기본생성자 : 인풋 값이 없는 생성자 
					//(기본 생성자는 생략가능하지만 다른 생성자가 존재할경우 반드시 명시해야한다)
	
	//객체 생성시 생성자 호출시 인풋 매개변수 2개
	Product(String proName, int proNo){
		this.proName = proName;
		this.proNo = proNo;
	}
	//객체 생성시 생성자 호출시 인풋 매개변수 4개
	Product(String proName, int proNo, int proPrice, int proCount){
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice= proPrice;
		this.proCount= proCount;
	}
	
	//3. 메소드 (리턴타입이 반드시 존재한다(없으면 viod):객체의 기능(액션)
		//호출시 필드의 값을 찍어주는 역할(리모컨이 이걸 부르는것)
	void print() {
		System.out.println("제품이름 : "+proName);
		System.out.println("제품번호 : "+proNo);
		System.out.println("제품가격 : "+proPrice);
		System.out.println("제품수량 : "+proCount);
	}
	
	//4. 이너클래스(Inner class: class 내의 class)
	
}


public class Product_Test {//다른패키지에서 접근이 가능한 클래스
	//클래스 내부 블락에 올 수 있는 3가지
		//1. 필드or멤버변수or멤버필드or인스턴스변수 : 클래스 블락에 오는 변수
				//heap 공간에 필드명과 값, stack에 번지 저장
	
	int b = 7;//필드(파란색)
	
				//리턴  메소드이름(매개변수 변수이름)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int a = 3; //지역변수(메소드 영역내) :Stack공간에 변수명과 값이 저장(갈색)
		
		//1.객체 생성 (클래스 ==> 객체 : 인스턴스 화)
		
		//기본생성자 호출
		Product p1 = new Product();	//생성자 호출(객체생성) <p1은 리모컨이라고 생각>
		p1.print(); //필드 초기화 값 호출
		
		System.out.println("===================");
		
		//매개변수 2개인 생성자 호출(객체생성)
		Product p2 = new Product("샴푸", 2022112101); //값을 인풋
		p2.print(); //인풋한 값을 출력
		
		System.out.println("=====================");
		
		//매개변수 4개
		Product p3 = new Product("자동차", 2022112102, 3000, 4);
		p3.print();
		
		//매개변수 4개
		Product p4 = new Product("삼성모니터", 2022112103, 30, 100);
		p4.print();
		
	}

}
