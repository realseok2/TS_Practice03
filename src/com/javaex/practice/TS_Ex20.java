package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Ex20. 아래의 설명에 맞는 프로그램을 작성하세요.
//						숨겨진 숫자를 맞추는 게임입니다.
//						프로그램이 실행되면 1 ~ 100 사이의 숫자가 결정됩니다.
//						사용자가 입력한 숫자가 결정된 숫자보다 높으면 " 더 낮게 " 를 출력
//						사용자가 입력한 숫자가 결정된 숫자보다 낮으면 " 더 높게 " 를 출력하며
//						정답을 맞춘 경우 "정답입니다."를 출력합니다.
//						게임을 반복하기 위해 Y/N라고 묻고 N인 경우 종료됩니다.
//						(Y인 경우 다시 게임이 시작됩니다.)
//						*개발시 랜덤하게 생성된 값을 출력해서 테스트하시면 편리합니다.

		System.out.println("==================================");
		System.out.println("\t\t   숫자 맞추기 게임을 시작합니다.");
		System.out.println("==================================");
		System.out.println("\n우선 자동으로 랜덤하게 숫자를 선정하도록 하겠습니다.\n");
		int no1 = (int) (Math.random() * 100) + 1;
		System.out.println("숫자 선정이 완료되었습니다.");
		System.out.println("이제 게임을 시작하도록 하겠습니다.\n");

		int select;
		String breakgame;
		boolean gameEnd = true;
		boolean result = true;
		while (gameEnd) {

			System.out.print("숫자를 선택해 주세요 > ");
			select = sc.nextInt();

			if (select > no1) {
				System.out.println("Down. 더 낮은 숫자를 선택해 주세요.");
				System.out.println("==================================");
			} else if (select < no1) {
				System.out.println("Up. 더 높은 숫자를 선택해 주세요.");
				System.out.println("==================================");
			} else {

				// sc.nextLine(); //숫자-->문자열 오류
				System.out.println("정답입니다!");

				while (result) {

					System.out.print("게임을 종료하시겠습니까? [ Y / N ]\t>>\t");
					breakgame = sc.next();

					if (breakgame.equals("Y")) {
						System.out.println("==================================");
						System.out.println("\t\t   숫자 맞추기 게임을 종료합니다.");
						System.out.println("==================================");
						gameEnd = false;
						result = false;
					} else if (breakgame.equals("N")) {
						System.out.println("==================================");
						System.out.println("새로운 숫자를 선정하여 다시 게임을 진행하도록 하겠습니다.");
						gameEnd = true;
						result = false;
						no1 = (int) (Math.random() * 100) + 1;

					} else {
						System.out.println("잘못입력하셨습니다.");

						result = true;
					}
				}
			}

		}
		// do

		sc.close();

	}// main

}// class
