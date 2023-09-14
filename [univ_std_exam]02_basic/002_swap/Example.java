
public class Example {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 002_swap 예제의 목표는
        // 두 변수의 값을 서로 바꾸는 로직을 작성함으로써, 변수 활용을 실습.
        // ------------------------------------------------------------------
        
        int a = 100;
        int b = 200;
        int tmp;

        // 값 붙여서 출력하기
        System.out.print("swap 전 a, b의 값 = ");
        System.out.println(a + ", " + b);

        // 두 변수의 값을 교환하기 전 값을 출력
        // System.out.println("a = " + a + "\nb = " + b); //
        // 두 변수의 값을 교환
        tmp = a; a = b; b = tmp;
        System.out.println("-------------");
        // 교환된 두 변수의 값을 확인.
        System.out.println("a = " + a + "\nb = " + b);        
        return;
    }
}