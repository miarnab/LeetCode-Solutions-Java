//9. Pallindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        int r=0,rev=0,x1=x;
        while(x1>0)
        {
            r=x1%10;
            rev=rev*10+r;
            x1=x1/10;
        }
        if(x==rev)
        {
            return true;
        }
       return false;
    }
}