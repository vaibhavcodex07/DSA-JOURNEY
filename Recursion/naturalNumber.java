import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("the sum is your given number is : "+findsum(n));
    }
    public static int findsum(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n + findsum(n-1);
    }
}

