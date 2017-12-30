package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation is a rearrangement of the
 * letters. The palindrome does not need to be limited to just dictionary
 * words.
 */
public class Question4 {
  public static void main(String[] args) {
    String[] words = {"", "aba", "abca", "abba", "aabbaa", "Tact Coa"};
    for (String word : words) {
      System.out.println("'" + word + "': " + palindromePermutation(word));
    }
  }

  public static boolean palindromePermutation(String str) {
    Map<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      Character c = Character.toLowerCase(Character.valueOf(str.charAt(i)));
      if (c == ' ') {
        continue;
      }
      int count = 1;
      if (counts.containsKey(c)) {
        count += counts.get(c);
      }
      counts.put(c, count);
    }
    boolean hasOdd = false;
    for (Integer count : counts.values()) {
      boolean isOdd = (1 == count % 2);
      if (isOdd) {
        if (hasOdd) {
          return false;
        } else {
          hasOdd = true;
        }
      }
    }
    return true;
  }
}