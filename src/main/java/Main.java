
public class Main {

    public static void main(String args[]) {
        StringToInt stringToInt = new StringToInt();
        System.out.println(stringToInt.toInt("1234567"));
        System.out.println(stringToInt.toInt("1234567890"));

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("\\u005CuDC00\\u005CuD800"));
        System.out.println(reverseString.reverse2("안녕하세요"));
        System.out.println(reverseString.reverse3("123"));
    }


}
