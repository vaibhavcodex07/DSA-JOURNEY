import org.jetbrains.annotations.NotNull;

public class TransposeMATRIX {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{7,4,6,8},{3,8,1,9},{9,8,7,6}};
        System.out.println("matrix");
        print(arr);
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose matrix");
        print(arr);
    }
    private static void print(@NotNull int[][] arr){
        for(int [] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
