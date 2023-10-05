// package Big_Java.20231005.004 instance;

public class instance {
    public static void main(String[] args){
        TV_A134 t = new TV_A134();
        t.Setcolor("violet");
        System.out.printf("tv color is : %s", t.color);
    }
}
class TV_A134{
    static int width = 1280;
    static int height = 720;
    static String model_name = "A134";

    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUP() { channel++; }
    void channelDown() {channel--;}
    void Setcolor(String c) { color = c;}
    String getcolor() { return color; }
    int getchannel() { return channel; }
}
