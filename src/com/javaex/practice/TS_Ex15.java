package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex15 {

	public static void main(String[] args) {

//		Ex15.	아래의 설명에 맞는 프로그램을 작성하세요.
//						숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요.
//						예를 들어 10을 입력한 경우 1, 2, 5, 10이 출력된다.

		Scanner sc = new Scanner(System.in);

		int x; 																																		//							 	입력할 값
		int y; 																																		// 								나눌 값

		System.out.println("사용자가 입력하는 숫자의 약수들을 출력하는 프로그램입니다.");
		System.out.println("");
		System.out.print("숫자를 입력해 주세요 : ");
		x = sc.nextInt();

		for (y = 1; y <= x; y++) {
			if (x % y == 0) {
				System.out.println(x + "의 약수에는 " + y + "이(가) 포함됩니다.");
			}
		}
		sc.close();
	}
}
