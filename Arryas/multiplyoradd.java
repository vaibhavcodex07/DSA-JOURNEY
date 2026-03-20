import java.util.Scanner;

public class multiplyoradd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array you want to insert ");
        int n = sc.nextInt();
       System.out.println("enter the elments of array");
         int arr[] = new int[n];

         for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i%2!=0){
                arr[i]*=2;
            } else if (i%2==0) {
                arr[i]+=10;

            }
         }
         for(int i=0;i<n;i++){
             System.out.print(" "+arr[i]);
         }
    }
}
