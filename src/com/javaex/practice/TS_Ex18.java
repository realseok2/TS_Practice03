package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex18 {

	public static void main(String[] args) {

//		Ex18. 사용자에게 숫자 하나를 입력받아 아래와 같이 *이 출력되도록 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int x, y, num;

		System.out.println(
				"사용자에게 숫자 하나를 입력받아 해당 숫자만큼 가로의 문자 개수와 세로의 줄 수의 * 이 출력된 후 -1씩 감소 후 1이 되는 지점부터 다시 증가하는 프로그램입니다.");
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();

		for (y = 1; y <= num; y++) {
			for (x = num; x >= y; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//===========================================================		다시 증가하기 시작하는 구간
		
		for (y = 2; y <= num; y++) {
			for (x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println("");

			sc.close();
		}
	}
}
