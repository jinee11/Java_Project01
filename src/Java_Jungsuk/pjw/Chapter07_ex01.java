package Java_Jungsuk.pjw;

class Pjw1{
	
	String name;
	int num;
	String addr;
	
	Pjw1(String name, int num, String addr){
		this.name=name;
		this.num=num;
		this.addr=addr;
	}
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+num);
		System.out.println("주소 : ");
	}
	
}

public class Chapter07_ex01 {
	public static void main(String[] args) {
		
		Pjw1 n1 = new Pjw1();
		n1.print();
		
		
		
		
		
	}

}
