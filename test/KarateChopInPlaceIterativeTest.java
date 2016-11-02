public class KarateChopInPlaceIterativeTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateChopInPlaceIterative().chop(target, numbers);
    }
}
