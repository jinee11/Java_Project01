package chapter05.ex06;

import java.util.Arrays;

public class Ex02_1 { //<복습>

	public static void main(String[] args) {
		 /*<문제>
	     2차원 배열 변수 :  arr1
	     arr1[0]     <== 2의 배수만 저장 
	     arr1[1]     <== 5의 배수만 저장 
	     arr1[2]     <== 3의 배수와 8배수를 저장 
	     arr1[3]     <== 1부터 시작 해서 1씩 증가하는데 7의 배수는 저장하지 않도록 저장 
	     
	     행의 갯수 : 4
	     열의 갯수 : 100 

	     1. for 문으로 출력, 2. Enhanced For, 3. Arrays.toString()
	     */
		
		//i행 x열 j배수
		int[][] arr1 = new int[4][100];
		
		for(int i = 0; i < arr1.length ; i++) {
			if(i ==0) {
				for(int x=0,j=1;x<arr1[i].length;j++) {
					if(j%2==0) {
						arr1[i][x]=j;
						x++;
					}
				}
			}else if(i==1) {
				for(int x=0,j=1;x<arr1[i].length;j++) {
					if(j%5==0) {
						arr1[i][x]=j;
						x++;
					}
				}
			}else if(i==2) {
				for(int x=0,j=1;x<arr1[i].length;j++) {
					if(j%3==0||j%8==0) {
						arr1[i][x]=j;
						x++;
					}
				}
			}if(i==3) {
				for(int x=0,j=1;x<arr1[i].length;j++) {
					if(j%7!=0) {
						continue;
					}
					arr1[i][x]=j;
					x++;
				}
			}
		}

		
		
		
		
		
		
		
		
		
	 

	}

}
