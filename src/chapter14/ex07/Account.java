package chapter14.ex07;

class BalanceException extends Exception {
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}

public class Account {
	
	private long balance = 1000; //예금잔고 : 1000
	public Account() {}//기본 생성자
	
	public long getBalance () { //getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	//예금
	//기존 예금(balance)에서 money를 인풋 받고 그 인풋 값을 더해서 다시 예금잔고에 적용
	
	public void deposit(int money) { 
		balance += money;
	}
	
	//예외 처리
	//출금 - 출금할때!
	
	
	public void withdrow(int money) throws BalanceException {
		
		
		balance -= money;
		//잔고가 money보다 작은 경우 "잔고가 부족합니다" 강제 예외 발생
		// BalanceException <== 사용자 정의 예외를 생성(클래스명)
		if (balance < money) {
			throw new BalanceException("잔고가 부족합니다");
		}else {
			System.out.println("정상 출금 되었습니다");
		}
		
	}
	
	
//	public static void main(String[] args) {
//		
//		Account a1 = new Account();
//		
//		
//		try {
//			a1.withdrow(300);
//		} catch (BalanceException e) {
////			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//	
	
	
	
	
}
