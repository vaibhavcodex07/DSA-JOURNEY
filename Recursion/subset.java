public class subset {
    public static void main(String[] args) {
        String s = "abcd";
        // ans = abhi tak jo characters humne pick kiye hain
        // index = jis character par abhi decision lena hai
        subset("" , s , 0);
    }
    public static void subset(String ans , String s , int index){
         // Jab saare characters ke decision ho gaye,
        //        // matlab index string ke end tak pahunch gaya.
        //        // Ab jo characters pick kiye hain wahi ek subset hai.
          if(index == s.length()) {
              System.out.print(ans + " ");
              return;
          }
          // Current character ko pick kar rahe hain.
        // Example: agar current character 'a' hai,
        // toh ans me 'a' add hoga.
        char ch = s.charAt(index);
        // -------- PICK --------
        // Current character ko subset me INCLUDE kar liya.
        // index + 1 → ab next character par decision lenge.
        //
        // Example: ans = "" ch  = 'a'
        // next call → subset("a", s, 1)
        subset(ans+ch , s , index +1);
        // -------- SKIP --------
        // Current character ko subset me INCLUDE nahi kiya.
        // Is character ko chhod diya aur directly next character par chale gaye.
        // Example ans = ""  ch = 'a'
        // next call → subset("", s, 1)
        subset(ans, s, index+1); // skip
    }
}
