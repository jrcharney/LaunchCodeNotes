/**
 * Program 3.4
 * Sieve of Eratosthenes
 * Program 3.5
 * Robust array allocation
 */
class Primes {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        //boolean[] a = new boolean[n];     // 3.4
        
        /* 3.5 */
        boolean[] a;
        try{
            a = new boolean[n];
        }
        catch(OutOfMemoryError e){
            Out.println("Out of memory");
            return;
        }
        
        
        for(int i = 2; i < n; i++){
            a[i] = true;
        }
        for(int i = 2; i < n; i++){
            if(a[i] != false){
                for(int j = i; j*i < N; j++){
                    a[i*j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(i > n - 100){
                if(a[i]){
                    Out.print(" " + i);
                }
            }
        }
        Out.println();
    }
}
