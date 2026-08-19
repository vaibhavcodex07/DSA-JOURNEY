import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+pow(a,b));
    }
    public static int pow(int a , int b){
        // time complexity is higher function pehle 64 hua phir 63 phir so on 0 hua 0 ki power 1 hui phir function back aaya
//        if(b==0) return 1;
//        return a*pow(a,b-1);

        // isme time complixty o(logn) ho gyi
        if(b==0) return 1;
        if(b%2==0) return (pow(a,b/2)*pow(a,b/2));
        else{
            return a*(pow(a,b/2)*pow(a,b/2));
        }
    }
}
