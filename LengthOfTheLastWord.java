class Solution {
   public int lengthOfLastWord(String s) {
       String strings[] = s.split("\\s+");
// "\\s+" searches for whitespace and acts as delimiter
// "\\s+" whitespace regex used in java
       
       
       int length = strings.length;
       if(strings.length < 1){
           return 0;
       }
        
       
       String theLastWord = strings[length-1];
       int lengthOfTheLastWord = theLastWord.length();
       
       return lengthOfTheLastWord;
       
    }
}