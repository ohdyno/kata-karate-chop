public class KarateChopInPlaceRecursiveTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateChopInPlaceRecursive().chop(target, numbers);
    }
}
