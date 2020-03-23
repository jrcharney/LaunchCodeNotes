/**
* Program 1.3.
* Weighted version of quick union (worst case).
* Property 1.3.
* The weighted quick-union algorirthm follows most $2 lg N$ links
* to determine whether two of $N$ objects are connected.
*/
public class QuickUW {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int id[] = new int[n];
        int sz[] = new int[n];
        for(int i = 0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
        for(In.init(); !In.empty(); ){
            int i, j;
            int p = In.getInt();
            int q = In.getInt();
            for(i = p; i != id[i]; i = id[i]);
            for(j = q; j != id[j]; j = id[j]);
            if(i == j) continue;
            if( sz[i] < sz[j] ){
                id[i] = j; sz[j] += sz[i];
            }else{
                id[j] = i; sz[i] += sz[j];
            }
            Out.println(" " + p + " " + q);
        }
    }
}
