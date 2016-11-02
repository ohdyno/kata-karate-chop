/**
 * Created by Xing Zhou (@ohdyno) on 11/1/16.
 */

public class KarateLowHighTest implements KarateChopContract {
    @Override
    public int chop(int target, int[] numbers) {
        return new KarateLowHigh().chop(target, numbers);
    }
}
