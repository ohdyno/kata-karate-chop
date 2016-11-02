public class KaratePartitionIterativeTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KaratePartitionIterative().chop(target, numbers);
    }
}
