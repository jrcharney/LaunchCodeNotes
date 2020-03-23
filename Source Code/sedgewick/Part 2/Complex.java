/**
 * Program 4.20
 * ADT interface for complex numbers
 * This is likely used in RootsOfUnity.java
 * @see RootsOfUnity.java
 * Note: For program 4.20, implementations and private members are hidden
 * Program 4.21
 * ADT implementation for complex number
 */
class Complex implements Cloneable {
    /*
    // 4.20
    Complex(double re, double im);
    double re();
    double im();
    Complex mult(Complex rhs);
    public Object clone();
    public String toString();
    */
    // 4.21
    private double re, im;
    // 4.21
    Complex(double re, double im){
        this.re = re;
        this.im = im;
    };
    // 4.21
    double re(){return re;};
    // 4.21
    double im(){return im;};
    // 4.21
    void add(Complex rhs){
        re = re() + rhs.re();
        im = im() + rhs.im();
    };
    // 4.21
    void mult(Complex rhs){
        double t = re();
        re = re() * rhs.re() - im() * rhs.im();
        im = t * rhs.im() + im() * rhs.re();
    };
    // 4.21
    public String toString(){
        return re() + " " + im();
    };
}