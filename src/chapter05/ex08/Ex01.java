package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>							//index 0번:합계...5번:200	
		//	args : (메인메소드에 이 값을 던져줌=>) 합계 40 77 99 100 200
		
		//합계 : <정수를 더한 값을 출력>
		
		/*내가한거
		
		for (int i = 0; i<args.length;i++) {
			System.out.print(args[i]+" ");
		} //방 내용
		
		System.out.println();
		
		String a = args[1];
		String b = args[2];
		String c = args[3];
		String d = args[4];
		String e = args[5];
		
		System.out.println(a+b+c+d+e);
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		int d1 = Integer.parseInt(d);
		int e1 = Integer.parseInt(e);
		
		System.out.println(a1+b1+c1+d1+e1);
		*/
		//쌤
		String s = args[0];//0번방 합계가 나와야해서 //변수 s에 args를 안담고 바로 출력해도됨 밑에 s자리에
		int sum = 0;
		for (int i = 1/*방번호 0은 합계라서 뺌*/; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);//string숫자를 정수로 전환후 변수sum에 값을 담음
		}
		
		System.out.print(s + " : "); 
		System.out.println(sum); 		//합계 : 516
		
		System.out.println("====================");
		
		System.out.println("합계"+1+2+3);//합계123(""뒤로 string타입으로 변환)
		System.out.println(1+2+3+"합계");//6합계
		
		
		
		
		
		
		
		
		
		
		
	}

}
