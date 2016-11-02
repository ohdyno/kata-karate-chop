package me.ohdyno.xing.katas.karate.chop.partition.iterative;

import me.ohdyno.xing.katas.karate.chop.KarateChop;

import java.util.Arrays;

public class Chop implements KarateChop {
    @Override
    public int doIt(int target, int[] numbers) {
        int offset = 0;
        while (numbers.length > 0) {
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

            offset += low;
            numbers = Arrays.copyOfRange(numbers, low, high);
        }
        return -1;
    }
}
