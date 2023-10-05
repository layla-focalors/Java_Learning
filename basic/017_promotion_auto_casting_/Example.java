
import java.util.*;

public class Example {
    public static void main(String[] args) {
        
        // ------------------------------------------------------------------
        // 017_promotion_auto_casting 예제의 목표는 
        // 자동 형 변환의 예시를 실습하고, 어느 때 자동 형 변환이 발생하는지 파악.

        // 자동 형 변환은 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장되거나 연산될 때 이루어짐
        // byte -> short, char -> int -> long -> float -> double 방향으로만 변환이 이루어지며, 
        // 이 방향을 거슬러서 변환해야 하는 경우에는 에러가 발생하거나, 손실을 감수하고 강제 형 변환 해야함.
        // ------------------------------------------------------------------
        
        // 올바른 자동 형 변환 예시
        int int_value = 100;
        double double_value = 111.45;

        // 올바른 자동 형 변환 예시
        long long_number1 = 10l;
        int int_number2 = 20;

        // 올바르지 못한 자동 형 변환 예시
        char char_value1 = 'a';
        char char_value2 = 1;

        return;
    }
}



