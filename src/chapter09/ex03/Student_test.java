package chapter09.ex03;

class Student {
	String stuName;		//학생이름
	static int stuNo;	//학생수 : 모든 객체에서 공유되는 필드, 객체가 생성될때마다 학생수가 늘어남
						//객체를 생성시 하나씩 늘어 나도록 함
	String stuAddr;		//학생주소 
	
	//static 필드의 초기값 할당, 클래스 로딩시 제일먼저 작동
	static {
		stuNo = 0;
	}
	Student(String stuName, String stuAddr){
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		stuNo += 1; //객체를 하나씩 생성할때마다 학생수가 하나씩 늘어나도록(모든객체공유)
	}
	
	//필드의 값을 출력하는 메소드
	void print () {
		System.out.println("학생이름 : " + stuName);
		System.out.println("학생주소 : " + stuAddr);
		System.out.println("학생 수 : " + stuNo);
	}
	
}

public class Student_test {

	public static void main(String[] args) {
		// 1. 객체 생성
		Student s1 = new Student("홍길동","서울 종로구");
		s1.print(); //학생수1
		
		System.out.println("================");
		Student s2 = new Student("이순신","서울 광화문");
		s2.print(); //학생수2
		
		System.out.println("================");
		Student s3 = new Student("강감찬","서울 성북구");
		s3.print(); //학생수3
		
		System.out.println("====== 인스턴스 필드 : 다른 객체와 공유 되지 않음 =================");
		System.out.println(s1.stuName); //홍길동
		System.out.println(s2.stuName); //이순신
		System.out.println(s3.stuName); //강감찬
		
		System.out.println("======== 정적 필드 : 모든 객체와 공유 ===================");
		System.out.println(s1.stuNo); //3
		System.out.println(s2.stuNo); //3
		System.out.println(s3.stuNo); //3
	

	}

}
