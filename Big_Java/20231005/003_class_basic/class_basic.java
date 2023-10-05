// package Big_Java.20231005.003_class_basic;

public class class_basic {
    public static void main(String[] agrs){
       TV t = new TV(); // TV 형 참조 변수 t를 생성하고 인스턴스를 heap 영역에 할당 후 저장
       t.channel = 5; // 채널을 5로 설정, 연산자로 t가 가리키는 인스턴스의 멤버 함수에 접근하여 값을 저장
       System.out.println(t.channel); 
       t.channelDown(); // 멤버 함수
       t.channelUP(); // 멤버 함수
       System.out.printf("현재 채널은 %d 입니다.\n", t.channel);
       System.out.printf("제조사는 %s 입니다", t.maunfactor);
    }
}

class variable {
    public int iv;  // 인스턴스 변수
    public static int cv; // 클래스 변수
    public static void main(String[] args){
        int lv = 0; // 지역변수
    }
}

// tv라는 클래스를 정의
class TV {
    String color;
    boolean power;
    int channel;
    String maunfactor = "ARTNOA INC";

    // 기능에 해당하는 멤버 메소드
    void power() { power = !power; }
    void channelUP() { channel ++; }
    void channelDown() { channel  -- ;}
    int getChannel() { return channel; }
    String getmanufactor() { return maunfactor; }
}