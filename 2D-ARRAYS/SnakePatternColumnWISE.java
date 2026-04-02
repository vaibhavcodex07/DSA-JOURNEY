public class SnakePatternColumnWISE {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{7,4,6,8},{3,8,1,9},{9,8,7,6}};
                int n = arr.length;
                int m = arr[0].length;

                for(int j = 0; j < m; j++){
                    if(j % 2 == 0){
                        for(int i = 0; i < n; i++){
                            System.out.print(arr[i][j] + " ");
                        }
                    } else {
                        // bottom to top
                        for(int i = n - 1; i >= 0; i--){
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }


