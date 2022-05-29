package Java1.L1;

public class ClassMain {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 4;
        long l = 81234567890L;
        float f = 1.2345678899f;
        double d = 1.34567789905656;
        char c = 'G';
        System.out.println("Hello World");
        myMethod(1, 3, 5, 6);
        System.out.println(anything(1,4,3));
        plusOrMinus(-4);
        priverName("vasya");
        yearVisok(2000);
        yearVisok(1900);
        yearVisok(2020);
        yearVisok(2022);


    }
    private static void yearVisok(int a) {
        if (a % 400 == 0) {
            System.out.println("Yes");
        } else {
            if (a % 100 == 0) {
                System.out.println("NO");
            } else {
                if (a % 4 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static void priverName(String s){
        System.out.println("Privet " + s);
    }


    private static void plusOrMinus(int a){
        if (a>=0){
            System.out.println("положительное");
        } else System.out.println("отрицательное");
    }

    private static boolean anything(int a, int b, int c) {
        if (c > a && c < b) {
            return true;
        } else {
            return false;
        }
    }

    private static void myMethod(int a, int b, int c, int d) {
        System.out.println(a * (b + (c / d)));
    }
}
