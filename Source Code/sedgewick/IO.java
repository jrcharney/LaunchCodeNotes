/**
 * @file IO.java
 * @desc Input and Output for Algorithms in Java
 * Note: Make this file first!
 */
import java.io.*;

/**
 * @class In
 * @desc Input for Algorithms in Java
 */
public class In {
    private static int c;
    /**
     * @func blank
     * @desc is this character a whitespace? 
     * @return {boolean}
     */
    private static boolean blank(){
        return Character.isWhitespace((char) c);
    }
    /**
     * @func readC
     * @desc read a character
     * @throws {IOException} e
     */
    private static void readC(){
        try{
            c = System.in.read();
        }
        catch(IOException e){
            c = -1;
        }
    }
    /**
     * @func init
     * @alias readC
     */
    public static void init(){readC();}
    /**
     * @func empty
     * @desc Is this character empty?
     * @return
     */
    public static boolean empty(){return c == -1;}
    /**
     * @func getString
     * @desc Input a string
     * @return {String} s
     */
    public static String getString(){
        String s = "";
        while(!(empty() || blank())){
            s += (char) c;
            readC();
        }
        while(!empty() && blank()){readC();}
        return s;
    }
    /**
     * @func getInt
     * @desc Input an integer
     * @return {Integer} n
     */
    public static int getInt(){
        return Integer.parseInt(getString());
    }
    /**
     * @func getDouble
     * @desc Input a double
     * @return {Double} d
     */
    public static double getDouble(){
        return Double.parseDouble(getString());
    }
}

/**
 * @class Out
 * @desc Output for Algorithms in Java
 */
public class Out {
    /**
     * @func print
     * @desc print for Algorithms in Java
     * @param {String} s
     */
    public static void print(String s){
        System.out.print(s);
    }
    /**
     * @func println
     * @desc println for Algorithms in Java
     * @param {String} s
     */
    public static void println(String s){
        System.out.println(s);
    }
}