public class s1EqualsS2 {
    public static boolean equals(String s1 ,String s2){
        if(s1.length()!= s2.length()) return false;
        for (int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!= s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 =  new String("vaibhav");
        String s2 = new String("vaibhav");
        //System.out.println(s1==s2); // ye false return kar k dega
        System.out.println(s1.equals(s2));// ye true return kar k dega kyunki ye charter vise compare kar raha hai

    }
}
