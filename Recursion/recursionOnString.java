import java.util.ArrayList;

public class recursionOnString {
    public static void main(String[] args) {
        String s = "vaibhav";
        change(s);
        System.out.println(s);
        String arr [] = {"vaibhav" , "hritik roshan","hema maalni" , "rohit adventure "};
        for(String ele : arr){
            System.out.print(" "+ele);
        }
        ArrayList<String> al = new ArrayList<>();
        al.add("deepika");
        al.add("Garv");
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        // Array list me element add hota hai pass by value se
       al.add("Doreamon");
    }

    private static void change(String s) {
        s = "virat kohli";
        System.out.println(s);
    }
}
