// Count Elements With Maximum Frequency
// You are given an array nums consisting of positive integers.
// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
// The frequency of an element is the number of occurrences of that element in the array.

// ex : - Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.

// code :-
// used hashmap to put the digits and their no of times occurance in a map then calculate the max frequency.
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
 java.util.List<Map.Entry<Integer, Integer>> entries = new java.util.ArrayList<>(freq.entrySet());
 for (int i = 0; i < entries.size(); i++) {
            int val = entries.get(i).getValue();
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}
