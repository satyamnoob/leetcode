/**
 * ConvertArrayTo2DArray2610
 * Link - https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 */

import java.util.*;

public class ConvertArrayTo2DArray2610 {

  public List<List<Integer>> findMatrix(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();
    List<List<Integer>> matrix = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int num = entry.getKey();
      int freq = entry.getValue();

      for (int i = 0; i < freq; i++) {
        if (matrix.size() < i + 1) {
          matrix.add(new ArrayList<Integer>());
        }
        matrix.get(i).add(num);
      }
    }

    return matrix;
  }
}
