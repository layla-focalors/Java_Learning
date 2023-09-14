
import java.util.*;

public class Example {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 021_operator04 예제의 목표는 
        // 비교 연산을 통해 발생하는 boolean 타입을 출력해보고 실습.
        // ------------------------------------------------------------------

        // 1. 비교 연산1
        System.out.printf("[10 == 10.0f] => %b \n", ); // int -> float로 변환 이룸
        System.out.printf("['0' == 0] => %b \n", );
        System.out.printf("['A' == 65] => %b \n", );
        System.out.printf("['A' > 'B'] => %b \n", );
        System.out.printf("['A'+1 != 'B'] => %b \n", );


        System.out.printf("--------------------------------------------------------\n");

        // 2. 비교 연산2
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f; 
        
        System.out.printf("[10.0 == 10.0f] => %b\n", 10.0 == 10.0f); //
        System.out.printf("[0.1 == 0.1f] => %b\n", 0.1 == 0.1f); // 
        System.out.printf("[f = %19.17f]\n", f); //
        System.out.printf("[d = %19.17f]\n", d);
        System.out.printf("[d2 = %19.17f]\n", d2);
        System.out.printf("[d==f] => %b\n", d==f); //
        System.out.printf("[d==d2] => %b\n", d==d2); // 
        System.out.printf("[d2==f] => %b\n", d2==f); // 
        System.out.printf("[(float)d==f] => %b\n", (float)d==f); //

        return;

    }
}



