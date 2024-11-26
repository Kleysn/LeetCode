//151. Reverse Words in a String

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
