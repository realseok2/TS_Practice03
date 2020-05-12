package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex10 {

	public static void main(String[] args) {

//		Ex10. 정수 다섯개를 입력 받아 가장 큰 수를 출력하세요.

		Scanner sc = new Scanner(System.in);

		
		System.out.println("정수 다섯개를 입력 받아 가장 큰 수를 추출하는 프로그램입니다.");

		int max = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력해 주세요 : ");
			int num = sc.nextInt();
			if (num > max) {
				max = num;

			}
		}
		System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + max + "입니다.");
		
		
		
		
		
//		int num1, num2, num3, num4, num5;
//
//		System.out.println("숫자를 입력해 주세요.");
//		System.out.print("첫번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두번째 숫자 : ");
//		num2 = sc.nextInt();
//		System.out.print("세번째 숫자 : ");
//		num3 = sc.nextInt();
//		System.out.print("네번째 숫자 : ");
//		num4 = sc.nextInt();
//		System.out.print("다섯번째 숫자 : ");
//		num5 = sc.nextInt();
//
//		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
//			System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + num1 + "입니다.");
//		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
//			System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + num2 + "입니다.");
//		} else if (num3 > num1 && num3 > num3 && num3 > num4 && num3 > num5) {
//			System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + num3 + "입니다.");
//		} else if (num4 > num1 && num4 > num3 && num4 > num4 && num4 > num5) {
//			System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + num4 + "입니다.");
//		} else {
//			System.out.println("입력 받은 다섯개의 정수 중 최대 값은 " + num5 + "입니다.");
//		}

		sc.close();
	}

}
