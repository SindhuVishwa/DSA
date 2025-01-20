#https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();


        for(char c : s.toCharArray()) {

            if(c == ('(') || c == ('{') || c == ('[')) {
                stack.push(c); 
            }
            else if(stack.isEmpty() || !match(stack.pop(),c)) {
                return false; 
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }


    return true; 
    }

    public boolean match(char left, char right) {
        if( (left == ('(') && right == (')')) ||
        (left == ('{') && right == ('}')) ||
        (left == ('[') && right == (']')) ) {
            return true;
        }

    return false; 
    }
}
