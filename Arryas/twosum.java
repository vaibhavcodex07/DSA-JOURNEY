import java.util.Scanner;

public class twosum {

    static class vaibhav {

        public int[] sum(int[] arr , int target) {

            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = i + 1; j < arr.length; j++) {

                    if(arr[i] + arr[j] == target) {
                        int a[] = {i, j};
                        return a;
                    }

                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element you want to insert ");

          int n = sc.nextInt();
          int arr[] = new int[n];


          for(int i = 0;i<n;i++){
              arr[i] = sc.nextInt();
          }
          for(int i = 0;i<n;i++){
              System.out.print(" " +arr[i]);
          }
        System.out.println("\nenter target value ");
        int target = sc.nextInt();
        vaibhav obj = new vaibhav();

        int result[] = obj.sum(arr, target);

        System.out.println(result[0] + " " + result[1]);

    }
}