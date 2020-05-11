package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Ex16. 아래의 설명에 맞는 프로그램을 작성하세요.
//					 숫자를 1개 입력 받아 5의 배수의 개수와 그 합을 출력하는 프로그램을 작성하세요.
//					 예를 들어 22를 입력한 경우 5의 배수의 개수 4개와 그 합인 50을 출력한다.
//					 -	5의 배수의 개수 :  5 , 10 , 15 , 20		--->	4개
//					 - 5의 배수의 합 : 5 + 10 +15 + 20			--->	50

		int x, y;
		int sum = 0;
		int count = 0;

		System.out.println("사용자에게 숫자 하나를 입력 받아 그 범위 내의 5의 배수의 갯수와 그들의 합계를 구하는 프로그램입니다.");
		System.out.print("숫자를 입력해 주세요 : ");
		x = sc.nextInt();

		for (y = 1; y <= x; y++) {
			if (y % 5 == 0) {
				count = count + 1;
				sum = sum + y;
			}
		}
		System.out.println("1부터 " + x + "까지의 범위 내에서 5의 배수의 개수는 " + count + "개 입니다.");
		System.out.println("1부터 " + x + "까지의 범위 내에서 5의 배수의 합계는 " + sum + "입니다.");

		sc.close();
	}

}
