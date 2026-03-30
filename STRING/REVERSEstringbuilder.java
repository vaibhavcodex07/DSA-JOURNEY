public class REVERSEstringbuilder {
    public static void main(String[] args) {
        String s = "123456";
        StringBuilder sb = new StringBuilder(s);
           sb.deleteCharAt(1); // very costally process
           sb.insert(1,'2');
           //SB reverse
//        int i = 0;
//        int j = sb.length()-1;
       // sb.reverse();
//         while (i<=j){
//             char temp1 = sb.charAt(i);
//             char temp2 = sb.charAt(j);
//             sb.setCharAt(i,temp2);
//             sb.setCharAt(j,temp1);
//             i++;
//             j--;
//         }
        System.out.println(sb);
    }
}
