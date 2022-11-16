package Java_Jungsuk.pjw;

public class Ex01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for (int j = 1;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		System.out.println("1단출력");
		for (int i =1 , j =1;j<=9;j++) {
			System.out.printf("%d * %d = %d\t",i,j,i*j);
		}
		

	}

}
