import java.util.Scanner;

public class findMAXIMUMrowSUM {
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
   }
          int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int sum = 0;  // 🔥 reset for each row
           for(int j = 0; j < m; j++){
                  sum += arr[i][j];
                    }
                    if(sum > max){
                        max = sum;
                    }
                }
                System.out.println(max);
            }
        }
