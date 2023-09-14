package Stock_Trading_System;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        boolean isExit = false;
        do {
            Scanner Scan = new Scanner(System.in);
            System.out.println("------ HTS 증권거래시스템 (CLI) ------");
            System.out.println("1. 회원가입");
            System.out.println("2. 입금");
            System.out.println("3. 계좌 잔액 조회");
            System.out.println("4. 주식 매수");
            System.out.println("5. 주식 매도");
            System.out.println("6. 웹(GUI) 접속");
            System.out.println("7. HTS 종료");
            System.out.print("항목을 입력하세요. : ");

            int menu = Integer.parseInt(Scan.nextLine());
            switch (menu) {
                case 1: // 회원가입
                    break;
                case 2: // 입금
                    break;
                case 3: // 계좌 잔액 조회
                    System.out.println("계좌 잔액 조회");
                    break;
                case 4: // 주식 매수
                    break;
                case 5: // 주식 매도
                    break;
                case 6: // Web GUI 접속
                    break;
                case 7:
                    isExit = true;
                    break;
            }
            Scan.close();
        } while (!isExit);
    }
}
