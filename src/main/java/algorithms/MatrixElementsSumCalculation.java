package algorithms;

/**
 * Given "matrix", a rectangular matrix of integers where each value represents the cost of the room,
 * calculate and return the total sum of all rooms that are suitable for the CodeBots.
 * Context: After becoming famous, the codeBots decided to move into a new building together.
 * Each of the rooms has a different cost, and some of them are free, but there is a rumour that all
 * free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms,
 * or any of the rooms below any of the free rooms.
 */
public class MatrixElementsSumCalculation {

    /**
     * Method that allows to calculate the total sum of available-suitable rooms.
     *
     * @param matrix defines the dimensions of the building and the status of the rooms.
     *               Each matrix[][] position corresponds to a room of the building.
     *               A value of 0 on a room indicates that the room is haunted.
     * @return the total sum of all rooms that are suitable.
     */
    public int matrixElementsSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) sum = sum + matrix[i][j];
                if (i > 0) {
                    if (matrix[i - 1][j] == 0) {
                        matrix[i][j] = 0;
                        sum = sum + matrix[i][j];
                    } else sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

}
