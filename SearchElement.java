// search elements in an unsorted or sorted array.
// use simple traversing approach 
//code:-
class Main {

    // Function to implement
    // search operation
    static int findElement(int arr[], int n, int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        // If the key is not found
        return -1;
    }
