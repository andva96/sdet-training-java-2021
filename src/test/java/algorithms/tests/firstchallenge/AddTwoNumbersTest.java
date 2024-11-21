package algorithms.tests.firstchallenge;

import algorithms.AddTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addition = new AddTwoNumbers();

    /**
     * Basic test to validate the correct functionality of AddTwoNumbers when there are two negative inputs.
     */
    @Test
    public void calculateSumOfTwoNegativeNumbers() {
        Assert.assertEquals(addition.add(-8, -8), -16);
    }

    /**
     * Basic test to validate the correct functionality of AddTwoNumbers when there are two positive inputs.
     */
    @Test
    public void calculateSumOfTwoPositiveNumbers() {
        Assert.assertEquals(addition.add(60, 60), 120);
    }

    /**
     * Basic test to validate the correct functionality of AddTwoNumbers when there are one positive and one negative inputs.
     */
    @Test
    public void calculateSumOfOneNegativeAndOnePositiveNumber() {
        Assert.assertEquals(addition.add(12, -12), 0);
    }

}
