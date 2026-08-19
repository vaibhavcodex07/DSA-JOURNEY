import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        // for reverse
      //  print(n);
        print(1,n);
    }
    public static void print(int x ,int n){
//        if(n==5) return;
//        System.out.println("vaibhav papa ");
//        print(n+1);
        // reverse number printing
//        if(n==0) return;
//        System.out.print(" "+n);
//        print(n-1);
//
        // natural number printing
        if(x>n) return;
        System.out.print(" "+x);
        print(x+1,n);

    }
}
