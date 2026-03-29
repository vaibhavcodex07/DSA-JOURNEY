import java.util.Scanner;

public class countDIGITS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TRADITIONOL METHOD
        System.out.println("string k andar ek number daalo ");
      int n = sc.nextInt();
//        int count = 0;
//        while(n!=0){
//            n /= 10;
//            count ++;

// WITHOUT USING LOOP PRINT THE DIFITS COUNT
          String s = "" + n;
        System.out.println("string k andar " + s.length() +" digits ka number hai ");
        // AGAR STRING ME EK NUMBER HAI USKO INTERGER ME PRINT KARVANA HO TOH KESE KARVAYE STR = "4566251"
        String str = "15646";
        int g = Integer.parseInt(str);
        // YE KYA KARTA HAI PARSEINT ??
        // YE STRING KO INTEGER ME CONVERT KAR DETEA HAI
        System.out.println("parse int "+(g+100)); // 15746 an chaiye
   // }
}
}
