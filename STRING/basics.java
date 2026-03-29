import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
//        char [] arr = {'v','a','i' ,'b','h','a','v'};
//        for(char x : arr){
//            System.out.print( x+" ");
//        }
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        System.out.println(s);
//        String t = sc.next();
//
//        System.out.println(t);
        String  str = "aeiouajiobhatngio";
        int count = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            count ++;
            }
        }
        System.out.println(count);
    }
}
