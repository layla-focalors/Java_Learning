
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

        // 3. char 문자형 연산과 형 변환

        // 4. byte 형 연산과 형 변환

        // 5. float를 이용한 산술 연산 및 반올림
        // 소수점 아래 3가지 까지 구하기

        // 수동 반올림 

        // 자동 반올림

        // 6. 나머지 연산
        // random 값을 얻기 위해서 Math.random() 사용.
        
        return;

    }
}



