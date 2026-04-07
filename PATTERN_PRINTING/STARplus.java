import java.util.Scanner;

public class STARplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();

         for( int i = 1;i<=rows;i++){
             int mid = rows/2 + 1;
             for( int j = 1;j<=rows;j++){
                 if(i == mid || j == mid){
                     System.out.print("* ");
                 }
                 else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
    }
}
