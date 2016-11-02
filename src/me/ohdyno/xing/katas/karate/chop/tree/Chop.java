package me.ohdyno.xing.katas.karate.chop.tree;

import me.ohdyno.xing.katas.karate.chop.KarateChop;

public class Chop implements KarateChop {
    @Override
    public int doIt(int target, int[] numbers) {
        return new BinarySearchTree(numbers).find(target);
    }
}
