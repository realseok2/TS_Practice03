package com.javaex.practice;

public class TS_Ex09 {

	public static void main(String[] args) {

		System.out.println("각 행과 열로 진행할수록 1씩 증가하는 프로그램입니다.");

		for (int column = 1; column <= 10; column++) {
			for (int row = column; row < column+10; row++) {
				System.out.print(row + " \t");

				
			}
			System.out.println("");
		}
	}
}
