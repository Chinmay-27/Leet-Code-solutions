

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> charSet = new HashSet<>();
        
        while (end < s.length()) {
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }
        
        return maxLength;
    }
}
