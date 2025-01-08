package ch4;

public class Q4_4 {
	public static void main(String[] args) {
		while (true) {
			int num1  = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
		
			if (num1 + num2 == 5) {
				System.out.printf("(%1d,%2d)", num1, num2);
				break;
			}
		}
	}
}