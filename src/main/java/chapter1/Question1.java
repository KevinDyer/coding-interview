package chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
        }
    }

    public static boolean isUniqueChars(String str) {
        if (128 < str.length()) {
          return false;
        }
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = Character.valueOf(str.charAt(i));
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static boolean isUniqueChars2(String str) {
      return true;
    }
}