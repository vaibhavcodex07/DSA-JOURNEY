public class reversearray {
    public static void main(String[] args) {
        //  EK TO YE HAI TRADITIONOL METHOD
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.print(" "+arr[i]);
//        }
        // EK YE HAI SWAP METHOD DONO BHUT EASY HAI PAR SWAP ME CONCEPT K FEEL KO SAMJHNA KAFI HELPFUL HOGA AAGE K LIYE
        int [] arr = {9,4, 2, 6, 8, 7,1,0};
        int n = arr.length;
        int i= 0;
        int j= n-1;
        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        for (int ele : arr)
            System.out.print(" "+ele);

 }
}
