public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If the stack is empty or the top of the stack does not match the current closing bracket, return false.
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        
        // If the stack is empty, all brackets were matched correctly.
        return stack.isEmpty();
    }
}
