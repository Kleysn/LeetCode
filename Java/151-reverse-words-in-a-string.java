//151. Reverse Words in a String

//Given an input string s, reverse the order of the words.
//Example 2:

//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
    
package leetcode;

class Solution {

    public static String removeSpaces(String input) {
        return input.trim(); 
    }

    public String reverseWords(String s) {
 
        s = removeSpaces(s);

        String[] words = s.split("\\s+"); 

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); 
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseWords("  the sky is blue  ");
        System.out.println("Resultado: \"" + result + "\""); 
    }
}
