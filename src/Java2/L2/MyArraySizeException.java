package Java2.L2;

public class MyArraySizeException extends Exception {
    private int trueArraySize = 4;

    public MyArraySizeException(String message) {
        super(message);
    }
}
