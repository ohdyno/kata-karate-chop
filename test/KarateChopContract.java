import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface KarateChopContract extends Karate {

    int[] EMPTY_ARRAY = {};
    int[] SINGLETON_ARRAY = {1};
    int[] ODD_ARRAY = {1, 3, 5};

    @Test
    default void chopEmptyArray() {
        assertEquals(-1, chop(3, EMPTY_ARRAY));
    }

    @Test
    default void chopSingleElementArrayDoesContain() {
        assertEquals(0, chop(1, SINGLETON_ARRAY));
    }

    @Test
    default void chopSingleElementArrayDoesNotContain() {
        assertEquals(-1, chop(3, SINGLETON_ARRAY));
    }

    @Test
    default void chopMultiElementsArrayExistsAtIndexZero() {
        assertEquals(0, chop(1, ODD_ARRAY));
    }

    @Test
    default void chopMultiElementsArrayExistsAtIndexOne() {
        assertEquals(1, chop(3, ODD_ARRAY));
    }

    @Test
    default void chopEvenElementsArray() {
        assertEquals(0, chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, chop(3, new int[]{1, 3, 5, 7}));

    }
}