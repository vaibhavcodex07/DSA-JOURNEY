public class SnakePattern {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{7,4,6,8},{3,8,1,9},{9,8,7,6}};
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                for(int j = 0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else if(i%2!=0){
                for(int j = arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
                }
              }
           }
        }

