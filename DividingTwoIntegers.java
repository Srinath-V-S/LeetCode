class Solution {
    public int divide(int dividend, int divisor) {
    
    if(divisor == -1 && dividend == Integer.MIN_VALUE){
        return Integer.MAX_VALUE;
    } 
    
     int quotient = dividend/divisor;
        System.out.println(quotient);
        
 
        
    if(quotient < Integer.MIN_VALUE)
        return Integer.MAX_VALUE;
    if(quotient > Integer.MAX_VALUE)
        return Integer.MIN_VALUE;
            return quotient;

    }
    
}
