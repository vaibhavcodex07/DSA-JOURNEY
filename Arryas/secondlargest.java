public class secondlargest{
    public static void main(String[] args) {
        int arr [] = {5,10,8,11};
        int largest = -100;
        int secondlargest = -1000;
        for(int i = 0 ; i< arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }

        }
//        for(int i = 0;i< arr.length;i++){
//            if(secondlargest<arr[i] && largest!=arr[i]){
//                secondlargest = arr[i];
//            }
//        }
        System.out.println(largest);
    }
}


