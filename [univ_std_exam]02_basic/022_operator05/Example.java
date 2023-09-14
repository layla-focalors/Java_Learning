
import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 022_operator05 예제의 목표는 
        // 문자열에 대해서 비교 연산을 실습해보고, 이어서 문자열의 내용을 비교하는 연산을 실습한다.
        // ------------------------------------------------------------------

        String str1 = "java"; // str1이 java라는 리터럴 상수를 가리키고 있음
        String str2 = new String("java");

        // 문자열에서의 == 비교 연산자는 참조 값이 같은지 다른지를 비교함
        System.out.printf("[\"java\" == \"java\"] => %b \n", ); // 
        System.out.printf("[str1 == \"java\"] => %b \n", ); // 
        System.out.printf("[str2 == \"java\"] => %b \n", ); // 

        System.out.printf("[str1 == str2] => %b \n", ); //

        System.out.printf("[str1.equals(\"java\")] => %b \n", );
        System.out.printf("[str1.equals(str2)] => %b \n", );
        System.out.printf("[str2.equals(\"java\")] => %b \n", );
        System.out.printf("[str2.equals(\"JAVA\")] => %b \n", );
        System.out.printf("[str2.equalsIgnoreCase(\"JAVA\")] => %b \n", );

        System.out.println("[\"java\".equals(\"java\")] => " + ); 

        return;
    }
}



