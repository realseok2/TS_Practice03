package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Ex19. 아래와 같이 은행 프로그램을 작성하세요.
//					 "1. 예금"을 선택 후 금액을 입력하면 예금액이 합산됩니다.
//					 "2. 출금"을 선택 후 금액을 입력하면 예금액이 차감됩니다.
//					 "3. 잔고"를 선택 시 현재 잔고가 츨력됩니다.
//					 "4. 종료"를 선택 시 프로그램이 종료됩니다.
//					 "1, 2, 3, 4" 이외의 숫자를 입력시 다시 입력해 주세요 라는 메세지가 출력됩니다.

		int sum = 0;
		int deposit = 0;
		int withdraw = 0;
		boolean bankEnd = false;

		do {
			System.out.println("===============================");
			System.out.println("\t1. 예금 \t 2. 출금 \t 3. 잔고 \t 4. 종료");
			System.out.println("===============================\n");
			System.out.print("선택 > ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("예금하실 금액을 입력해 주세요 : ");
				deposit = sc.nextInt();
				sum = sum + deposit;
				System.out.println("고객님의 예금액은 " + deposit + "원으로 현재 계좌의 잔액은 " + sum + "원 입니다.");
				break;
			case 2:
				System.out.print("출금하실 금액을 입력해 주세요 : ");
				withdraw = sc.nextInt();
				sum = sum - withdraw;
				System.out.println("고객님의 출금액은" + withdraw + "원으로 현재 계좌의 잔액은 " + sum + "원 입니다.");
				break;
			case 3:
				sum = deposit - withdraw;
				System.out.println("고객님의 잔액은 " + sum + "원 입니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				bankEnd = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		} while (!bankEnd);

		sc.close();

	}

}