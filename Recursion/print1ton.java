import java.util.Scanner;

public class print1ton {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fun(n);
    }
    public static void fun(int n){
        if(n==0) return;
        System.out.print(n+" ");
        fun(n-1);
      if(n!=1)  System.out.print(n+" ");
    }
}
