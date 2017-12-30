package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Check Permutations: Given two strings, determine if one is a permutation of
 * the other.
 */
public class Question2 {
  public static void main(String[] args) {
    String[] words = {"abcde", "olleh", "hello", "apple", "apppl"};
    for (int i = 0; i < words.length; i++) {
      String word1 = words[i];
      for (int j = i + 1; j < words.length; j++) {
        String word2 = words[j];
        System.out.println(word1 + "~" + word2 + ": " + checkPermutation(word1, word2));
      }
    }
  }

  public static boolean checkPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    Map<Character, Integer> charCounter = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      Character c1 = Character.valueOf(s1.charAt(i));
      if (charCounter.containsKey(c1)) {
        charCounter.put(c1, charCounter.get(c1) + 1);
      } else {
        charCounter.put(c1, 1);
      }
      Character c2 = Character.valueOf(s2.charAt(i));
      if (charCounter.containsKey(c2)) {
        charCounter.put(c2, charCounter.get(c2) - 1);
      } else {
        charCounter.put(c2, -1);
      }
    }
    for (Integer count : charCounter.values()) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}