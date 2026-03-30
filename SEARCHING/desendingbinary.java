public class desendingbinary {
    public static void main(String[] args) {
        int[] arr = {100,91,87,66,52,43,35,30,29,13,5};

        int lo = 0;
        int hi = arr.length - 1;
        int target = 52;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index :-"+mid);
                break;
            }
            else if (arr[mid] > target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
            
        }
    }
}