
import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 018_operator01 예제의 목표는 
        // 단항 연산자인 증감 연산자를 학습하고, 특성을 정확히 파악.
        // --------------------객체 지향 자바 – 2강 ----------------------------------------------
        int num1 = 0;
        // 전위형
        ++num1;
        System.out.println(num1);

        int num2 = 0;
        // 후위형
        num2++;
        System.out.println(num2);

        int num3 = 0; int num4 = 0;
        System.out.println("++num3 :"+(++num3) + ", num4 : " + (num4++));
        System.out.println("a : "+ num3 + "\nb : " + num4);
        // 우선 순위에 의해 바로 1증가

        // 후위 증가 특성으로 인해 참조 후에 1증가.
        // 중간고사 시험문제 단골 문제

        // 헤깔리는 머리가 아픈.. 전위형과 후위형 혼합...

        return;
    }
}



