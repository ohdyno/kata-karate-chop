package me.ohdyno.xing.katas.karatechop.tree;

import me.ohdyno.xing.katas.karatechop.KarateChop;

public class Chop implements KarateChop {
    @Override
    public int doIt(int target, int[] numbers) {
        return new BST(numbers).find(target);
    }
}
