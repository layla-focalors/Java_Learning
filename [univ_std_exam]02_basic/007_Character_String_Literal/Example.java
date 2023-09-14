
public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 007_Character_String_Literal 예제의 목표는
        // 문자 리터럴과 문자열 리터럴에 대해 이해하고 실습한다.
        // + 대입 연산자의 왼쪽과 오른쪽 타입은 서로 동일해야 한다.
        // ------------------------------------------------------------------
        
        // 다양한 문자 변수 선언
        ;
        char ch_16 = ; // A의 16진수 값
        char ch_null = ; // 문자로 빈 문자는 존재할 수 없다.
        char ch_space = ; // 공백은 빈 문자가 아니다.

        // 다양한 문자열 변수 선언
        ;
        String str_origin = ;
        String str_ch = ;
        String str_null = ;
        String str_space = ;
        
        // 문자열과 문자의 호환
        String single_quote = ; // Error -> incompatible types: char cannot be converted to String
        char big_quote = ; // Error -> incompatible types: String cannot be converted to char

        // 출력
        System.out.println("ch : " + ch);
        System.out.println("ch_16 : " + ch_16);
        System.out.println("ch_space : " + ch_space);
        System.out.println("str : " + str);
        System.out.println("str_origin : " + str_origin);
        System.out.println("str_ch : " + str_ch);
        System.out.println("str_null : " + str_null);
        System.out.println("str_space : " + str_space);

        // 문자 리터럴과 문자열 리터럴의 + 연산
        char ch_operand = '1'; // 31
        String str_operand = "Hi ";

        System.out.println(); // 31 + 31 => 62 으로 정수형으로 변환하여 계산 됨.
        System.out.println();// -> 문자도 정수형이므로 int로 변환되어 정수의 덧셈이 이루어짐

        System.out.println();
        // -> 문자열에서의 + 연산은 문자열 결합이 이루어짐

        return;
    }
}
