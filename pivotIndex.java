public class pivotIndex {

  public static void main(String[] args) {
    int[] arr = { -1, -1, -1, 1, 1, 1 };
    System.out.println(findPivotIndex(arr));
  }

  public static int findPivotIndex(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    for (int i : nums) rightSum += i;
    rightSum -= nums[0];
    System.out.println("left sum = " + leftSum + " right sum = " + rightSum);
    if (leftSum == rightSum) return 0; else {
      for (int i = 0; i < nums.length; i++) {
        leftSum += nums[i];
        if (i + 1 < nums.length) {
          rightSum -= nums[i + 1];
          System.out.println("left sum = " + leftSum + " right sum = " + rightSum);
        } else {
          rightSum = 0;
        }
        if (leftSum == rightSum) {
          System.out.println("left sum = " + leftSum + " right sum = " + rightSum);
          return (i < nums.length - 1) ? i + 1 : -1;
        }
      }
    }
    return -1;
  }
}
