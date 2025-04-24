package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int STACK_EMPTY_INDEX = -1;
    private static final int EMPTY_STACK_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = STACK_EMPTY_INDEX;

    /**
     *
     * gettery
     */
    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getEMPTY() {
        return STACK_EMPTY_INDEX;
    }

    public static int getRETURN() {
        return EMPTY_STACK_VALUE;
    }
    public int[] getNumbers() {
        return numbers;
    }

    /**
     *
     * dodanie przedmiotu na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     *
     * Zwraca: true, jeśli nie ma żadnych elementów (czyli total == -1), w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == STACK_EMPTY_INDEX;
    }

    /**
     *
     * Zwraca: true, jeśli liczba elementów osiągnęła maksymalną wartość (total == 11), inaczej false.
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     *
     *Podgląda ostatni element na stosie bez usuwania go
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    /**
     *
     *Podgląda ostatni element na stosie bez usuwania go
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }
    public int getTotal(){return total;}


}
