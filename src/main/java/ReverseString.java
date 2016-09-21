import java.util.Stack;

public class ReverseString {

    public String reverse(String target) {
        String result = "";
        for (int i = target.length() - 1; i >= 0; i--) {
            result += target.charAt(i);
        }
        return result;
    }

    public String reverse2(String target) {
        String result = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < target.length(); i++) {
            stack.add(String.valueOf(target.charAt(i)));
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result += stack.pop();
        }
        return result;
    }

    public String reverse3(String target) {
        StringBuffer sb = new StringBuffer(target);
        StringBuilder stringBuilder = new StringBuilder(target);
        stringBuilder.reverse().toString();
        return sb.reverse().toString();
    }
}
