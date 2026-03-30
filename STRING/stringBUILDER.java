public class stringBUILDER {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.append("vaibhav");
        System.out.println(s);
        s.setCharAt(0,'V');
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        String v = s.toString();
        System.out.println(v);
        System.out.println(s.length()+" "+s.capacity());
         s.append("nvjsdai bngijd");
        System.out.println(s.length()+" "+s.capacity());
    }
}
