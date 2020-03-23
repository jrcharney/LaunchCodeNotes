/**
* Program 1.2
* Quick-union (not-too-quick find) solution to connectivity problem 
* Property 1.2
* For $M > N$, the quick-union algorirthm could take more than $MN/2$
* instructions to solve a connectivity problem with $M$ pairs of $N$ objects.
*/
public class QuickUnion {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int id[] = new int[n];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
        for( In.init(); !In.empty(); ){
            int i, j;
            int p = In.getInt(), q = In.getInt();
            for(i = p; i != id[i]; i = id[i]);
            for(j = q; j != id[j]; j = id[j]);
            if(i == j) continue;
            id[i] = j;
            Out.println(" " + p + " " + q);
        }
    }
}