package algorithms.tests.secondchallenge;

import algorithms.IsAlmostIncreasingSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsAlmostIncreasingSequenceTest {

    /**
     * Basic test to validate the correct functionality of IsAlmostIncreasingSequence using a real sequence.
     */
    @Test
    public void testAlmostIncreasingSequenceWithRealSequence() {
        IsAlmostIncreasingSequence sequence = new IsAlmostIncreasingSequence();
        int[] sequenceExample = {0, 1, 2, 3};
        Assert.assertTrue(sequence.almostIncreasingSequence(sequenceExample));
    }

    /**
     * Basic test to validate the correct functionality of IsAlmostIncreasingSequence using an almost increasing sequence.
     */
    @Test
    public void testAlmostIncreasingSequenceWithAlmostIncreasingSequence() {
        IsAlmostIncreasingSequence sequence = new IsAlmostIncreasingSequence();
        int[] sequenceExample = {0, -6, 2, 3};
        Assert.assertTrue(sequence.almostIncreasingSequence(sequenceExample));
    }

    /**
     * Basic test to validate the correct functionality of IsAlmostIncreasingSequence when there is only one value.
     */
    @Test
    public void testAlmostIncreasingSequenceWithOnlyOneValue() {
        IsAlmostIncreasingSequence sequence = new IsAlmostIncreasingSequence();
        int[] sequenceExample = {1};
        Assert.assertTrue(sequence.almostIncreasingSequence(sequenceExample));
    }

    /**
     * Basic test to validate the correct functionality of IsAlmostIncreasingSequence using an invalid sequence.
     */
    @Test
    public void testAlmostIncreasingSequenceWithInvalidSequence() {
        IsAlmostIncreasingSequence sequence = new IsAlmostIncreasingSequence();
        int[] sequenceExample = {0, -1, 2, 3, 6, 4};
        Assert.assertFalse(sequence.almostIncreasingSequence(sequenceExample));
    }

}
