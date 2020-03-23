/**
 * Program 4.6
 * Infix-to-postfix conversion
 */
class InfixToPostfix {
    public static void main(String[] args){
        char[] a = args[0].toCharArray();
        int n = a.length;
        charStack s = new charStack(n);
        for(int i = 0; i < n; i++){
            if(a[i] == ')')
                Out.print(s.pop() + " ");
            if((a[i] == '+') || (a[i] == '-') || (a[i] == '*'))   // TODO: Add more operators
                s.push(a[i]);
            if((a[i] >= '0') && (a[i] <= '9'))
                Out.print(a[i] + " ");
        }
        Out.println("");
    }
}
