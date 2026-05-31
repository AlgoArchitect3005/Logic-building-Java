public class StringToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "   -42cba";
        int result = solution.myAtoi(s);
        System.out.println(result); // Output: -42
    }
}

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;
        int n = s.length();

        // spaces skip
        while (i < n && s.charAt(i) == ' ') {
                i++;
        }

        // sign check
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
        sign = (s.charAt(i) == '+') ? 1 : -1;
                i++;
            }

            // digits read
             while(i < n && Character.isDigit(s.charAt(i))){
                int digit = Character.getNumericValue(s.charAt(i));
                // check for overflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                
                else{
                    result = result * 10 + digit;
                    i++;
                }
             }
            
        
        // return sign * result
        return sign * result;
    }
}