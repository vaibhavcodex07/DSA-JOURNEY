import java.util.Scanner;

public class inputIN2Darryas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        System.out.println("enter the number of columns ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];

         }
            System.out.println();
    }
          for (int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){

         }
         System.out.println();
     }
        System.out.print(sum+" ");
   }
}
