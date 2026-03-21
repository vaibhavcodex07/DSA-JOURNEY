public class SelctionsSort {
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
        for (int i = 0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i;j<n;j++){
                if (arr[j]<min){
                min = arr[j];
                mindx = j;
                }

            }
             // yaha pe kya hora hai GOAL  hai hamara index 0(1st index ) pe smallest element lana
            // pass - 1 (i=0) inner loop j = 0 to 8  --->> min find at index 8 element is 1(min = 1,idx = 8)
            // swap (7,1) to (1,7) means 1 ko index 0 pe lana or 7 ko idx 8 pe bhjena using swaping
            // [1, 8, 2, 4, 5, 11, 10, 13, 7]
            // ese hi pass 2 to 8 find karo min or 1st se swap karo
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        vaibhav(arr);
    }

}
