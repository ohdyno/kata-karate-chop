public class KarateChopBSTTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateChopBST().chop(target, numbers);
    }
}
