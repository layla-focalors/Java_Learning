
import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 016_casting_1 예제의 목표는 
        // 변수를 강제로 형 변환했을 때, 비트 단위로 살펴보고, 값의 손실이 발생하는지 확인하며,
        // 자료형의 변환 방향에 따라 손실 여부 또한 확인한다.
        // ------------------------------------------------------------------

        // byte 표현 범위를 넘어서는 int -> byte
        int before_1 = 257;
        
        System.out.println("--------------------------------------------------------------");

        // 부호 있는 byte -> int
        byte before_2 = -2;

        System.out.println("--------------------------------------------------------------");

        // float -> double
        float before_3 = 1.1111f;

        System.out.println("--------------------------------------------------------------");
        
        // double -> float
        double before_4 = 1.111111111111111111111;

        System.out.println("--------------------------------------------------------------");

        // 넓은 범위, 큰 값의 실수 -> 실수(float)
        double before_5 = 1.0e100; // float의 최대값을 넘어버리는 값을 저장하고 float로 형 변환하면 무한대
        System.out.println(before_5);
        System.out.println((float)before_5); 
        System.out.println("--------------------------------------------------------------");

        // 넓은 범위, 작은 값의 실수 -> 실수(float)
        double before_6 = 1.0e-50; // float의 최소값을 넘어버리는 값을 저장하고 float로 형 변환하면 0.0
        System.out.println(before_6);
        System.out.println((float)before_6); 
        System.out.println("--------------------------------------------------------------");

        // 정수 -> 실수(float, double)
        int before_7 = 10000000;

        System.out.println("--------------------------------------------------------------");

        // 실수(float) -> 정수
        float before_8 = 100.12345f;

        System.out.println("--------------------------------------------------------------");

        // 실수(double) -> 정수
        double before_9 = 100.123456789012;

        System.out.println("--------------------------------------------------------------");

        return;
    }
}



