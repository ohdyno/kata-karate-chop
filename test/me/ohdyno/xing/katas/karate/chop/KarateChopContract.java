package me.ohdyno.xing.katas.karate.chop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface KarateChopContract extends KarateChop {

    int[] EMPTY_ARRAY = {};
    int[] SINGLETON_ARRAY = {1};
    int[] ODD_ARRAY = {1, 3, 5};
    int[] EVEN_ARRAY = {1, 3, 5, 7};

    @Test
    default void chopEmptyArray() {
        assertEquals(-1, doIt(3, EMPTY_ARRAY));
    }

    @Test
    default void chopSingleElementArrayExists() {
        assertEquals(0, doIt(1, SINGLETON_ARRAY));
    }

    @Test
    default void chopSingleElementArrayDoesNotExist() {
        assertEquals(-1, doIt(3, SINGLETON_ARRAY));
    }

    @Test
    default void chopOddArrayExistsAtFirstIndex() {
        assertEquals(0, doIt(1, ODD_ARRAY));
    }

    @Test
    default void chopOddArrayExistsAtMiddleIndex() {
        assertEquals(1, doIt(3, ODD_ARRAY));
    }

    @Test
    default void chopOddArrayExistsAtLastIndex() {
        assertEquals(ODD_ARRAY.length - 1, doIt(5, ODD_ARRAY));
    }

    @Test
    default void chopOddArrayDoesNotExist() {
        assertEquals(-1, doIt(11, ODD_ARRAY));
    }

    @Test
    default void chopEvenArrayExistsAtFirstIndex() {
        assertEquals(0, doIt(1, EVEN_ARRAY));
    }

    @Test
    default void chopEvenArrayExistsAtLastIndex() {
        assertEquals(EVEN_ARRAY.length - 1, doIt(7, EVEN_ARRAY));
    }

    @Test
    default void chopEvenArrayExistsAtFloorMiddleIndex() {
        assertEquals((EVEN_ARRAY.length - 1) / 2, doIt(3, EVEN_ARRAY));
    }

    @Test
    default void chopEvenArrayExistsAtCeilMiddleIndex() {
        assertEquals(EVEN_ARRAY.length / 2, doIt(5, EVEN_ARRAY));
    }

    @Test
    default void chopEvenArrayDoesNotExist() {
        assertEquals(-1, doIt(11, EVEN_ARRAY));
    }
}