package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
