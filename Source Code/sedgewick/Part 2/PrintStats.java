/**
 * Program 3.3
 * Statistics of a sequence of random numbers
 * @file PrintStats.java
 * This program will computer the average ($\mu$) and standard deviation ($\sigma$)
 * of a sequence ($x_1, x_2, \dots, x_N$) of random non-negative four-digit integers,
 * following the mathematical defintions
 $$
 \begin{aligned}
 \mu &= \frac{1}{N}\sum_{i = 1}^{N} x_i \\
 \sigma^2 &= \frac{1}{N}\sum_{i = 1}^{N} (x_i - \mu)^2 \\
          &= \frac{1}{N}\sum_{i = 1}^{N} x_i^2 - \mu^2
 \end{aligned}
 $$
 * Note that direct implementation from the defintion $\sigma^2$ requires one pass
 * to compute the average and another to computer the sums of the squares of the
 * differences between members of the sequence and the average, but rearranging
 * the formula makes it possible for us to computer $\sigma^2$ in one pass through
 * the data (without having to store any of it!)
 */
class PrintStats {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double m = 0.0, s = 0.0;
        for(int i = 0; i < n; i++){
            int x = (int) (Math.random() * 10000);
            double d = (double) x;
            m += d/n;
            s += (d*d)/n;
        }
        s = Math.sqrt(s - m*m);
        Out.println("     Avg.: " + m);
        Out.println("Std. dev.: " + s);
    }
}
