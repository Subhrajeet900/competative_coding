// 1. Using Two-Pointer / Swapping (In-place)
// Start from the first (left = 0) and last index (right = n-1).
// Swap elements at left and right.
// Move left++ and right-- until they cross.
// Efficient: O(n) time, O(1) extra space.
    
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left = 0, right = arr.length-1;
        
        // swapping
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}


