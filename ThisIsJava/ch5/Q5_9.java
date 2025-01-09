package ch5;

import java.util.Scanner;

public class Q5_9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = null;
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					System.out.print("학생수> ");
					int student = sc.nextInt();
					scores = new int[student];
					break;
					
				case 2:
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores[" + i + "]: ");
						scores[i] = sc.nextInt();
					}
					break;
					
				case 3:
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);
					}
					break;
					
				case 4:
					int maxNum = scores[0];
					for (int i=0; i<scores.length; i++) {
						if (maxNum < scores[i])
						maxNum = scores[i];
					}
					int sum = 0;
					for (int score : scores) {
						sum = sum + score;
					}
					double avg = (double) sum / scores.length; 
					
					System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", maxNum, avg);
					break;
					
				case 5:
					System.out.println("프로그램 종료");
					break;
		
			}
			
			if (choose == 5)
				break;
		}

	}
	
}
