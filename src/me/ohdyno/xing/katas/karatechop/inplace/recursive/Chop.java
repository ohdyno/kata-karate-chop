package me.ohdyno.xing.katas.karatechop.inplace.recursive;

import me.ohdyno.xing.katas.karatechop.KarateChop;

public class Chop implements KarateChop {
    public int doIt(int target, int[] numbers) {
        return doItInPlace(target, numbers, 0, numbers.length);
    }

    private int doItInPlace(int target, int[] numbers, int low, int high) {
        if (low >= high)
            return -1;

        int mid = (low + high) / 2;
        if (numbers[mid] == target)
            return mid;
        else if (target < numbers[mid])
            return doItInPlace(target, numbers, low, mid);
        else if (target > numbers[mid])
            return doItInPlace(target, numbers, mid + 1, high);

        return -1;
    }
}
