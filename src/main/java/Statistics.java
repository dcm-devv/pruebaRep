import org.apache.commons.math3.stat.StatUtils;

/**
 * A utility class providing basic statistical methods for arrays of numbers.
 */
public class Statistics {
    public double median(double[] arrayOfNumbers){
        if(arrayOfNumbers.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        return StatUtils.percentile(arrayOfNumbers,50.0);
    }
    /**
     * Computes the maximum value in an array of numbers.
     *
     * @param arrayOfNumbers an array of double values (must not be empty)
     * @return the maximum value in the array
     * @throws IllegalArgumentException if the array is empty
     */
    public double maximumValue(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double max = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > max) {
                max = arrayOfNumbers[i];
            }
        }
        return max;
    }

    /**
     * Computes the minimum value in an array of numbers.
     *
     * @param arrayOfNumbers an array of double values (must not be empty)
     * @return the minimum value in the array
     * @throws IllegalArgumentException if the array is empty
     */
    public double minimumValue(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double min = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < min) {
                min = arrayOfNumbers[i];
            }
        }
        return min;
    }

    /**
     * Computes the mean (average) value of an array of numbers.
     *
     * @param arrayOfNumbers an array of double values (must not be empty)
     * @return the mean (average) of the array
     * @throws IllegalArgumentException if the array is empty
     */
    public double mean(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double sum = 0.0;
        for (double num : arrayOfNumbers) {
            sum += num;
        }
        return sum / arrayOfNumbers.length;
    }
}
