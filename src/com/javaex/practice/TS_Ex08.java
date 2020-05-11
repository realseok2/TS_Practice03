package com.javaex.practice;

public class TS_Ex08 {

	public static void main(String[] args) {

//		Ex08. 아래와 같이 구구단을 출력하세요!

		System.out.println("구구단을 한번에 출력하는 프로그램입니다.");

		for (int column = 2; column <= 9; column++) {
			for (int row = 1; row <=9; row++) {
				if (row == 9) {
					System.out.println("");
				}
				System.out.print(column + " * " + row + " = " + column * row + "\t\t\t");
			}
		}
	}
}
