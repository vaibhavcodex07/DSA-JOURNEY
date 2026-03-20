import javax.crypto.spec.PSource;
import java.util.Scanner;


public class wave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of elemnets you want to insert ");
        int n = sc.nextInt();
        System.out.println("enter the elements in array");
        int [] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i< arr.length;i+=2){
            if (i == arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        for (int i = 0;i< arr.length;i++)
            System.out.println(arr[i]);
    }
}