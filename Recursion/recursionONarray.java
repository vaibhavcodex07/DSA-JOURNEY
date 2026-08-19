import java.util.Scanner;

public class recursionONarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {7,2,5,3,9,4,10};
        // Index 0 se print karna shuru karenge
        System.out.print("search the target element give any number : ");
        int ele = sc.nextInt();
        System.out.println(exists(arr,ele,0));
        print(arr , 0);
    }
    public static boolean exists(int [] arr , int ele  , int index ){
        if(index == arr.length) return false;
        if(arr[index] == ele) return true;
         return exists(arr , ele , index +1);
    }


    public static void print(int brr[] ,  int index){
        if(index == brr.length) return;
        // 1. Current element ko print karo
      //  System.out.print(" "+brr[index]);
        // 2. Agle index ke liye recursive call karo
        print(brr,index+1);
        // for Reverse
        System.out.print(brr[index]+" ");
    }
}
