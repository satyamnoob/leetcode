/***
 * https://leetcode.com/problems/assign-cookies
 */

import java.util.Arrays;

public class AssignCookies455 {

  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int c = 0;
    int i = g.length - 1, j = s.length - 1;

    while (i >= 0 && j >= 0) {
      if (s[j] >= g[i]) {
        c++;
        i--;
        j--;
      } else if (s[j] < g[i]) {
        i--;
      } else {
        j--;
      }
    }

    return c;
  }
}
