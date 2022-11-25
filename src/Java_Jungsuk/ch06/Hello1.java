package Java_Jungsuk.ch06;
//Tv 클래스 생성 = 타입 생성
class Tv{ //클래스 영역 시작 ! 변수선언,메서드 선언만 가능(변수선언,메서드선언 순서 상관없음)
	//tv 속성=멤버=인스턴스변수 생성
	String color;//색깔
	boolean power;//전원 상태
	int channel;//채널
	
	//tv 기능:메서드 생성 {메서드영역(지역변수)}
	void power() {power = !power;} //tv를 끄거나 켜는 기능
	void channelup() {++channel;} //채널을 높이는 기능
	void channeldown() {--channel;} //채널을 낮추는 기능
	
	//클래스 변수와 인스턴스 변수(생성영역:클래스 영역)
	/*1. 클래스변수=cv : static(데이터 공유한다는 뜻)이 붙은 변수는 cv
	 	- 객체의 속성 중 공통적인 건 cv (!공통속성)(ex 카드:폭,높이)
	 	static int width = 100; 폭
	 	static int height = 100; 높이
	 	- cv는 객체생성후 호출할때 리모컨변수.width 가 아니라 클래스명.width 이라고 호출해야한다
	 		(iv랑 헷갈리지 않기 위해)
	 	- cv는 객체에 iv에 함께 저장되지 않고 자동으로 별도의 메모리 1개에만 저장된다(iv와 번지 다름)
	 	- 자동으로 메모리에 로드되기 때문에 객체생성 없이 사용가능
	 
	  2. 인스턴스변수=iv : 객체란 iv가 모인것(이라고 대충 이해하자)
	  	- 객체의 속성 중 개별적인 건 iv (!개별속성)(ex 카드:숫자,무늬)
	  	String kind; 무늬
	  	int number; 숫자
	  
	 */
	
	
	
}//클래스 영역 끝

public class Hello1 {
	public static void main(String[] args) {
		Tv t; //Tv인스턴스를 사용하기 위한 변수 t선언(리모컨)
		t = new Tv(); //Tv 인스턴스 생성
		//변수사용
		t.channel = 7;
		//메서드 사용
//		t.channeldown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
		
	//객체배열
		/*이걸 객체배열로 바꾸기
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		*/
		
		//바꾸는 방법
	//tvArr:참조변수생성 //Tv타입참조변수3개 생성
		Tv[] tvArr = new Tv[3];//객체배열 생성 index0,1,2
		tvArr[0] = new Tv();//객체생성 !배열만 생성하면 안됨 객체 만들어서 채워줌
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();

		Tv t1 = new Tv();//index0 리모컨
		Tv t2 = new Tv();//index1
		Tv t3 = new Tv();//index2
		
		
		
		
	}

}


