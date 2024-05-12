public class Recursion4{
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
System.out.println(str.charAt(idx));
printRev(str, idx-1);

    }
    public static void main(String [] args){
        String str = "abcd";
        printRev(str,str.length()-1);
    }
}
// time complexity = o(n) where n represent length