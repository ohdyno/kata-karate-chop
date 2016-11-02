package me.ohdyno.xing.katas.karatechop.partition.iterative;

import me.ohdyno.xing.katas.karatechop.KarateChopContract;

public class ChopTest implements KarateChopContract {
    @Override
    public int doIt(int target, int[] numbers) {
        return new Chop().doIt(target, numbers);
    }
}
