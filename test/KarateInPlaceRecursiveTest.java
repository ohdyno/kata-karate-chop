public class KarateInPlaceRecursiveTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateInPlaceRecursive().chop(target, numbers);
    }
}
