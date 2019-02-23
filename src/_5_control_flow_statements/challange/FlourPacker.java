package _5_control_flow_statements.challange;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(1, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-2, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        return (goal >= 0) &&
                (bigCount + smallCount >= goal) &&
                (smallCount >= goal % 5);
    }
}


