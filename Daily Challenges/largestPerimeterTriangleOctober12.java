/*
 * 976. Largest Perimeter Triangle
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. 
 * If it is impossible to form any triangle of a non-zero area, return 0.
*/

import java.util.Arrays;

class largestPerimeterTriangleOctober12 {
    // b+c > a
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int perimeter = 0;
        for(int i = n - 1; i >= 2; i--) {
            perimeter = findPerimeter(nums[i], nums[i - 1], nums[i - 2]);
            if(perimeter != 0) {
                break;
            }
        }
        return perimeter;
    }

    public int findPerimeter(int a, int b, int c) {
        if(b + c > a) return a + b + c;
        else return 0;
    }
}