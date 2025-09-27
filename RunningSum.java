// running sum of 1d array
// Best Approach: In-place Linear Scan
// Traverse the array once (O(n) time).
// Keep a running sum and update each element in the array (or a new array).
// No extra space needed if modifying the input is allowed; otherwise, use a new array

// 1. just modify it no extra space.
class Solution {
    public int[] runningSum(int[] nums) {
        // Start from index 1 and add the previous running sum to current element
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums; // return the modified array
    }
}

// 2. use extra space by creating new array to pit the output of running sum
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // array to store running sum
        
        result[0] = nums[0]; // first element is same
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + nums[i]; // sum up to current index
        }
        
        return result;
    }
}
