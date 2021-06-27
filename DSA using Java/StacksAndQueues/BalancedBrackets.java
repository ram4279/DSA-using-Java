
import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        var stk = new Stack<Character>();
        boolean answer = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                stk.push(ch);
            } else if (ch == ']' || ch == ')' || ch == '}') {
                // while (!stk.isEmpty() && (stk.peek() != '[' && stk.peek() != '(' && stk.peek() != '{'))
                if(!stk.isEmpty() && parasMathes(stk.peek(), ch)) {
                    stk.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }

        System.out.println(stk);
        if (!stk.isEmpty())
            System.out.println(false);
        else
            System.out.println(answer);
    }

    public static boolean parasMathes(char open, char close) {
        if (open == '(' && close == ')')
            return true;
        if (open == '[' && close == ']')
            return true;
        if (open == '{' && close == '}')
            return true;
        return false;
    }

}