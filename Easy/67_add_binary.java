class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder s = new StringBuilder();
        int sum=0;
        while(i>=0||j>=0)
        {
            sum = sum/2;
            if(i>=0)
            {
                sum = sum + a.charAt(i) - '0';
            }
            if(j>=0)
            {
                sum = sum + b.charAt(j) - '0';
            }
            s.append(sum%2);
            i--;
            j--;
        }
        if(sum/2 != 0)
        {
            s.append(1);
        }
        return s.reverse().toString();
    }
}