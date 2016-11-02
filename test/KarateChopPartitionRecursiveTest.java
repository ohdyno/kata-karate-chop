public class KarateChopPartitionRecursiveTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateChopPartitionRecursive().chop(target, numbers);
    }
}
