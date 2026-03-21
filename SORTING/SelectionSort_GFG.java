// Problem: Selection Sort (GFG)
// Approach: Find minimum element and place it at correct position
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            // Find minimum element
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
    }
}
