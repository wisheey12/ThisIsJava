package ch4;

import java.util.Scanner;

public class Q4_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int account = 0;
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3: 잔고 | 4: 종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			int choose = Integer.parseInt(sc.nextLine());
			
			switch(choose) {
				case 1:
					System.out.print("예금액> ");
					account += Integer.parseInt(sc.nextLine());
					break;
				case 2:
					System.out.print("출금액> ");
					account -= Integer.parseInt(sc.nextLine());
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(account);
					break;
				case 4:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못 입력했습니다.");
					break;
			}
			
			if (choose == 4) {
				break;
			}
		}
	}
}