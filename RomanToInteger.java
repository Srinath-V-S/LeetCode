class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        if(s.equals("IV")){
            return 4;
        }
        if(s.equals("IX")){
            return 9;
        }
        if(s.equals("XL")){
            return 40;
        }
        if(s.equals("XC")){
            return 90;
        }if(s.equals("CD")){
            return 400;
        }
        if(s.equals("CM")){
            return 900;
        }



        System.out.println(s.length());

        int integerVal = 0;
        int temp = 0;

        for(int i=0;i<s.length();i++){
            if(i==(s.length()-1)){
                integerVal = integerVal+map.get(s.charAt(i));
                break;
            }
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                integerVal = integerVal + map.get(s.charAt(i));
            }
            else{
                temp = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                integerVal = integerVal + temp;
                temp = 0;
                i = i + 1;
            }


        }
        return integerVal;
    }
}