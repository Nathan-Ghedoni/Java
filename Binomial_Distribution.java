/**
 * @author Nathan Ghedoni
 * @version 2024-03-12
 * This class will be used for calculating binomial distribution problems
 */
import java.math.BigInteger;
public class Binomial_Distribution {
    private int n;
    private int x;
    private double p;
    private double q;
    
    /**
     * Creates an object that contains the components for the binomial probability formula set to 0.
     */
    public Binomial_Distribution() {
        this.setN(0);
        this.setX(0);
        this.setP(0.0);
        this.setQ(0.0);
    }
    
    /**
     * Creates an object that contains the components for the binomial probability formula.
     * @param n Number of independent trials.
     * @param x Number of successes in n independent trials of an experiment.
     * @param p Probability of success for each trial.
     * @param q Probability of failure for each trial.
     */
    public Binomial_Distribution(int n, int x, double p, double q) {
        this.setN(n);
        this.setX(x);
        this.setP(p);
        this.setQ(q);
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the p
     */
    public double getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public double getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(double q) {
        this.q = q;
    }
    /**
     * This calculates the factorial for any integer.
     * @param num The integer that the factorial will be calculated for.
     * @return The factorial for the chosen integer.
     */
    public long factorial(int num) {
        long product = 1;
        for (int i = num; i > 0; i--) {
            product *= i;
        }
        return product;
    }
    /**
     * This method calculates the combination for the binomial distribution formula.
     * @return
     */
    public long combination() {
        return this.factorial(n) / (this.factorial(x) * this.factorial(n - x));
    }
    /**
     * This calculates the binomial distribution
     * @return the binomial distribution
     */
    public double calculate() {
        return this.combination() * Math.pow(p, x) * Math.pow(q, (n - x));
    }
    
    
}
