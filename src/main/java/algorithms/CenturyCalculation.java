package algorithms;

import java.util.logging.Logger;

/**
 * CenturyCalculation class contains one method that allows to find the century of a given year.
 */
public class CenturyCalculation {

    private static final Logger LOGGER = Logger.getLogger(CenturyCalculation.class.getName());

    /**
     * Allows to calculate the century of a year by subtracting one to the given year, then diving it between 100 and finally adding one
     * to the result.
     * If the given year is invalid it will return 0.
     *
     * @param year corresponds to the year which will be used for calculating the century.
     * @return the century obtained.
     */
    public int centuryFromYear(int year) {
        if (year < 1) {
            LOGGER.info("Invalid Year was entered");
            return 0;
        }
        return 1 + (year - 1) / 100;
    }

}
