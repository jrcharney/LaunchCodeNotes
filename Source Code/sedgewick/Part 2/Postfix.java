/**
 * Program 4.5
 * Postfix-expression evaluation
 */
class Postfix {
    public static void main(String[] args){
        char[] a = args[0].toCharArray();
        int n = a.length;
        intStack s = new intStack(n);
        for(int i = 0; i < n; i++){
            if(a[i] == '+')
                s.push(s.pop() + s.pop());
            if(a[i] == '-')
                s.push(s.pop() - s.pop());
            if(a[i] == '*')
                s.push(s.pop() * s.pop());
            // TODO: Add more operators
            if((a[i] >= '0') && (a[i] <= '9'))
                s.push(0);
            while((a[i] >= '0') && (a[i] <= '9'))
                s.push(10*s.pop() + (a[i++]-'0'));
        }
        Out.println(s.pop() + "");
    }
}
