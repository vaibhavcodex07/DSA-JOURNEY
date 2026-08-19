public class GlobalVariable {
    static int x =10;   // Global intialize
    public static void main(String[] args) {
        x = 900;
        System.out.println(x); // local intialize
       fun();
       int x = 10; // local dec and int
        System.out.println(x);
    }
    public static void fun(){
        x = 20;
        System.out.println(x);
    }
}
