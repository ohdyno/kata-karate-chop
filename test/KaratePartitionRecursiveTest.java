public class KaratePartitionRecursiveTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KaratePartitionRecursive().chop(target, numbers);
    }
}
