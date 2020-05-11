package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex12 {

	public static void main(String[] args) {

//		Ex12. 팩토리얼은 다음과 같이 정의된다. 숫자 한개를 입력받아 팩토리얼 값을 출력하세요.
//		5 입력시 1 * 2 * 3 * 4 * 5  의 값이 출력됩니다.
//		7 입력시 1 * 2 * 3 * 4 * 5 * 6 * 7 의 값이 출력됩니다.
//		팩토리얼 공식 n! = 1 * 2 * 3 * 4 * 5 ... * n

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 한개를 입력받아 팩토리얼 값을 출력하는 프로그램입니다.");

		int x, y;
		int result=1;

		System.out.print("숫자를 입력해 주세요 : ");
		x = sc.nextInt();

		for (y = 1; y <= x; y++) {
			result = result * y;
		}

		System.out.println("입력하신 숫자의 팩토리얼의 값은 " + result + "입니다.");

		sc.close();

	}

}
