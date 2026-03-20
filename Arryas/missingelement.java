import java.util.Scanner;

public class missingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int sum = n * (n + 1) / 2;
        int arraysum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arraysum += arr[i];
        }

        System.out.println("Missing element is: " + (sum  - arraysum));
    }
}