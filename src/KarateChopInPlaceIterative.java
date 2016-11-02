public class KarateChopInPlaceIterative implements KarateChop {
    @Override
    public int chop(int target, int[] numbers) {
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
