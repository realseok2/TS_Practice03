package com.javaex.practice;

public class TS_Ex09 {

	public static void main(String[] args) {

		System.out.println("각 행과 열로 진행할수록 1씩 증가하는 프로그램입니다.");
		
		for(int c = 1; c<=10; c++) {
			for (int r=1; r<=10; r++) {
				if ( r == 10) {
					System.out.println("");
				}System.out.print(r);
			}
			
		}
	}

}
 