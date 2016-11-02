package me.ohdyno.xing.katas.karatechop.partition.recursive;

import me.ohdyno.xing.katas.karatechop.KarateChop;

import java.util.Arrays;

public class Chop implements KarateChop {
    @Override
    public int doIt(int target, int[] numbers) {
        return doItWithOffset(target, numbers, 0);
    }

    private int doItWithOffset(int target, int[] numbers, int offset) {
        if (numbers.length <= 0)
            return -1;

        int mid = numbers.length / 2;
        int midNumber = numbers[mid];
        if (midNumber == target)
            return mid + offset;

        int low = 0, high = numbers.length;
        if (target < midNumber) {
            high = mid;
        } else {
            low = mid + 1;
        }

        return doItWithOffset(target, Arrays.copyOfRange(numbers, low, high), low + offset);
    }
}
