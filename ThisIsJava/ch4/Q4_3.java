package ch4;

public class Q4_3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.print("3의 배수의 총합은 " + sum);
	}
}