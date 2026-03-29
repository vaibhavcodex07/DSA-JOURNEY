import java.util.Scanner;

public class integerTOstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string in digits ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println("your input is " +(10+s));
    }
}
