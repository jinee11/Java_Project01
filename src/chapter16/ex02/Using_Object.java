package chapter16.ex02;

//모든 객체는 Object를 상속하고 있다.
//모든 객체는 Object 타입으로 타입 변환 할 수 있다
	//단점 : Object 타입으로 지정된 객체를 가져와서 사용하기 위해서는 매번 다운캐스팅이 필요하다
	 //!해결 : Generic을 사용하면 다운캐스팅 할 필요 없다 - 뒷장에 배움

			//1-5
class Apple {String apple = "애플";} //상품
class Pencil {String pencil = "연필";} //상품
class Banana {String banana = "바나나";} //상품
class Orange {String orange = "오렌지";} //상품

class Goods { //상품바구니
	
	//1-1. 오브젝트 객체 생성
	//Object는 자바의 모든 객체를 담을 수 있는 타입이다
	private Object object = new Object();

	//1-2. 오브젝트 객체의 getter,setter
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
}

public class Using_Object {

	public static void main(String[] args) {
		// *1-3 Goods를 사용해서 Apple 객체를 저장 후 가져오기
		Goods goods1 = new Goods();
		
		//Apple 객체를 생성해서 그 객체에 setter 주입
		goods1.setObject(new Apple()); 
		
		//1-4 
		//getter를 사용해서 값을 가져올때는 다운캐스팅해서 가져와야한다
		Object obj = goods1.getObject(); //
		Apple app1 = (Apple) obj; //obj에는 Apple() 정보가 들어있다
		
		//두줄로 분리안하고 가능
		Apple app2 = (Apple) goods1.getObject();
		System.out.println(app2.apple); //*Apple 클래스 String 필드 호출
		
		// *1-3 Goods를 사용해서 Pencil 객체를 저장 후 가져오기
		goods1.setObject(new Pencil()); //Pencil 객체를 setter를 통해 넣는다
		//그럼 Goods 클래스의 public void setObject(Object object)에 들어가고
		//그뒤 자세한 과정은 노션 참고
		
		Object obj2 = goods1.getObject(); //getter로 
		Pencil pen1 = (Pencil) obj2;
		System.out.println(pen1.pencil);
		
		//
		goods1.setObject(new Banana());
		Banana banana = (Banana) goods1.getObject(); //바로 다운캐스팅으로 불러오기가능
		System.out.println(banana.banana);
		
		
		

	}

}
