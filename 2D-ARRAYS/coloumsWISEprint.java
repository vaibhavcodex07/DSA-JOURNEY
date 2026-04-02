import java.util.Scanner;

public class coloumsWISEprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        System.out.println("enter the number of columns");
        int m = sc.nextInt();
        System.out.println("enter the elements you want to insert");
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();

    }
        }for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        }
    }

