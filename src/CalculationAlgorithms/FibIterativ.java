package CalculationAlgorithms;

/**
 * Iterative Berechnung von Fibonacci-Zahlen
 * @author Patrick Vogt
 * @see CalculationAlgorithms.Fibonacci
 */
public class FibIterativ extends Fibonacci {

    /**
     * Iterative Berechnung der n-ten Fibonacci-Zahl
     * @param n Zu berechnende Fibonacci-Zahl
     * @return n-te Fibonacci-Zahl
     */
    public int calculate(int n) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 0; i < n; i++) {
            int tempPrev = prev1;
            prev1 = prev2;
            prev2 = tempPrev + prev2;
        }
        return prev1;
    }

}