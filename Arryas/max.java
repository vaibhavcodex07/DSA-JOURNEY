import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("enter element ");
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println("the macimum elemnet of an array is "+ max);
        System.out.print("the second maximum element of this array is  " + smax);
        }

    }
