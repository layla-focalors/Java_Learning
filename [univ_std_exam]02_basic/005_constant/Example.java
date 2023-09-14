
public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 005_constant 예제의 목표는
        // 심볼릭 상수에 대해 이해하며, final 키워드 및 그 특성을 이해하고 실습.
        // ------------------------------------------------------------------
        
        // 심볼릭 상수의 선언 및 초기화 
        
        MAX_NUMBER = 10; // 변수의 선언과 동시에 초기화를 했으므로 값의 변경 불가 -> Error, 10은 리터럴 상수
        MIN_NUMBER = 2; // 이미 초기화가 되었으므로 값의 변경 불가 -> Error, 2는 리터럴 상수

        System.out.println(MAX_NUMBER);
        System.out.println(MIN_NUMBER);
        return;
    }
}