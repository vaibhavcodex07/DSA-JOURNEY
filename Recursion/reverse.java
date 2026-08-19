import java.util.Scanner;

public class reverse {
    public static void rev(int n , int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        rev(n/10,r*10 + n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
       rev(n,0);
    }
}
