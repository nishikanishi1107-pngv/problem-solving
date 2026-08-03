class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if(n==0)
            return a;
        else if(n==1)
            return b;
        for(int i = 2;i<=n;i++){
            int m = a+b;
            a=b;
            b = m;
        }
        return b;
    }
}
