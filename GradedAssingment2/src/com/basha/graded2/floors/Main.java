package com.basha.graded2.floors;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Enter the total number of floors in the building ");
		Scanner sc = new Scanner(System.in);
		int floors = sc.nextInt();
		for (int i = 1; i <= floors; i++) {

			System.out.println("Enter the floor size given on day " + i);
			int size = sc.nextInt();

		}
	}
}
