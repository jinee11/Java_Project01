package chapter07.ex05;

class Book {
	String title; //책 제목
	String author; //책 저자
	
	Book(){ //기본생성자
		title = "책 제목 없음";
		author = "작자미상";
	}
	
	Book(String title){ //책제목만 넣는 메소드
		this (); //기본생성자 호출
		this.title = title;
	}
	
	Book (String title, String aythor){
		this(title); //title제목 넣은 생성자 호출
		this.author = aythor;
	}
	
	//필드의 값을 출력해주는 메소드
	void print() {
		System.out.println("책의 제목은 : " + title);
		System.out.println("책의 저자는 : " + author);
	}
}

public class Book_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.print();
		
		System.out.println("===== 매개변수 1개 ======");
		Book book2 = new Book("홍길동전");
		book2.print();
		
		System.out.println("===== 매개변수 2개 ======");
		Book book3 = new Book("홍길동전","콩쥐");
		book3.print();
	}
}
