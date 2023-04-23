package 사월23일;

import java.util.Scanner;

public class HidingTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hiding hi = new Hiding();
		
		System.out.print("ID: ");
		hi.setId(sc.nextLine());

		System.out.print("PW: ");
		hi.setPw(sc.nextLine());
		
		System.out.print("NAME: ");
		hi.setName(sc.nextLine());
		
		System.out.print("AGE: ");
		hi.setAge(sc.nextInt());

		Hiding hi2 = new Hiding("id", "pw", "name", 25);
	}
}
