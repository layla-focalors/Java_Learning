import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 010_scanner 예제의 목표는
        // Scanner 클래스를 사용하여 표준 입력으로 자료형 별로 값을 입력받는 실습한다.
        // ------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 키워드 입력 \n");
        String reade = scan.nextLine();
        System.out.printf("inputString : %s", reade);
        // System.out.println(scan.nextLine());
        return;
    }
}



