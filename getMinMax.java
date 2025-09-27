// 2. finding maximum and minimum element in an array.
// use linear scan 
// racverse and track the min and max while iterating
// time complexity - O(n)  , space complexity - O(1) .

// 1. use  ArrayList format.
class Solution {
    public ArrayList<Integer> getMinMax(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result; // return empty list if array is empty
        }

        int min = nums[0];
        int max = nums[0];

        // Linear scan to find min and max
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
              max = nums[i];  
            }
            if (nums[i] < min){
              min = nums[i];
            }
        }

        result.add(min);
        result.add(max);

        return result;
    }
}


