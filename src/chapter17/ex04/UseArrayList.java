package chapter17.ex04;

import java.util.ArrayList;
import java.util.Arrays;

//1-1
class Student {
	String name;
	int sutID;
	
	//1-2.생성자를 사용해서 값을 인풋 받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.sutID = stuID;
	}
	
	//1-3.toString() 오버라이딩 재정의 : 객체 자체를 출력할때 해쉬코드가 출력되지 않고 메모리의 값을 출력하기위해
	@Override
	public String toString() {
		return "Student [name=" + name + ", sutID=" + sutID + "]";
	}
}

public class UseArrayList {

	public static void main(String[] args) {

		//1-4.ArrayList에 저장될 객체는 Student 객체가 저장됨 
			//<>안의 클래스가 저장될 객체
		ArrayList<Student> a1 = new ArrayList();
		
		//1-5.Student 객체를 생성
		Student s1 = new Student("홍길동", 1111);
		Student s2 = new Student("이순신", 2222);
		Student s3 = new Student("강감찬", 3333);
		
		//1-6.생성된 Student객체를 ArrayList 컬렉션에 저장
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		System.out.println("=======for==========");
		//1-7.컬렉션의 내용을 순환하면서 출력
		for (int i = 0; i<a1.size() ; i++) {
			Student ss1 = a1.get(i);//1.a1의 방에 Student 객체가 들어있고 그걸 꺼내려고 
			//2. .get(i)을 써서 i(방번호) 수가 ++될때마다 ss1에 객체 값을 넣어서
			System.out.println(ss1); //3. 출력해라
		}
		
		System.out.println("====Enhanced for==========");
		
		for (Student k : a1) {
			System.out.println(k);
		}
		
		System.out.println("====컬렉션 자체로 출력가능==========");
		//모든 컬렉션은 컬렉션 객체를 출력시 해쉬코드가 아닌 컬렉션의 들어간 값을 출력한다.
		System.out.println(a1);
		System.out.println(a1.toString()); //위와 동일
		
	}

}
