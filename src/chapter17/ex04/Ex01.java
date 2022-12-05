package chapter17.ex04;

import java.util.ArrayList;

//<문제>
//Car 객체를 3개정도 생성해서 생성자를 통해 값을 넣고 ArrayList에 저장후 객체를 출력시 필드의 값을 출력하도록 함
//for, Enhanced for, 컬렉션 자체를 출력해보기

class Car {
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car (String company, String CarModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = CarModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<Car> a1 = new ArrayList();
		
		Car c1 = new Car("삼성","sm5","흰색",200);
		Car c2 = new Car("현대","캐스터","노란색",180);
		Car c3 = new Car("기아","K9","검은색",220);
		
		a1.add(c1); a1.add(c2); a1.add(c3);
		
		System.out.println("====for=====");
		
		for (int i = 0; i < a1.size() ; i ++) {
			Car aa1 = a1.get(i);
			System.out.println(aa1);
		}
		
		System.out.println("====Enhanced for=====");
		
		for (Car k : a1) {
			System.out.println(k);
		}
		
		System.out.println("====컬렉션=====");
		
		System.out.println(a1);

	}

}
