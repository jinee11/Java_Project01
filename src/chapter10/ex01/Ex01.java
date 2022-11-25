package chapter10.ex01;
//<문제>

class Animal { //Animal 클래스를 상속해서 Tiger, Eagle, Lion 클래스 생성
					//자식 클래스에서는 필드1,메소드1 정의
				//LionChild 클래스는 Lion 클래스를 상속해서 필드1, 메소드1 정의
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal {
	String tigerName;
	
	void tigerAddr() {
		System.out.println("호랑이는 시베리아에 삽니다");
	}
}
class Eagle extends Animal {
	String eagleName;
	
	void eagleAddr() {
		System.out.println("독수리는 정글에 삽니다");
	}
}
class Lion extends Animal {
	String lionName;
	
	void lionAddr() {
		System.out.println("사자는 밀림에 삽니다");
	}
}
class LionChild extends Lion {
	String lionChildName;
	
	void lionChildAddr() {
		System.out.println("어린사자는 가족과 삽니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("=== Animal(부모) 필드 메소드 출력========");
		Tiger t1 = new Tiger(); //Tiger 객체 생성
		
		t1.name = "동물";
		t1.age = 0;
		t1.color = "없음";
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
		
		t1.eat();
		t1.sleep();
		
		System.out.println("=== Tiger 필드 메소드 출력========");
		t1.tigerName = "호랑이";
		System.out.println(t1.tigerName);
		
		t1.tigerAddr();
		
		//부모 필드 출력
		t1.name = "김호랑";
		t1.age = 5;
		t1.color = "노란색";
		System.out.println("동물이름 : " + t1.name);
		System.out.println("나이 : " + t1.age);
		System.out.println("색깔 : " + t1.color);
		
		//부모 메소드 출력
		t1.eat();
		t1.sleep();
		
		System.out.println("=== Eagle 필드 메소드 출력========");
		Eagle e1 = new Eagle();
		
		e1.eagleName = "독수리";
		System.out.println(e1.eagleName);
		
		e1.eagleAddr();
		
		System.out.println("=== Lion 필드 메소드 출력========");
		Lion l1 = new Lion();
		
		l1.lionName = "사자";
		System.out.println(l1.lionName);
		
		l1.lionAddr();
		
		System.out.println("=== LionChild 필드 메소드 출력========");
		LionChild l2 = new LionChild();
		
		l2.lionChildName = "어린 사자";
		System.out.println(l2.lionChildName);
		
		l2.lionChildAddr();
		
		//Lion 필드 메소드 출력
		l2.lionName = "어린사자2";
		System.out.println(l2.lionName);
		
		l2.lionAddr();
		
		//Animal 메소드 출력
		l2.eat();
		l2.sleep();
	

	}

}
