/**
 * @file Poly.java
 * @desc polynomial ADT
 */

/**
 * Program 4.25
 * ADT interface for polynomial
 * Note: For 4.25, implementations and private members are hidden
 * Program 4.27
 * Array implementation of polynomial ADT
 */
class Poly {
    /*
    // 4.25
    Poly(int, int)
    double eval(double)
    void add(Poly)
    void mult(Poly)
    public String toString()
    */
    private int n;
    private int[] a;
    Poly(int c, int m){
        n = m + 1;
        a = new int[n];
        a[m] = c;
        for(int i = 0; i < m; i++){
            a[i] = 0;
        }
    }
    double eval(double d){
        double t = 0.0;
        for(int i = n-1; i >= 0; i--){
            t = t*d + (double) a[i];
        }
        return t;
    }
    void add(Poly p){
        int [] t = new int[(p.n > n) ? p.n : n];
        for(int i = 0; i < p.n; i++){
            t[i] = p.a[i];
        }
        for(int j = 0; j < n; j++){
            t[j] = a[j];
        }
        a = t;
        n = t.length;
    }
    void mult(Poly p){
        int[] t = new int[p.n + n - 1];
        for(int i =0; i < p.n; i++){
            for(int j = 0; j < n; j++){
                t[i+j] += p.a[i] * a[j];
            }
        }
        a = t;
        n = t.length;
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < n; i++){
            s += a[i] + " ";
        }
        return s;
    }
}
