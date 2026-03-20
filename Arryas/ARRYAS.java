import java.util.Scanner;
public class ARRYAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" sabse pehle array ka size de haramkhor");
        int n = sc.nextInt();
        int   [] arr= new int[n];
        // array ko ese print karte hai beshram aadmi
//        int n = arr.length;
//        System.out.println("ye array ki length hai "+n);
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        // imput
               int sum = Integer.MIN_VALUE;
        System.out.println("ab de arays ke element  ");

        for(int i = 0;i< arr.length;i++){

               arr[i] = sc.nextInt();

        }
         for(int i = 0;i< arr.length;i++){
             if(sum<arr[i])
                 sum  = arr[i];
         }
        System.out.println(sum);
    }
}
