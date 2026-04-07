import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();
        for( int i = 1;i<=rows;i++){
            for ( int j = 1;j<=rows;j++ ){
                System.out.print((char)(j+96 )+" ");
            }
            System.out.println();
        }
    }
}
