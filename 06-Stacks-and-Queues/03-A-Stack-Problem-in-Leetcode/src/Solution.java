import java.util.Stack;

import javax.crypto.spec.ChaCha20ParameterSpec;
import javax.swing.plaf.synth.SynthOptionPaneUI;

// ( [ {
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == '}' && topChar != '{') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == ')' && topChar != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(){}"));
        System.out.println(new Solution().isValid("([(}"));
    }

}
