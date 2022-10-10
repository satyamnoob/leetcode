/*
 1328. Break a Palindrome
 Given a palindromic string of lowercase English letters palindrome, 
 replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome 
 and that it is the lexicographically smallest one possible.

 Return the resulting string. If there is no way to replace a character to make it not a palindrome,
 return an empty string.
*/

class breakAPalindromeOctober10 {

  public static void main(String[] args) {
    String str = "aabaa";
    System.out.println(breakPalindrome(str));
  }

  public static String breakPalindrome(String palindrome) {
    char[] arr = palindrome.toCharArray();

    for (int i = 0; i < arr.length / 2; i++) {
        if(arr[i] != 'a') {
            arr[i] = 'a';
            return String.valueOf(arr);
        }
    }
    arr[arr.length - 1] = 'b';
    return String.valueOf(arr);
  }
}
