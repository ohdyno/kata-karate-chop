public class KarateLowHigh implements Karate {
    public int chop(int target, int[] numbers) {
        return chopHelper(target, numbers, 0, numbers.length);
    }

    private int chopHelper(int target, int[] numbers, int low, int high) {
        if (low >= high)
            return -1;

        int mid = (low + high) / 2;
        if (numbers[mid] == target)
            return mid;
        else if (target < numbers[mid])
            return chopHelper(target, numbers, low, mid);
        else if (target > numbers[mid])
            return chopHelper(target, numbers, mid + 1, high);

        return -1;
    }
}
