/**
 * Program 3.1
 * Method defintion
 * @file LogTable.java
 */
class LogTable {
    static int lg(int n){
        int i = 0;
        while(n > 0){
            i++;
            n /= 2;
        }
        return i;
    }
    public static void main(String[] args){
        for(int n = 1000; n <= 1000000000; n *= 10)     // TODO: should n be long?
            Out.println(lg(n) + " " + n);
    }
}
