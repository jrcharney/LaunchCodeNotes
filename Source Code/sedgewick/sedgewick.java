/**
 * Program 4.14
 * Abstract class for equivalence-relations ADT
 */
interface UFable {
    int find(int x);
    boolean find(int p, int q);
    void unite(int p, int q);
}

/**
 * Program 4.11
 * Equivalence-relations ADT Interface
 * Note: For 4.11, implementations and private members are hidden.
 * Program 4.13
 * Equivalence-relations ADT Implementation
 * Note: As part of Program 4.14, the interface UFable was added.
 */
class UF implements UFable {
    /*
    // 4.11
    UF(int)
    boolean find(int,int)
    void unite(int, int)
    */
    // 4.13
    private int[] id, sz;
    UF(int n){
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }
    private int find(int x){
        while(x != id[x]){
            x = id[x];
        }
        return x;
    }
    boolean find(int p, int q){
        return (find(p) == find(q));
    }
    void unite(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i == j) return;
        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }
        else{
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}

/**
 * Program 4.12
 * Equivalence-relations ADT client
 */
class Equivalence {
    public static void main(String[] args){
        int p, q, n = Integer.parseInt(args[0]);
        UF info = new UF(n);
        for(In.init(); !In.empty(); ){
            p = In.getInt();
            q = In.getInt();
            if(!info.find(p,q)){
                info.unite(p,q);
                Out.println(p+"-"+q);
            }
        }
    }
}