public class StringToInt {
    public int toInt(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int n = c - '0';
            result += n * (pow(10, input.length() - i - 1));
            Math.pow(10, 2);
        }
        return result;
    }

    public int pow(int a, int b) {
        if (b == 0) {
            return a / a;
        }
        for (int i = 0; i < b - 1; i++) {
            a *= 10;
        }
        return a;
    }
}
