package me.ohdyno.xing.katas.karate.chop.inplace.recursive;

import me.ohdyno.xing.katas.karate.chop.KarateChopContract;

public class ChopTest implements KarateChopContract {
    @Override
    public int doIt(int target, int[] numbers) {
        return new Chop().doIt(target, numbers);
    }
}
