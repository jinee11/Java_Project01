package my.chapter13.ex01;

interface Animal {
	void cry();
	void run();
}

class Tiger {
	
	void t1(Animal a) {
		a.cry();
		a.run();
	}
	
	class TigerChild implements Animal{
		@Override
		public void cry() {
			System.out.println("1운다");
		}@Override
		public void run() {
			System.out.println("1난다");
		}
	}
	
	Animal t3 = new TigerChild();
	void tt() {
		t3.cry();
		t3.run();
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t2 = new Tiger();
		t2.t1(new Animal() {
			@Override
			public void cry() {
				System.out.println("4운다");
			}@Override
			public void run() {
				System.out.println("4난다");
			}
		});
		
		t2.tt();


	}

}
