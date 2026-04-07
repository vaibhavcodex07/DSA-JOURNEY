import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();
        for( int i = 1;i<=rows;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((char)(j+64)); // A AB ABC ABCD ..........
             //   System.out.println((char)(i+64)); // A BB CCC DDDD

            }
            System.out.println();
        }
    }
}
