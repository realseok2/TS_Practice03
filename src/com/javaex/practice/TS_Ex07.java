package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex07 {

	public static void main(String[] args) {

//		Ex07. 숫자를 입력 받아 아래와 같이 출력하세요.

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("숫자를 입력 받아 해당 숫자만큼의 열이 출력되는 프로그램입니다.");

		System.out.println("숫자를 입력하세요!");
		num = sc.nextInt();

		for (int column = 1; column <= num; column++) {
			for (int row = 1; row <= column; row++) {
				System.out.print(column);
			}
			System.out.println("");
		}
		sc.close();
	}

}
