
import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 025_operator08 예제의 목표는 
        // 삼항 연산자 및 복합 대입 연산자에 대한 실습.
        // ------------------------------------------------------------------
        
        // 조건 연산자(삼항 연산자)
        int random_num = 11;
        String number_type = ( )? "짝수" : "홀수"; 
        System.out.println(number_type);

        // 복합 대입 연산자
        int i = 100;

        i += 100; // i=i+100
        System.out.println(i);
        return;
    }
    
}



