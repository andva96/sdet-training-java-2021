package algorithms.tests.thirdchallenge;

import algorithms.ArraysAreSimilar;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysAreSimilarTest {

    private ArraysAreSimilar similar = new ArraysAreSimilar();

    /**
     * Test to validate that two arrays with different length are not considered similar.
     */
    @Test
    public void compareArraysWithDifferentLength() {
        assertThat(similar.areSimilar(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4})).isFalse();
    }

    /**
     * Test to validate that two arrays with different Numbers are not considered similar.
     */
    @Test
    public void compareArraysWithDifferentNumbers() {
        assertThat(similar.areSimilar(new int[]{1, 2, 4}, new int[]{1, 2, 3})).isFalse();
    }

    /**
     * Test to validate that two identical arrays are considered similar.
     */
    @Test
    public void compareEqualArrays() {
        assertThat(similar.areSimilar(new int[]{1, 2, 3}, new int[]{1, 2, 3})).isTrue();
    }

    /**
     * Test to validate that two arrays with position one and second switched are considered similar.
     */
    @Test
    public void compareSimilarArrays_FirstAndSecondPositionSwitched() {
        assertThat(similar.areSimilar(new int[]{1, 2, 3}, new int[]{2, 1, 3})).isTrue();
    }

    /**
     * Test to validate that two arrays with position one and third switched are considered similar.
     */
    @Test
    public void compareSimilarArrays_FirstAndThirdPositionSwitched() {
        assertThat(similar.areSimilar(new int[]{1, 2, 3}, new int[]{3, 2, 1})).isTrue();
    }

    /**
     * Test to validate that two arrays with all positions with different values are not considered similar.
     */
    @Test
    public void compareNotSimilarArrays() {
        assertThat(similar.areSimilar(new int[]{1, 2, 3}, new int[]{3, 1, 2})).isFalse();
    }

}
