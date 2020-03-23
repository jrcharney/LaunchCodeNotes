/**
Program 1.1
Quick-find (slow union) solution to connectivity problem.
Property 1.1
The quick-find algorirthm executes at least $M N$ instructions
to solve a connectivity problem with $N$ objects that involves
$M$ union operations
*/
public class QuickFind {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int id[] = new int[n];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
        for( In.init(); !In.empty(); ){
            int p = In.getInt(), q = In.getInt();
            int t = id[p];
            if( t == id[q] ) 
                continue;
            for(int i = 0; i < n; i++){
                if(id[i] == t)
                    id[i] = id[q];
            }
            Out.println(" " + p + " " + q);
        }
    }
}