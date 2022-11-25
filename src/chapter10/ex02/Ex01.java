package chapter10.ex02;
//<문제>

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human {
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student {
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛나게 먹습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 클래스 객체를 생성하면서 Human 타입으로 지정 : h1
		Human h1 = new Student(); //업
		h1.eat(); //타입 Human이라서 사용은 Human만 가능
		
		System.out.println("===============");
		//2. Student 클래스 객체를 생성하면서 Student 타입으로 지정 : s1 
		Student s1 = new Student();
		//Human,Student 사용가능
		s1.eat();
		s1.stuEat();
		
		System.out.println("===============");
		//3. Student2 클래스 객체를 생성하면서 Human 타입으로 지정 : h2 
		Human h2 = new Student2(); //업
		//Human만 사용가능
		h2.eat();
		
		System.out.println("===============");
		//4. Student2 클래스 객체를 생성하면서 Student 타입으로 지정 : s2 
		Student s2 = new Student2();
		//Student, Human 사용가능
		s2.eat();
		s2.stuEat();
		
		System.out.println("===============");
		//5. Student2 클래스 객체를 생성하면서 Student2 타입으로 지정 : s3
		Student2 s3 = new Student2();
		//Human, Student, Student2 다 사용 가능
		s3.eat();
		s3.stuEat();
		s3.stu2Eat();
		
		Student s5 = s3;
		
		
		System.out.println("====다운 캐스팅========");
		//다운은 부모 객체를 생성하면서 타입을 자식으로 <- 이거아님!!
		//!!다운 캐스팅할 타입으로 만들고 객체를 부모타입을 적어서 ()에 다운캐스팅할 클래스 적기!!
		//^이거보다는 다운캐스팅할 객체를 먼저 캐스팅하고 시작한다고 생각하기...
		
		//Student s5을 Student2 s4로 다운 캐스팅
		System.out.println(s5 instanceof Student);//true
		System.out.println(s5 instanceof Human);//true
		System.out.println(s5 instanceof Student2);//true
		
		Student2 s4 = null;
		if(s5 instanceof Student2) {
			s4 = (Student2) s5;
		}
		//s4는 Human,Student,Student2 사용가능
		s4.eat();
		s4.stuEat();
		s4.stu2Eat();
		
	
//		//3. Student2 클래스 객체를 생성하면서 Human 타입으로 지정 : h2 
//				Human h2 = new Student2(); //업
//				//Human만 사용가능
//				h2.eat();
		
		//h2를 Student로 다운캐스팅 s6
		
		System.out.println(h2 instanceof Human);
		System.out.println(h2 instanceof Student);
		System.out.println(h2 instanceof Student2);
		
		Student s6 = null;
		if(h2 instanceof Student) {
			s6 = (Student)h2;
		}
		//Human, Student 사용가능
		s6.eat();
		s6.stuEat();

	}

}
