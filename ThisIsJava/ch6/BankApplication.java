package ch6;

import java.util.Scanner;

public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	static int accountCount = 0;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.목록 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					createAccount();
					break;
				case 2:
					listAccount();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못 입력했습니다");
					break;
			}
			
			if (choose == 5) {
				break;
			}
				
		}
	}
	
	
	// 계좌 생성 함수
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String account_num = sc.next();
		System.out.print("계좌주: ");
		String name = sc.next();
		System.out.print("초기 입금액: ");
		int balance = sc.nextInt();
		
		Account account = new Account(account_num, name, balance);
		accountArray[accountCount] = account;
		accountCount++;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	// 계좌 목록 함수
	private static void listAccount() {
		System.out.println("----------");
		System.out.println("계좌 목록");
		System.out.println("----------");
		for (int i = 0; i < accountCount; i++) { // 실제 생성된 계좌만 순회
	        Account account = accountArray[i];
	        System.out.println("계좌번호: " + account.getAccountNum() + 
	                           ", 이름: " + account.getName() + 
	                           ", 잔액: " + account.getBalance());
		}
	}
	
	// 입금 함수
	private static void deposit() {
        System.out.println("----------");
        System.out.println("입금");
        System.out.println("----------");

        System.out.print("계좌번호 입력: ");
        String accountNum = sc.next();
        System.out.print("입금액 입력: ");
        int amount = sc.nextInt();
        
        Account account = null;
        for (Account acc : accountArray) {
            if (acc.getAccountNum().equals(accountNum)) {
                account = acc;
                break;
            }
        }
        
        if (amount <= 0) {
            System.out.println("입금액은 0보다 커야 합니다");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("결과: 입금이 완료되었습니다.");
        }
	}
	
	// 출금 함수
	private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");

        System.out.print("계좌번호 입력: ");
        String accountNum = sc.next();
        System.out.print("출금액 입력: ");
        int amount = sc.nextInt();
        
        Account account = null;
        for (Account acc : accountArray) {
            if (acc.getAccountNum().equals(accountNum)) {
                account = acc;
                break;
            }
        }
        
        if (amount <= 0) {
            System.out.println("출금액은 0보다 커야 합니다");
        } else if (account.getBalance() < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
	}

}
