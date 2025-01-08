package ch4;

public class Q4_5 {
	public static void main(String[] args) {
		int x, y;
		for (x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				if (4*x + 5*y == 60) {
					System.out.printf("(%1d,%2d) ", x, y);
					break;
				}
			}
		}
	}
}