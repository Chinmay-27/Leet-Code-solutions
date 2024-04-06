class Solution {
    public int romanToInt(String s) {
        // Create a dictionary to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentRoman = s.charAt(i);
            
            // Check if the current Roman numeral is smaller than the next one
            if (i < s.length() - 1 && romanValues.get(currentRoman) < romanValues.get(s.charAt(i + 1))) {
                result -= romanValues.get(currentRoman);
            } else {
                result += romanValues.get(currentRoman);
            }
        }

        return result;
    }
}