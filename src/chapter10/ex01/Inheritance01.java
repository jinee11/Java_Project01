package chapter10.ex01;

class Human { //부모 클래스(super class) : 자식클래스의 공통된 특징을 저장(필드,메소드)
	
	//필드 (속성)
	String name;	//사람이름
	int age;		//사람나이
	
	//메소드 : 프로그래밍의 기능을 구현해 놓은것 
	void eat() {
		System.out.println("모든 사람은 먹습니다");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잡니다.");
	}
	
}

//자식 클래스 : 부모클래스의 모든 필드와 메소드를 물려 받는다.
class Student extends Human { //자바에서 화살표를 보내는 쪽이 자식
	//부모 클래스 : Human
	//자식 클래스 : Student	<= 부모 클래스의 필드와 메소드를 물려 받는다.
		//human(부모)밑에 학생, 직장인등 다양한 클래스(자식)를 생성하는걸 다형성이라고 한다.
	
	//1. 부모 클래스의 모든 필드와 메소드를 그대로 자식클래스 내부에 들어와 있다.
	//2. 자식 클래스에서만 적용되는 필드와 메소드를 추가적으로 등록해서 사용할 수 있다.
	
	int studentID;
	
	void goToSchool() {
		System.out.println("학생은 학교에 다닙니다.");
	}
}

class Worker extends Human {
	
	int workerID;
	
	void goToWork() {
		System.out.println("근로자는 일을 하러 일터로 갑니다.");
	}
}

class Professor extends Human {
	
	int professorID;
	void goToTeach() {
		System.out.println("교수님은 가르치러 갑니다.");
	}
}

class Student2 extends Student {
	//Student2 --> Student --> Human
	//Human의 모든 필드와 메소드 상속
	//Student의 모든 필드와 메소드 상속
	
	int student2ID;
	void student2 () {
		System.out.println("학생 2 입니다");
	}
}


public class Inheritance01 {

	public static void main(String[] args) {
		// 상속 (Inheritance) : 부모 클래스의 필드(속성)와 메소드(기능)를 자식 클래스에서 물려받아서 사용함.
			//객체 지향 언어의 꽃(제일 중요함), 
			//장점 : 중복된 코드를 줄여줄 수 있다.
			//상속의 특징 - 다형성 : 부모클래스를 상속받아서 다양한 형태로 출력
			//배열이나 컬렉션에 부모클래스 이름으로 (업캐스팅) 저장해서 출력
		
		//1. 학생(Student class) 객체 생성 : 부모의 필드와 메소드 + 자식의 필드와 메소드 모두 사용 가능
		Student s1 = new Student();
		
		//부모의 필드와 메소드 출력
		System.out.println("====부모의 필드와 메소드 출력=========");
		s1.name = "홍길동"; //부모의 필드에 값을 할당하지만 Student 클래스에 한정, 공유되지 않는다
		s1.age = 30;
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		s1.eat();
		s1.sleep();
		
		//자식의 필드와 메소드 출력
		System.out.println("====자식의 필드와 메소드 출력=========");
		s1.studentID = 2222;
		System.out.println(s1.studentID);
		
		s1.goToSchool();
		
		System.out.println("======= Worker 클래스 객체 생성=====================");
		
		Worker w1 = new Worker();
		//부모클래스의 필드 메소드 그대로 상속
		w1.age = 40;
		w1.name = "이순신";
		System.out.println(w1.age);
		System.out.println(w1.name);
		w1.eat();
		w1.sleep();
		
		//자신의 클래스의 필드와 메소드 출력
		w1.workerID = 3333;
		System.out.println(w1.workerID);
		w1.goToWork();
		
		System.out.println("===== Student2 --> Student --> Human ===========");
		
		Student2 s2 = new Student2();
		
		System.out.println("==== Human 필드 메소드 출력 ===========");
		//Human 필드, 메소드 호출 출력
		s2.age = 27;
		s2.name = "신사임당";
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		s2.eat();
		s2.sleep();
		
		System.out.println("==== Student 필드 메소드 출력 ===========");
		
		s2.studentID = 1234;
		System.out.println(s2.studentID);
		
		s2.goToSchool();
		
		System.out.println("==== Student2 필드 메소드 출력 ===========");
		s2.student2ID = 5678;
		System.out.println(s2.student2ID);
		
		s2.student2();
		
	}

}
