package algorithms;

import java.util.Arrays;

/**
 * ArraysAreSimilar class helps to determine if a given pair of arrays are similar based on some conditions.
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
 */
public class ArraysAreSimilar {

    /**
     * Allows to determine if a pair of arrays are similar or not.
     *
     * @param a corresponds to the first int array that will be compared.
     * @param b corresponds to the second int array that will be compared.
     * @return true if the given arrays are similar and false if they are not.
     */
    public boolean areSimilar(int[] a, int[] b) {
        int count = 0;

        //Create a copy of the original arrays
        int[] copyA = copyOfArray(a);
        int[] copyB = copyOfArray(b);

        //Sort copied arrays
        sortArray(copyA);
        sortArray(copyB);

        //Check if copiedArrays have different size or numbers.
        if ((copyA.length != copyB.length) || !Arrays.equals(copyA, copyB)) {
            return false;
        }

        //Check quantity of different values.
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count <= 2;
    }

    /**
     * Allows to copy a given array.
     *
     * @param array corresponds to the original array that will be copied.
     * @return the copy of the original array.
     */
    private int[] copyOfArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    /**
     * Allows to sort a given array, so the values inside it are in order.
     *
     * @param array to be sorted.
     */
    private void sortArray(int[] array) {
        Arrays.sort(array);
    }

}
