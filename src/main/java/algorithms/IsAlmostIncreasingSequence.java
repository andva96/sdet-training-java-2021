package algorithms;

/**
 * Given a sequence of integers as an array, this class helps to determine whether it is possible to obtain a strictly
 * increasing sequence by removing no more than one element from the array.
 * Note: sequence a0, a1, ....., an is considered to be a strictly increasing if a0 < a1 < .... < an.
 * Sequence containing only one element is also considered to be strictly increasing.
 *
 */
public class IsAlmostIncreasingSequence {

    /**
     * Allows to determine if a sequence is almost increasing or not.
     *
     * @param sequence corresponds to the sequence that will be analyze to determine if it is almost increasing or not.
     * @return true or false depending if the sequence is almost increasing or not.
     */
    public boolean almostIncreasingSequence(int[] sequence) {
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i + 1] <= sequence[i]) count++;
        }
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i + 2] <= sequence[i]) count1++;
        }
        return (count <= 1) && (count1 <= 1);
    }

}
