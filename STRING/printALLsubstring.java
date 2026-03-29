public class printALLsubstring {
    public static void main(String[] args) {
        String s = "1234";
        for (int i = 0; i <s.length(); i++) {

            for (int k = i + 1; k <= s.length(); k++) {
                System.out.print(" " + s.substring(i, k));
            }
            System.out.println();
        }
        int sum =  0;
        for (int i = 0; i <s.length(); i++) {
            for (int k = i+1; k <= s.length(); k++) {
               String sub =  s.substring(i,k);
               sum = sum + Integer.parseInt(sub);
            }
        }
        System.out.print(" sum of all substring " +sum);
    }
}

