/**
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */

public class NumberOfLaserBeamsInBank2125 {

  public int numberOfBeams(String[] bank) {
    int n = bank.length;
    int sd = 0;
    int beams = 0;
    if (n == 0) {
      return 0;
    }
    sd = countSequrityDevices(bank[0]);
    for (int i = 1; i < n; i++) {
      int tempSd = countSequrityDevices(bank[i]);
      if (tempSd == 0) continue;
      beams += sd * tempSd;
      sd = tempSd;
    }

    return beams;
  }

  int countSequrityDevices(String floor) {
    int count = 0;
    for (int i = 0; i < floor.length(); i++) {
      char ch = floor.charAt(i);
      if (ch == '1') {
        count++;
      }
    }

    return count;
  }
}
