import java.util.Scanner;

public class findMINinMAXofEACHrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        System.out.println("enter the coloumns");
        int m = sc.nextInt();
        System.out.println("enter the elements of array");
        int [][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minOfMax = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < minOfMax){
                minOfMax = max;
            }
        }
        System.out.println(minOfMax);
    }
}
