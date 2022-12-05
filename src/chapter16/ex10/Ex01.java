package chapter16.ex10;

//<문제>

//제너릭 클래스 / 제너릭 메소드를 사용해서 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성

//1-1 점의 좌표를 처리하는 클래스 생성 <제너릭클래스>
class Point <X,Y> {
	X x;
	Y y;
	
	//1-2생성자를 사용해서 x,y 값 인풋(private아니라서 가능)
	Point(){} //기본생성자 있어야함
	Point (X x, Y y){ //x는 x좌표, y는 y좌표
		this.x = x;
		this.y = y;
	}
	//1-3getter만 생성해서 필드값을 가져오게 하면됨
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
}

//1-4 점의 좌표를 저장하는 클래스
	//제너릭 메소드 : 일반클래스 내부에 존재할수있다
class GenericMethod {
	
	//1-5 makeRectangle() 호출시 두점의 좌표 p1,p2를 인풋해서 넓이 계산 후 리턴
	public static <X,Y> double makeRectangle (Point<X,Y> p1, Point<X,Y> p2) {
		/*
		 내가 구글링해서 찾아본것 
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getX()).doubleValue();
		double bottom = ((Number)p2.getX()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		*/
		/*쌤방법*/
		 double width = (double)p2.getX() - (double)p1.getX();
		 double height = (double)p2.getY() - (double)p1.getX(); 
		
		return width*height; //넓이 리턴
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		//1-6두점의 좌표를 저장하는 p1, p2 객체 생성(각각 x,y 인풋값 저장)
		Point<Double,Double> p1 = new Point<>(3.0, 3.0);
		Point<Double,Double> p2 = new Point<>(5.0, 5.0);
		
		//1-7makeRectangle(p1, p2) 매걔변수로 던져주면 넓이를 계산해서 리턴으로 받아옴
		GenericMethod g1 = new GenericMethod();
		g1.makeRectangle(p1, p2);
		System.out.println(g1.makeRectangle(p1, p2));
		
		//!static이라서 객체 안만들고 바로 호출가능
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 좌표의 넓이는 : " + rect + "입니다.");
	}

}
