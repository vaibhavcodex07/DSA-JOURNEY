import java.util.Scanner;

public class arraysofothertypes {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("ye shallow copy hai jo tune 100 print kia hai samjha ");
        // shallow copy
        int  [] brr = {10 };
        int [] x = brr;
        x [0]= 100;
        System.out.println("shallow copy "+brr[0]);

        System.out.println(" yaha se dusra code shuru hai bhai dono ko alag rakh mix na kar dio na usko chedio ab  ");
                System.out.println("array ka size de de guru ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("array k elemnt de de ab ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        for(int i = 0;i<n;i++){
            System.out.print("  "+ arr[i]);
        }

}
}

