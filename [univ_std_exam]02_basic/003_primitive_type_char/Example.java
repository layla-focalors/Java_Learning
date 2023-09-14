
public class Example {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 003_primitive_type_char 예제의 목표는
        // 문자형 기본 자료형인 char 자료형에 대해서 이해한다.
        // char은 문자를 다루는 자료형이기 때문에 문자를 저장하지만 
        // 내부적으로는 유니코드(정수) 값으로 변환하여 저장.
        // ------------------------------------------------------------------

        char one_of_alphabet = 'A'; // 문자형으로 저장
        System.out.println("1. 'A' 로 저장 --------");
        System.out.println("(기본) -> " + one_of_alphabet);

        // 10진수 정수형으로 저장
        one_of_alphabet = 65; // 문자형으로 저장
        System.out.println("1. '65' 로 저장 --------");
        System.out.println("(기본) -> " + one_of_alphabet);

        // 2진수 정수형으로 저장
        one_of_alphabet = 0b1000001; // b = binary
        System.out.println("1. '0b1000001' 로 저장 --------");
        System.out.println("(기본) -> " + one_of_alphabet);
        // 16진수 정수형으로 저장

        one_of_alphabet = 0x0041;
        System.out.println("1. '0x0041' 로 저장 --------");
        System.out.println("(기본) -> " + one_of_alphabet);
        return;
    }
}