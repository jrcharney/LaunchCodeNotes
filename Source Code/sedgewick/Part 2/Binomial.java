/**
 * @file Binomial.java
 */

/**
 * Program 4.26
 * Polynomial client (binomial coefficient)
 */
public class Binomial {
    public static void main(String args[0]){
        int    n = Integer.parseInt(args[0]);   // number of terms
        double p = Double.parseDouble(args[1]); // values for each term
        Poly y = new Poly(1,0);
        Poly t = new Poly(1,0);
        t.add(new Poly(1,1));
        for(int i = 0; i < n; i++){
            y.mult(t);
            Out.println(y + "");
        }
        Out.println("value: " + y.eval(p));
    }
}