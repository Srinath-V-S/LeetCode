class Solution {
    
    // create a stack class
    
    static class Stack{
        
        int top = -1;
        char ch[] = new char[7002];
        
        
        public void push(char c){
            if(top==7001){
                
            }
            else{
                // adding character to the stack
                ch[++top] = c;
            }
        }
        
        public char pop(){
            if(top==-1){
             return '\0';   
            }
            else{
                char element  = ch[top];
                top--;
                return element;
            }
            
        }
        
        public boolean isEmpty(){
            return (top==-1)?true:false;            
        }
    }
    
    
    
    public static boolean matchingpair(char c1,char c2){
        if(c1 == '{' && c2=='}')
            return true;
        if(c1 == '(' && c2==')')
            return true;
        if(c1 == '[' && c2==']')
            return true;
        
        
        return false;
    }
    public boolean isValid(String s) {
        
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{'|| s.charAt(i) == '['||s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            }
            
            
            if(s.charAt(i) == '}'|| s.charAt(i) == ']'||s.charAt(i) == ')' ){
                
                
                if(stack.isEmpty()){
                    return false;
                }
                
                
                else if(!matchingpair(stack.pop(),s.charAt(i))){
                    return false;
                }
            }
            
            
            
        }
        
        
        if(stack.isEmpty()){
           return true; 
        }
        else{
            return false;
        }
        
    }
}