package algorithms.tests.firstchallenge;

import algorithms.CenturyCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CenturyCalculationTest {

    private CenturyCalculation century = new CenturyCalculation();

    /**
     * Basic test to validate the correct functionality of CenturyCalculation with valid year values.
     */
    @Test
    public void calculateCenturyForAValidYear() {
        Assert.assertEquals(century.centuryFromYear(1906), 20);
    }

    /**
     * Basic test to validate the correct functionality of CenturyCalculation with an invalid year.
     */
    @Test
    public void calculateCenturyForAnIValidYear() {
        Assert.assertEquals(century.centuryFromYear(-1906), 0);
    }

    /**
     * Basic test to validate the correct functionality of CenturyCalculation with a valid limit year.
     */
    @Test
    public void calculateCenturyForAValidLimitYear() {
        Assert.assertEquals(century.centuryFromYear(1), 1);
    }

    /**
     * Basic test to validate the correct functionality of CenturyCalculation with an invalid limit year.
     */
    @Test
    public void calculateCenturyForAnInvalidLimitYear() {
        Assert.assertEquals(century.centuryFromYear(0), 0);
    }

}
