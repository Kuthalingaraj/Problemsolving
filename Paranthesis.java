import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
    public static boolean bParanthesis(String a) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        {
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(' || a.charAt(i) == '[' || a.charAt(i) == '{')
                stack.push(a.charAt(i));
            else {
                if (stack.isEmpty())
                    return false;
                if (map.get(stack.peek()) != a.charAt(i))
                    return false;
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        return false;

    }

    public static void main(String[] args) {
        int n = 6;
        Scanner par = new Scanner(System.in);
        System.out.println("Enter the paranthesis :");
        String a = par.next();
        if (bParanthesis(a))
            System.out.println("Yes");
        else {
            System.out.println("No");
        }

    }
}
