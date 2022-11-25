import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int sum1 = (a+b)%c;
		int sum2 = ((a%c)+(b%c))%c;
		int sum3 = (a*b)%c;
		int sum4 = ((a%c)*(b%c))*c;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

}
