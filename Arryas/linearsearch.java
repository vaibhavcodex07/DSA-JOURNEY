import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array you want to insert ");
        int n = sc.nextInt();
        System.out.println("enter the elments of array");
        int arr[] = new int[n];


        boolean flag = false; // means target element me nahi hai
        System.out.println("enter the target element");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                flag = true; // target element me  hai
                break;
            }

        }

        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        if(flag = true) System.out.println("the elemet is exist in the array");
        else System.out.println("the element is not exist in the array");
    }
}