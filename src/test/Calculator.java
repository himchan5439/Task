package test;

public class Calculator {
	public void table() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
