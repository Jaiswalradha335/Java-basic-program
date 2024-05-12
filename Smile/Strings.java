import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //stig delcaration
        // String firstname = "pawan";
        // String lastname = "bittu";
        // String fullname = firstname + " " +lastname;
        // System.out.print(fullname.length());
        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }
        // if(firstname.compareTo(lastname)==0) {
        //     System.out.println("strings are equal");
        // } else{
        //     System.out.println("strings are not equal");

        // }
        StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0,'A');
        // System.out.println(sb);
        // sb.insert(2,'u');
        // System.out.println(sb);
        // sb.delete(2,4);
        // System.out.println(sb);
        // sb.append("r");
        // System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back = sb.length()-1-i;//5-1-0
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);



    }
    
}
