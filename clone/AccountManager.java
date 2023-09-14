package clone;

import java.util.Scanner;

public class AccountManager {
    public static void main(String [] args) {
        boolean isExit = false;
        do {
            Scanner Scan = new Scanner(System.in);
            System.out.println("1. 계좌개설");
            System.out.println("2. 입금하기");
            System.out.println("3. 출금하기");
            System.out.println("4. 전체조회");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택 : ");

            int menu = Integer.parseInt(Scan.nextLine());
            switch(menu) {
                case 1:
                    System.out.println("계좌개설");
                    break;
                case 2:
                    System.out.println("입금하기");
                    break;
                case 3:
                    System.out.println("출금하기");
                    break;
                case 4:
                    System.out.println("전체조회");
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    isExit = true;
                    break;
            }
        } while(!isExit);
    }
}
