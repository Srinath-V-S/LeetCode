class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex+1;
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> lis = new ArrayList<>();

        if(rowIndex == 0){
            lis.add(1);
            return lis;
        }
        ArrayList<Integer> previous = new ArrayList<>();
        previous.add(1);
        // add 1 at the first row which is same for every pascal triangle
        list.add(previous);
        
        for(int i=2;i<=numRows;i++){
         // create another list for rows 2 to rows numOfRows given
            ArrayList<Integer> current = new ArrayList<>();
            // one need to calculate middle element only after 2nd row
            // since first and last elemeent are one, add 1 before and after the for loop which is used for calculating middle elements
            // middle element =  sum of two numbers directly above the current number
            current.add(1); //  first value of a row
            
            for(int j=0;j<previous.size()-1;j++){
                current.add(previous.get(j)+ previous.get(j+1)); // middle values of a row
            }
            
            current.add(1); // last value of a row
            
            list.add(current); // add the newly found row to main list
            previous = current; // update the previous value 
        
        }
        
        for (int i = 0; i < list.size(); i++)
        {
             for (int j = 0; j < list.get(i).size(); j++)
                 {
                 if(i == rowIndex){
                  return list.get(i);   
                 }
    } 

        
//         System.out.println(lis.add(list.get(rowIndex)));

        
//         return lis;
    }
        
                return lis;

}
}