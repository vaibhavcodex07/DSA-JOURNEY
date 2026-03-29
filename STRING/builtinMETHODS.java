public class builtinMETHODS {
    public static void main(String[] args) {
        String s = "vaibhav bharti ";
        System.out.print(s.indexOf('v'));
        System.out.print(s.indexOf('a')); System.out.print(s.indexOf('i')); System.out.println(s.indexOf('b'));
        //AGAR SAMEM CHARHTER REPEAT KAR RAHA HAI TOH KYA HOGA INDEX  ???
        System.out.println(s.indexOf('a'));  // TOH FIRST OCCURENCE COUNT HOGI INDEX KI SAARE PRINT NAHI HOYENGE
        // AGAR KISI REPEATED ELEMENT KA LAST INDEX PRINT KARNA HO TOH LAST INDEX USE KARO
        System.out.println(s.lastIndexOf('a')); // ISSE HMARA PRINT HOJEGA LAST INDEX OR    REPEATED STRING
        // EK STRING OR LEKE DEKHTE HAI KHUCH  NAYE BUILTINfunctions
        String str = "Harshita";
        System.out.println(str.contains("Harsh")); // ye true return kar k dega
        System.out.println(str.contains("Harshit"));
        // isme hum output bhi badal sakte hai jese ki
        if(str.contains("shita")){
            System.out.println("priya is a good  girl");
        }

        //EK HMARA FUNCTION HOTA HAI STARTS WITH OR ENDSWITH    ye bhi true or false hi return karte hai

        System.out.println("ye elemnt start hora hai index 0 se "+str.startsWith("Harsh"));
        System.out.println("ye index 0 se shuru nahi ho ra hai "+str.startsWith("shite"));
        System.out.println("ye element string ki length pe khatam ho ra hai "+str.endsWith("ta"));
        System.out.println("ye element string ki length pe nahi khatam ho ra hai "+str.endsWith("Harshit"));

    }
}
