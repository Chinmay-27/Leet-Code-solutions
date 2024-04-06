class Solution {
    public String reverseWords(String s) {
        // Split the input sentence into words using space as the delimiter
        String[] words = s.split(" ");
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Reverse the characters in the word
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            
            // Append the reversed word to the result, followed by a space
            result.append(reversedWord).append(" ");
        }
        
        // Remove the trailing space and convert the StringBuilder to a String
        return result.toString().trim();
    }
}
