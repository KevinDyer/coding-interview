package chapter1;

public class Question3 {
  public static void main(String[] args) {
    char[] input = "Mr John Smith    ".toCharArray();
    urlify(input, 13);
    String output = new String(input);
    System.out.println("\"" + output + "\"");
  }
  
  public static void urlify(char[] str, int length) {
  	int i = length - 1;
  	int tail = str.length - 1;
  	while (i >= 0) {
  		if (str[i] == ' ') {
  			str[tail--] = '0';
  			str[tail--] = '2';
  			str[tail--] = '%';
  		} else {
  			str[tail--] = str[i];
  		}
  		i--;
  	}
  }
}
