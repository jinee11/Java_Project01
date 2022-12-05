package chapter12.ex04;

interface Animal{}

interface Animal1 extends Animal {
	void cry();
}

interface Animal2 extends Animal  {
	void run();
}

interface Animal3  extends Animal {
	void eat();
}

//Cat, Tiger -- cry(), run()
//Dog, Lion -- eat(), run()
//Eagle -- cry(),eat(), run()

class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("고양이가 달립니다");
	}
}

class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이가 달립니다");
	}
}

class Dog implements Animal2,Animal3{
	@Override
	public void eat() {
		System.out.println("개가 먹습니다");
	}
	@Override
	public void run() {
		System.out.println("개가 달립니다");
	}
}

class Lion implements Animal2,Animal3{
	@Override
	public void eat() {
		System.out.println("사자가 먹습니다");
	}
	@Override
	public void run() {
		System.out.println("사자가 달립니다");
	}
}

class Eagle implements Animal1,Animal2,Animal3{
	@Override
	public void cry() {
		System.out.println("끼오");
	}
	@Override
	public void eat() {
		System.out.println("독수리가 먹습니다");
	}
	@Override
	public void run() {
		System.out.println("독수리가 달립니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//배열에 넣어서 오버라이딩된 메소드 출력
			//instanceof를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(),run()
			//instanceof를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat(),run()
			//instanceof를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(),eat(),run()
		
		Animal c1 = new Cat();
		Animal t1 = new Tiger();
		Animal d1 = new Dog();
		Animal l1 = new Lion();
		Animal e1 = new Eagle();
		
							//c1은 Cat,Animal1,Animal2의 정보를 담고 있다
		Animal[] arr = new Animal[] {c1,t1,d1,l1,e1};
		
		System.out.println("======쌤======");
		
		for(int i = 0 ; i <arr.length ; i++) {
			if(arr[i] instanceof Cat||arr[i] instanceof Tiger) { //arr[i]방에 Cat,Tiger타입이 있다면
				((Animal1)arr[i]).cry();
				//Animal1타입으로 다운캐스팅해서 cry()메소드를 출력해라
				((Animal2)arr[i]).run();
				//Animal2타입으로 다운캐스팅해서 run()메소드를 출력해라
			}if(arr[i] instanceof Dog||arr[i] instanceof Lion) {
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
			}if(arr[i] instanceof Eagle) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
			}
		}
			
		
		System.out.println("===내가 푼거===========");
		
		if (arr[0] instanceof Cat) {
			Cat c = (Cat) arr[0];
			c.cry();
			c.run();
		}
		
		if (arr[1] instanceof Tiger) {
			Tiger t = (Tiger) arr[1];
			t.cry();
			t.run();
		}
		
		if (arr[2] instanceof Dog) {
			Dog d = (Dog) arr[2];
			d.eat();
			d.run();
		}
		
		if (arr[3] instanceof Lion) {
			Lion l = (Lion) arr[3];
			l.eat();
			l.run();
		}
		
		if (arr[4] instanceof Eagle) {
			Eagle e = (Eagle) arr[4];
			e.cry();
			e.eat();
			e.run();
		}

	}

}
