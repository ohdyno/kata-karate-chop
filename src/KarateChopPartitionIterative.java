import java.util.Arrays;

public class KarateChopPartitionIterative implements KarateChop {
    @Override
    public int chop(int target, int[] numbers) {
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
