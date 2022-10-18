class Solution {
    public String countAndSay(int n) {
        StringBuilder ans = rucursiveFunction(new StringBuilder(""), 1, n);
        return ans.toString();
    }
    public static StringBuilder rucursiveFunction(
        StringBuilder str,
        int d,
        int n
    ) {
        if (d == n + 1) {
            return str;
        }
        if (n == 1) {
            return new StringBuilder("1");
        }
        if (d == 1) {
            return rucursiveFunction(new StringBuilder("1"), d + 1, n);
        } else {
            StringBuilder ans = new StringBuilder("");
            int c = 1;
            char ch = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    c++;
                } else {
                    ans.append(c).append(ch);
                    ch = str.charAt(i);
                    c = 1;
                }
            }
            ans.append(c).append(ch);
            return rucursiveFunction(ans, d + 1, n);
        }
    }
}