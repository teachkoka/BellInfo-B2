package com.bellinfo.batch2.day8;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		for (int j = 1; j <= count; j++) {
			for (int i = 1; i <= 10; i++) {
				if(i>5)continue;
				System.out.println(j + " *" + i + " =" + j * i);
			}
		}

	}

}
