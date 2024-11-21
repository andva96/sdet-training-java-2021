package algorithms.tests.secondchallenge;

import algorithms.ShapeAreaCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShapeAreaTest {

    private ShapeAreaCalculation area = new ShapeAreaCalculation();

    /**
     * Basic test to validate the correct functionality of ShapeAreaCalculation using the min value.
     */
    @Test
    public void testShapeAreaCalculationWithMinValue() {
        Assert.assertEquals(area.shapeArea(1), 1);
    }

    /**
     * Basic test to validate the correct functionality of ShapeAreaCalculation using the max value.
     */
    @Test
    public void testShapeAreaCalculationWithMaxValue() {
        Assert.assertEquals(area.shapeArea(10000), 199980001);
    }

}
