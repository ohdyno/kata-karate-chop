public class KarateChopBST implements KarateChop {
    @Override
    public int chop(int target, int[] numbers) {
        return new BST(numbers).find(target);
    }
}
