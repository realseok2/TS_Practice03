package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex13 {

	public static void main(String[] args) {

//		Ex13.	숫자를 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
//					 	예를 들어 100을 입력받는다면 아래와 같이 계산이 됩니다.
//					 	1 + 2 + 3 + 4 + 5 + 6 + .... + 99 + 100

		Scanner sc = new Scanner(System.in);

		int x, y;
		int sum = 0;

		System.out.print("총 누적 합계를 구하고자 하는 범위의 숫자를 입력해 주세요 : ");
		x = sc.nextInt();

		for (y = 1; y <= x; y++) {
			sum = sum + y;

		}
		System.out.println("입력하신 숫자까지 범위의 총 누적 합은 " + sum + "입니다.");

		sc.close();

	}

}
