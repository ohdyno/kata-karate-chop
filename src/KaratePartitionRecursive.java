import java.util.Arrays;

public class KaratePartitionRecursive implements Karate {
    @Override
    public int chop(int target, int[] numbers) {
        return chopWithOffset(target, numbers, 0);
    }

    private int chopWithOffset(int target, int[] numbers, int offset) {
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

        return chopWithOffset(target, Arrays.copyOfRange(numbers, low, high), low + offset);
    }
}
