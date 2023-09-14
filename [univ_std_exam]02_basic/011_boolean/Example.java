
import java.util.*;

public class Example {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 011_boolean 예제의 목표는
        // boolean 자료형에 대해 이해하고 실습한다.
        // ------------------------------------------------------------------

        // true와 false는 예약어로 그 자체로 값이다
        // true 라는 문자열이 아닌 그 자체로 값.
        // false 라는 문자열이 아닌 그 자체로 값.
        
        boolean true_bool_val = true;
        boolean false_bool_val = false;
        
        System.out.println(true_bool_val);
        System.out.println(false_bool_val);

        boolean door_status = true;
        
        if(door_status == true) {
            System.out.println("문이 열렸습니다.");
        } 
        if(door_status == false) {
            System.out.println("문이 닫혔습니다.");
        }

        return;
    }
}



