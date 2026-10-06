class Solution {
    public boolean isPalindrome(int x) {
        int y=x,z=x; double c=0,p=0;
        while(x>0){
        x=x/10;
        c++;
        
        }
        while (y>0){
            double d=y%10;
            y=y/10;
            p=p+d*(Math.pow(10,(c-1)));
            c--;
        }
        if (z==p)
        return true;
        else
        return false;

    }
}