package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex17 {

	public static void main(String[] args) {

//		Ex17. 숫자를 입력 받아 해당 숫자만큼 아래와 같이 *이 출력되도록 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int x, y, num;

		System.out.println("사용자에게 숫자 하나를 입력받아 해당 숫자만큼 가로의 문자 개수와 세로의 줄 수의 *이 출력되는 프로그램입니다.");
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();

		for (y = 1; y <= num; y++) {
			for (x = num; x >= y; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
