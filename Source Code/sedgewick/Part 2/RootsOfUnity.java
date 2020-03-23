/**
 * Program 4.19
 * Complex numbers driver (roots of unity)
 * Note: To get this program to work, I worked on Complex.java (Program 4.20) first
 * @see Complex.java
 */
public class RootsOfUnity {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        Out.println(n + " roots of unity");
        for(int k = 0; k < n; k++){
            double angle = 2.0*Math.PI*k/n;
            double x = Math.cos(angle);
            double y = Math.sin(angle);
            Complex t = new Complex(x,y);
            Out.print(k + ": " + t);
            Complex z = (Complex) t.clone();
            for(int j = 0; j < n-1; j++)
                z.mult(t);
            Out.println(" " + z);
        }
    }
}