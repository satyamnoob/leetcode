/*
 * 12. Integer to Roman
*/

import java.util.HashMap;

class integerToRomanOctober20 {
  public String intToRoman(int num) {
    HashMap<Integer, String> roman = new HashMap<>();
    roman.put(1, "I");
    roman.put(2, "II");
    roman.put(3, "III");
    roman.put(4, "IV");
    roman.put(5, "V");
    roman.put(6, "VI");
    roman.put(7, "VII");
    roman.put(8, "VIII");
    roman.put(9, "IX");
    roman.put(10, "X");
    roman.put(40, "XL");
    roman.put(50, "L");
    roman.put(90, "XC");
    roman.put(100, "C");
    roman.put(400, "CD");
    roman.put(500, "D");
    roman.put(900, "CM");
    roman.put(1000, "M");
    StringBuilder str = new StringBuilder(String.valueOf(num));
    StringBuilder ans = new StringBuilder("");
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int n =
        (ch - '0') *
        (int) Math.pow(10, str.substring(i, str.length()).length() - 1);
      System.out.println(n);
      if (n == 0) {
        continue;
      } else if (n >= 1 && n <= 9) {
        ans.append(roman.get(n));
      } else if (n >= 10 && n < 40) {
        if (n == 10) ans.append(roman.get(n)); else {
          ans.append("X".repeat((n) / 10));
        }
      } else if (n == 40) {
        ans.append(roman.get(n));
      } else if (n >= 50 && n < 90) {
        if (n == 50) {
          ans.append(roman.get(n));
        } else {
          ans.append('L').append("X".repeat((n - 50) / 10));
        }
      } else if (n == 90) {
        ans.append(roman.get(n));
      } else if (n >= 100 && n < 400) {
        if (n == 100) {
          ans.append(roman.get(n));
        } else {
          ans.append("C".repeat(n == 200 ? 2 : 3));
        }
      } else if (n == 400) {
        ans.append(roman.get(n));
      } else if (n >= 500 && n < 900) {
        if (n == 500) {
          ans.append('D');
        } else {
          ans
            .append('D')
            .append(
              "C".repeat((n - 500) == 100 ? 1 : (n - 500) == 200 ? 2 : 3)
            );
        }
      } else if (n == 900) {
        ans.append(roman.get(n));
      } else {
        if (n == 1000) {
          ans.append(roman.get(n));
        } else {
          int c = n / 1000;
          ans.append("M".repeat(c));
        }
      }
    }
    // System.out.println(ans);
    return String.valueOf(ans);
  }
}
