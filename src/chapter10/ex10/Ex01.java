package chapter10.ex10;
//<문제>
class C {
	String stuID; 
	String name;
	int age;
	
	//생성자 : 기본생성자, 인풋값3개 생성자
	C(){}

	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	
	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// String stuID; equals() 재정의 c1.equals(c2)
	@Override
	public boolean equals(Object oj) {
		if (this.stuID == ((C)oj).stuID) {
			return true;
		}else {
			return false;
		}
	}
	

	//toString() 재정의 : 메모리의 필드의 값을 출력
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		//
		
		C c1 = new C();
		
		c1.setName("이순신");
		c1.setStuID("1111");
		c1.setAge(40);
		System.out.println(c1);
		
		C c2 = new C();
		c2.setStuID("1111");
		
		System.out.println("=== true============");
		
		System.out.println(c1 == c2); //equals와 비교
		//재정의
		System.out.println(c1.equals(c2));
		
		System.out.println("===false==========");
		
		c2.setStuID("2222");
		System.out.println(c1.equals(c2));
		
	}

}
