/**
 * Program 4.22
 * Queue client program (queue simulator)
 * @see Queue.java
 */
//import * from "../../IO.java"

public class SimulateQueues{
    private static int m = 4;
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        intQueue[] q = new intQueue[m]; // Unless [m] should be (m)
        for(int i = 0; i < m; i++){
            q[i] = new intQueue(n);
        }
        for(int i = 0; i < n; i++){
            int in  = (int) (Math.random() * m);
            int out = (int) (Math.random() * m);
            q[in].put(i);
            if(!q[out].empty()){
                q[out].get();
            } 
            if(i < n - 5)
                continue;
            Out.print(in + " in ");
            Out.println(out + " out ");
            for(int k = 0; k < m; k++){
                intQueue t;
                t = (intQueue) q[k].clone();
                Out.print(k + ": ");
                while(!t.empty())
                    Out.print(t.get() + " ");
                Out.println("");
            }
        }
    }
}