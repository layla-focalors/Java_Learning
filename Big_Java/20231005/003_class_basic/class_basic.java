// package Big_Java.20231005.003_class_basic;

public class class_basic {
    public static void main(String[] agrs){
       TV t = new TV();
       t.channel = 5;
       System.out.println(t.channel);
       t.channelDown();
       t.channelUP();
       System.out.printf("현재 채널은 %d 입니다.", t.channel);
    }
}

// tv라는 클래스를 정의
class TV {
    String color;
    boolean power;
    int channel;

    // 기능에 해당하는 멤버 메소드
    void power() { power = !power; }
    void channelUP() { channel ++; }
    void channelDown() { channel  -- ;}
    int getChannel() { return channel; }
}