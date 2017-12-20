package quiz;

import java.util.ArrayList;

public class ReverseString {
    public String reverse(String input) {
        //return new StringBuffer(input).reverse().toString();
        if (input.equals(""))
            return "";
        else {
            ArrayList<Character> chars = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                chars.add(0, input.charAt(i));
            }
            StringBuilder builder = new StringBuilder(chars.size());
            for (Character c : chars) {
                builder.append(c);
            }
            return builder.toString();
        }
    }
}