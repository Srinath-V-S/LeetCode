class Solution {
    public static String LCP(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int i,j;
        String res = "";
        for(i=0,j=0;i<l1 && j<l2;i++,j++){
            if(s1.charAt(i)!= s2.charAt(j)){
                break;
            }
            res = res + s1.charAt(i);
        }
        
        return res;
        
        
    }
    
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len<1){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<len;i++){
            prefix = LCP(prefix,strs[i]);
        }    
        
        return prefix;
    }
}