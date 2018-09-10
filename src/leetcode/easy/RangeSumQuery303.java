package leetcode.easy;

/**
 * 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 *
 *  Given an integer array nums, find the sum of the elements between indices i and j (i ¡Â j), inclusive.

    Example:
        Given nums = [-2, 0, 3, -5, 2, -1]
        
        sumRange(0, 2) -> 1
        sumRange(2, 5) -> -1
        sumRange(0, 5) -> -3
        
    Note:
        You may assume that the array does not change.
        There are many calls to sumRange function.
 */
public final class RangeSumQuery303 {

    private int[] nums = null;

    public RangeSumQuery303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;

        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */