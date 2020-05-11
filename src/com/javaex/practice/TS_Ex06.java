package com.javaex.practice;

public class TS_Ex06 {

	public static void main(String[] args) {

//		Ex06. 1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수만 출력하세요.

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
