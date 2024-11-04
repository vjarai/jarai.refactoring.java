package ueb7.Kniffel.original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class KniffelTests {

    @Test
    public void testOnes() {
        assertEquals(2, Kniffel.ones(1, 1, 2, 3, 4));
        assertEquals(0, Kniffel.ones(2, 2, 2, 3, 4));
    }

    @Test
    public void testTwos() {
        assertEquals(4, Kniffel.twos(2, 2, 3, 4, 5));
        assertEquals(0, Kniffel.twos(1, 3, 3, 4, 5));
    }

    @Test
    public void testThrees() {
        assertEquals(6, Kniffel.threes(3, 3, 1, 2, 4));
        assertEquals(0, Kniffel.threes(1, 2, 4, 5, 6));
    }

    @Test
    public void testFours() {
        Kniffel game = new Kniffel(4, 4, 1, 2, 3);
        assertEquals(8, game.fours());
    }

    @Test
    public void testFives() {
        Kniffel game = new Kniffel(5, 5, 1, 2, 3);
        assertEquals(10, game.fives());
    }

    @Test
    public void testSixes() {
        Kniffel game = new Kniffel(6, 6, 1, 2, 3);
        assertEquals(12, game.sixes());
    }

    @Test
    public void testScorePair() {
        assertEquals(8, Kniffel.scorePair(4, 4, 1, 2, 3));
        assertEquals(0, Kniffel.scorePair(1, 2, 3, 4, 5));
    }

    @Test
    public void testTwoPair() {
        assertEquals(16, Kniffel.twoPair(4, 4, 3, 3, 1));
        assertEquals(0, Kniffel.twoPair(1, 2, 3, 4, 5));
    }

    @Test
    public void testFourOfAKind() {
        assertEquals(16, Kniffel.fourOfAKind(4, 4, 4, 4, 1));
        assertEquals(0, Kniffel.fourOfAKind(1, 2, 3, 4, 5));
    }

    @Test
    public void testThreeOfAKind() {
        assertEquals(9, Kniffel.threeOfAKind(3, 3, 3, 1, 2));
        assertEquals(0, Kniffel.threeOfAKind(1, 2, 3, 4, 5));
    }

    @Test
    public void testSmallStraight() {
        assertEquals(15, Kniffel.smallStraight(1, 2, 3, 4, 5));
        assertEquals(0, Kniffel.smallStraight(1, 2, 3, 4, 6));
    }

    @Test
    public void testLargeStraight() {
        assertEquals(20, Kniffel.largeStraight(2, 3, 4, 5, 6));
        assertEquals(0, Kniffel.largeStraight(1, 2, 3, 4, 5));
    }

    @Test
    public void testFullHouse() {
        assertEquals(18, Kniffel.fullHouse(6, 6, 6, 3, 3));
        assertEquals(0, Kniffel.fullHouse(1, 2, 3, 4, 5));
    }
}