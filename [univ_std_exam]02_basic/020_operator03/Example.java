
import java.util.*;

public class Example {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 020_operator03 예제의 목표는 
        // 산술 연산자들을 이해하고, 산술 연산과 변수와 자료형 간의 주요 문법들을 복습한다.
        // ------------------------------------------------------------------

        // 1. 기초 산술 연산
        int n1 = 100;
        int n2 = 15;

        System.out.printf("%d + %d = %d\n",n1, n2, n1+n2);
        System.out.printf("%d - %d = %d\n",n1, n2, n1-n2);
        System.out.printf("%d x %d = %d\n",n1, n2, n1*n2);
        System.out.printf("%d / %d = %d\n",n1, n2, n1/n2); // 정수 / 정수는 정수로 소수점 이하는 버려진다.
        System.out.printf("%d / %d = %f\n",n1, n2, n1/(float)n2); // n1은 정수에서 float으로 자동 형 변환 발생.
        System.out.printf("%d %% %d = %d\n",n1, n2, n1%n2);

        // 2. int 오버플로우로 인한 long 변환
        int n3 = 100_000_000;
        int n4 = 30;

        System.out.println(n3*n4); // 
        System.out.println((long)n3*(long)n4);

        // 3. char 문자형 연산과 형 변환
        char ch = 'A';
        char result_ch = (char)ch + (char)32; // 안 되는 이유는?
        char result_ch = ch + 32; // 안 되는 이유는?
        char result_ch = (char)(ch + 32); 
        System.out.println((char)ch + (char)32); // 
        System.out.println("result_ch : " + result_ch);

        char auto_calc_ch = 'A' + 32; 
        // 얘가 가능한 이유는
        // 런 타임에서는 그저 대입 연산만
        System.out.println("auto_calc_ch : " + auto_calc_ch);

        // 4. byte 형 연산과 형 변환
        byte ba = 10, bb = 20;
        byte bc = 10 + 20; // 
        byte bd = 250 + 250; //
        byte be = (byte)ba + (byte)bb; //
        byte bf = ba + bb; 
        System.out.println(bc);

        // 5. float를 이용한 산술 연산 및 반올림

        // 소수점 아래 3가지 까지 구하기
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f; // 3141 / 1000.0;
        System.out.println(shortPi);

        // 수동 반올림 
        double dpi = 3.141592;
        double shortdPi = (int) (dpi * 1000 + 0.5) / 1000.0; // 3142 / 1000.0;
        System.out.println(shortdPi);

        // 자동 반올림
        shortdPi = Math.round(dpi*1000) / 1000.0;
        System.out.println(shortdPi);

        // 6. 나머지 연산
        // random 값을 얻기 위해서 Math.random() 사용.
          // double형으로 리턴 확인.
          // 0 ~ 9999 사이의 값
        
        //

        System.out.println(-10%4);
        System.out.println(-10%2);
        System.out.println(10%-3); // 
        System.out.println(10%2.0); // 
        System.out.println(10%0); // 
        
        return;

    }
}



