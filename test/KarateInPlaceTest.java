/**
 * Created by Xing Zhou (@ohdyno) on 11/1/16.
 */

public class KarateInPlaceTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateInPlace().chop(target, numbers);
    }
}
