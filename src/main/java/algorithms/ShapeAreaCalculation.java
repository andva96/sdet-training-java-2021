package algorithms;

/**
 * This class allows to find the area of a polygon for a given "n".
 * Note: n = 1 is just a square with side of length 1.
 * An n polygon is obtained by taking the n-1 polygon and appending 1 polygons to its rim, side by side.
 */
public class ShapeAreaCalculation {

    /**
     * Allows to calculate the area of a polygon for a given n.  n*n gives the area for the external squares,
     * and n-1 * n-1 gives the area for the internal squares.
     *
     * @param n defines the polygon for which the area is calculated.
     * @return the total area for the given polygon.
     */
    public int shapeArea(int n) {
        return ((n - 1) * (n - 1)) + (n * n);
    }

}
