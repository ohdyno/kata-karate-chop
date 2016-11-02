public class KarateChopPartitionIterativeTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateChopPartitionIterative().chop(target, numbers);
    }
}
