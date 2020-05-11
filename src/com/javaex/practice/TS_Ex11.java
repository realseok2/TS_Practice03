package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex11 {

	public static void main(String[] args) {

//		Ex11. 다음과 같은 프로그램을 작성하세요.
//		
//		a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
//		ex) 입력이 7이면 16을 출력 (1 + 3 + 5 + 7 = 16)
//		b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
//		ex) 입력이 10이면 30을 출력 (2 + 4 + 6 + 8 + 10 = 30)

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("입력받은 숫자의 종류에 따라 합계를 출력하는 프로그램입니다.");

		int x, y;
		int sum = 0;

		System.out.println("합계를 구할 숫자를 입력하세요.");
		System.out.print("숫자 : ");
		x = sc.nextInt();

		if (x % 2 == 0) {
			for (y = 0; y <= x; y = y + 2) {
				sum = sum + y;
			}
		} else {
			for (y = 1; y <= x; y = y + 2) {
				sum = sum + y;
			}
		}

		System.out.println("결과 값은 " + sum + "입니다.");

	}

}
