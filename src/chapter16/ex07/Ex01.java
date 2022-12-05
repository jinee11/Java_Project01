package chapter16.ex07;

//<문제>

abstract class Fluit {
	abstract void print(); //추상메소드, 객체의 필드정보를 출력
}

class Apple extends Fluit{
	private String name;
	private int price;
	
	//getter,setter를 통해서 인풋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//print() 오버라이딩해서 필드의 정보 출력
	@Override
	void print() {
		System.out.println("상품이름은 : " + name + " 가격은 : " +  price);
	}
	
}
class Banana extends Fluit{
	private String name;
	private int price;
	
	//getter,setter를 통해서 인풋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//print() 오버라이딩해서 필드의 정보 출력
	@Override
	void print() {
		System.out.println("상품이름은 : " + name + " 가격은 : " +  price);
	}
}

//Fulit을 상속하지 않았기 때문에 제너릭 타입으로 저장이 불가
class Pencil {
	private String name;
	private int price;
}

//제너릭 클래스 : Fluit을 상속하는 클래스만 저장할 수 있는 제너릭 클래스
class GnerincClass <T extends Fluit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//1. Apple를 제너릭 클래스에 저장후 출력
		//Apple 객체를 만들어야 필드에 setter으로 저장가능한듯
		Apple a1 = new Apple();
		
		//필드에 값넣기
		a1.setName("사과");
		a1.setPrice(1000);
		
		//1-1 제너릭 클래스에 저장 확인 및 print() 메소드 호출
		GnerincClass<Apple> g1 = new GnerincClass<>();
		g1.setT(a1);
		g1.getT().print();
		
		//바나나
		Banana a2 = new Banana();
		
		a2.setName("바나나");
		a2.setPrice(2000);
		
		GnerincClass<Banana> g2 = new GnerincClass<>();
		g2.setT(a2);
		g2.getT().print();

	}

}
