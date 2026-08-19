public class PreInPost {
    public static void main(String[] args) {
        pip(1);
        System.out.println();
        pip(2);
        System.out.println();
        pip(3);
    }
    public static void pip(int n) {
        if(n==0) return;
       System.out.print(n+" ");   // PRE
        pip(n+1);
        System.out.print(n+" ");   // IN
         pip(n+1);
        System.out.print(n+" ");    // POST
    }
}
