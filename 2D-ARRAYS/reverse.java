import java.sql.SQLOutput;

public class reverse {
    public static void main(String[] args) {
        //REVERSE ROW WISE
        int [][] arr = {{1,2,3,4},{7,4,6,8},{3,8,1,9},{9,8,7,6}};
        int n = arr.length;
                int m = arr[0].length;
                for(int i = 0; i < n; i++){
                    int left = 0;
                    int right = m - 1;

                    while(left < right){
                        int temp = arr[i][left];
                        arr[i][left] = arr[i][right];
                        arr[i][right] = temp;

                        left++;
                        right--;
                    }
                }
        System.out.println("ROW WISE REVERSE");
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < m; j++){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }

                // reverse coloums wise
                 for(int j = 0; j < m; j++){
                    int top = 0;
                    int bottom = n-1;
                    while(top<bottom){
                        int temp = arr[top][j];
                        arr[top][j] = arr[bottom][j];
                        arr[bottom][j] = temp;
                        top++;
                        bottom--;

                    }
                }
        System.out.println("COLUMNS WISE REVERSE");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
            }
        }
