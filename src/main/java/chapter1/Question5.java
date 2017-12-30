package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * One Away: There are three types of edits that can be performed on a string;
 * insert a character, remove a character, or replace a character. Given two
 * strings, write a function to check if they are one edit (or zero edits)
 * away.
 */
public class Question5 {
  public static void main(String[] args) {
    String[][] pairs = {
      {"pale", "ple"},
      {"pales", "pale"},
      {"pale", "bale"},
      {"pale", "bake"},
    };
    for (String[] pair : pairs) {
      System.out.println(pair[0] + " -> " + pair[1] + ": " + oneAway(pair[0], pair[1]));
    }
  }

  public static boolean oneAway(String original, String current) {
    if (Math.abs(original.length() - current.length()) > 1) {
      return false;
    }
    boolean hasEdit = false;
    int originalIndex = 0;
    int currentIndex = 0;
    while (originalIndex < original.length() && currentIndex < current.length()) {
      if (original.charAt(originalIndex) == current.charAt(currentIndex)) {
        originalIndex++;
        currentIndex++;
        continue;
      }
      if (hasEdit) {
        return false;
      }
      hasEdit = true;
      if (original.length() < current.length()) {
        currentIndex++;
      } else if (original.length() > current.length()) {
        originalIndex++;
      } else {
        originalIndex++;
        currentIndex++;
      }
    }
    return true;
  }
}