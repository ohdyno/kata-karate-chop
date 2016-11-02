package me.ohdyno.xing.katas.karatechop.inplace.iterative;

import me.ohdyno.xing.katas.karatechop.KarateChop;

public class Chop implements KarateChop {
    @Override
    public int doIt(int target, int[] numbers) {
        int low = 0;
        int high = numbers.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target)
                return mid;

            if (target < numbers[mid])
                high = mid;
            else
                low = mid + 1;
        }

        return -1;
    }
}
