
public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 008_string_literal_any_type 예제의 목표는
        // 문자열과 여러 타입 간 + 연산을 진행했을 때, 어떤 결과를 나타내는지 실습하고 확인한다.
        // ------------------------------------------------------------------

        // + 연산자를 기준으로 한 쪽에 문자열 피연산자가 존재하면 문자열 결합이 이뤄짐.
        System.out.println("안녕하세요? 저는 " + "김자바 " + "입니다");
        System.out.println("내가 좋아하는 알파벳은 " + 'A');
        System.out.println("내가 좋아하는 정수는 " + 7);
        System.out.println("내가 좋아하는 float 형 소수점은 " + 3.14f);
        System.out.println("내가 좋아하는 double 형 소수점은 " + 3.14);
        // 
        // 정수의 덧셈
        System.out.printf("내가 좋아하는 알파벳 : %s\n", 'N');
        System.out.println(7 + 7);

        // 정수의 덧셈 및 문자열 결합 연산
        System.out.println(2 + 2 + "안녕하세요");

        // 문자 연산 -> 공백에 대한 코드 값이 더해진 것.
        System.out.println(7 + 7 + ' ');

        return;
    }
}
