import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] v) {
        // Create a StringBuilder to store the longest common prefix
        StringBuilder ans = new StringBuilder();

        // Sort the input array of strings lexicographically
        Arrays.sort(v);

        // Get the first and last strings after sorting
        String first = v[0];
        String last = v[v.length - 1];

        // Iterate through the characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // If the characters at the current position are not equal, return the current common prefix
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            // Append the current character to the common prefix
            ans.append(first.charAt(i));
        }

        // Return the final common prefix as a string
        return ans.toString();
    }
}
