package algorithms.tests.secondchallenge;

import algorithms.MatrixElementsSumCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixElementsSumTest {

    /**
     * Basic test to validate the correct functionality of MatrixElementsSumCalculation.
     */
    @Test
    public void testMatrixElementsSumForAGivenMatrix() {
        MatrixElementsSumCalculation matrix = new MatrixElementsSumCalculation();
        int[][] matrixExample = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
        Assert.assertEquals(matrix.matrixElementsSum(matrixExample), 9);
    }

    /**
     * Basic test to validate the correct functionality of MatrixElementsSumCalculation when all rooms are 0 value except
     * the ones of the last floor .
     */
    @Test
    public void testMatrixSumForAMatrixWithLastFloorNotHaunted() {
        MatrixElementsSumCalculation matrix = new MatrixElementsSumCalculation();
        int[][] matrixExample = {{0, 0, 0, 0}, {0, 0, 0, 0}, {4, 6, 1, 3}};
        Assert.assertEquals(matrix.matrixElementsSum(matrixExample), 0);
    }

    /**
     * Basic test to validate the correct functionality of MatrixElementsSumCalculation when there are not haunted rooms.
     */
    @Test
    public void testMatrixSumForAMatrixWithoutHauntedRooms() {
        MatrixElementsSumCalculation matrix = new MatrixElementsSumCalculation();
        int[][] matrixExample = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        Assert.assertEquals(matrix.matrixElementsSum(matrixExample), 12);
    }

}
