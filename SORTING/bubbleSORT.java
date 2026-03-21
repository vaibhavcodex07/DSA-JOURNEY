public class bubbleSORT {
    public static void vaibhav(int[] arr){
        for (int x:arr){
            System.out.print(" "+x);
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,8,2,4,5,11,10,13,1};
        int n = arr.length;
        vaibhav(arr);
        System.out.println();
//        iss case me kya hora tha time complxity O(n²) aari thi kyunki loop break hi ni ho ra tha sorting k baad bhi
//        for (int j = 0;j<n;j++){
//            for (int i = 0;i<n-1-j;i++){
//                if (arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
        // Bubble sort optimised
        // hum chaoye oh boolean ka case leke bhi kar sakte hai intialy hum sorted maan lenge array ko
        // or swap karenge agar sorted hua toh true ni toh false 
        int swaps  = 0;
        for (int j = 0;j<n;j++){
            for (int i = 0;i<n-1-j;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        vaibhav(arr);
    }
}
