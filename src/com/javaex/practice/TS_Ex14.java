package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex14 {

	public static void main(String[] args) {

//		Ex14. 13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int x, y;
		int sum = 0;

		System.out.print("총 누적 합계를 구하고자 하는 범위의 숫자를 입력해 주세요 : ");
		x = sc.nextInt();

		for (y = 1; y <= x; y++) {
			sum = sum + y;
			if (y < x) {

				System.out.print(y + " + ");

			} else {
				System.out.println(y);
			}
		}
		System.out.println("");
		System.out.println("입력하신 숫자까지 범위의 총 누적 합은 " + sum + "입니다.");

		sc.close();
	}

}
