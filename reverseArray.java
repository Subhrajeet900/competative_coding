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

// time complexity = O(n)  and space complexity = O(1)
