package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX = 11;
    private static final int EMPTY = -1;
    private static final int RETURN = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getMAX() {
        return MAX;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getRETURN() {
        return RETURN;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }
    public int getTotal(){return total;}

    public int[] getNumbers() {
        return numbers;
    }
}
