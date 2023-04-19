package test;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator test = new Calculator();
//		test.table();

		String name;
		int age = -1;
		int birthYear = 0;
		int year = 2023;
		int gender = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("이름: ");
		name = scan.nextLine();

		System.out.print("나이: ");
		age += scan.nextInt();

		System.out.print("성별 1)남, 2)여: ");
		gender = scan.nextInt();
		
		birthYear = year - age;
		
		System.out.println(birthYear + "년생 입니다.");

		if (birthYear <= 2004) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("성인까지 " + (birthYear-2004) + " 년 남았습니다.");			
		}
		
		switch (gender) {
			case 1: {
				System.out.println("남자입니다.");
				break;
			}
			case 2: {
				System.out.println("여자입니다.");
				break;
			}
		}
	}

}
