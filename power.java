class Solution {
    
    public double myPow(double x, int n) {
        
        if(n==0) return 1;
        
        if(n<0)
            return (double)(1/powerFinder(x,n));
        
        return powerFinder(x,n);
        
    }
    
    
    static double powerFinder(double x,int n)
    {
        if(n==0) return 1;
        double ans=powerFinder(x,n/2);
        ans*=ans;
        if(n%2!=0) ans*=x;
        return ans;
    }
}
