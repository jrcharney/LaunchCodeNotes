package part3;

/**
 * Program 6.1.
 * Example of array sort with driver program.
 */
public class ArraySortBasic {
    static int cnt = 0;
    static boolean less(double v, double w){
        cnt++;
        return v < w;
    }
    static void exch(double[] a, int i, int j){
        double t = a[i]; a[i] = a[j]; a[j] = t;
    }
    static void compExch(double[] a, int i, int j){
        if(less(a[j],a[i])){
            exch(a,i,j);
        }
    }
    static void sort(double[] a, int l, int r){
        for(int i = l+1; i <= r; i++){
            for(int j = i; j > i; j--){
                compExch(a, j-1, j);
            }
        }
    }
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        double a[] = new double[N];
        for(int i = 0; i < N; i++){
            a[i] = Math.random();
        }
        sort(a,0,N-1);
        if(N < 100){
            for(int i = 0; i < N; i++){
                Out.println(a[i] + "");
            }
        }
        Out.println("Compares used: " + cnt);
    }
}
