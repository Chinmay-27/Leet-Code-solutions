import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // Initialize a stack to store open brackets
        
        // Define a mapping of open and close brackets
        // Using a HashMap or a switch-case statement can also be an option
        char[] bracketMapping = {')', '}', ']'};
        
        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // If the character is an open bracket, push it onto the stack
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // If the character is a closing bracket
                if (stack.isEmpty()) {
                    return false;  // No corresponding open bracket found
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;  // Mismatched brackets
                }
            }
        }
        
        // After processing all characters, the stack should be empty for a valid string
        return stack.isEmpty();
    }
}
