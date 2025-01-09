package ch5;

public class Q5_8 {
	
	public static void main(String[] args) {
		
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0, student = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				student ++;
			}
		}
		
		double avg = (double) sum / student;
		
		System.out.println("전체 점수의 합은 " + sum + ", 점수의 평균은 " + avg);
	}
	
}
