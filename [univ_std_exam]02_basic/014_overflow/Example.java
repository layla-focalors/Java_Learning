
import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 014_overflow 예제의 목표는 
        // 하나의 자료형의 최대값과 최소값을 넘어서는 연산을 수행하고, 그에 따른 값을 확인하여
        // 오버플로우의 개념을 이해한다.
        // ------------------------------------------------------------------
        System.out.println("BYTE --------------------------------------------------");
        byte overflow_exam_byte = 0;
        for(int i=0;i<;i++) {
        }
        
        // 각 자료형의 최소 값과 최대 값에서 -1, +1 씩 값을 증감 시켜 오버플로우를 발생
        // 2byte
        short short_min = ;
        short short_max =; 
        // 1byte
        byte byte_min = ;
        byte byte_max = ;

        System.out.println("short_min : " + short_min);
        System.out.println("[overflow]short_min-1 : " + (short)(short_min-1));

        System.out.println("short_max : " + short_max);
        System.out.println("[overflow]short_max+1 : " + (short)(short_max+1));

        System.out.println("byte_min : " + (byte)byte_min);
        System.out.println("[overflow]byte_min-1 : " + (byte)(byte_min-1));

        System.out.println("byte_max : " + (byte)byte_max);
        System.out.println("[overflow]byte_max+1 : " + (byte)(byte_max+1));

        return;
    }
}



