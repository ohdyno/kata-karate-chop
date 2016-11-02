public class KarateInPlaceIterativeTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateInPlaceIterative().chop(target, numbers);
    }
}
