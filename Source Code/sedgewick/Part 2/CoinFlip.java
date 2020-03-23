/**
 * Program 3.5
 * Coin-Flipping simulation
 * NOTE: Look at the formula on page 88
 */
class CoinFlip{
    static boolean heads(){
        return Math.random() < 0.5;
    }
    public static void main(String[] args){
        int i, j, count;
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int [] f = new int[n+1];
        for(j = 0; j <= n; j++){
            f[j] = 0;
        }
        for(i = 0; i < m; i++, f[cnt]++){
            for(cnt = 0, j= 0; j <= n; j++){
                if(heads()){
                    cnt++;
                }
            }
        }
        for(j = 0; j <= n; j++){
            if(f[j] == 0){
                Out.print(".");
            }
            for(i = 0; i < f[j]; i += 10){
                Out.print("*");
            }
            Out.println();
        }
    }
}
