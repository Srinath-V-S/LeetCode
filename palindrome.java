class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int sum = 0;
        int rem;
        while(n!=0){
            rem = n%10;
            sum = sum * 10 + rem;
            n = n/10;
        }
        
        if((x == sum) && (x>=0)){
               return true;
        }
        return false;
    }
}