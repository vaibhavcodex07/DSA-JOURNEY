import java.util.Scanner;

public class TowerOfHonai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of tower : ");
        int n = sc.nextInt();
        Honai(n,'A','B','C');
    }

        public static void Honai(int n, char source, char helper, char destination){
        if(n==0) return;
              // n-1 disks source to helper via destination
            Honai(n-1 , source , destination ,helper);
            // source to largest
            System.out.println(source+"->> "+destination);
            // n-1 diskt helper to destination via source
            Honai(n-1,helper,source,destination);
        }
    }


