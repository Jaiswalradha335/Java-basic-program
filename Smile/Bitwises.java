public class Bitwises{
    public static void main(String[] args) {
        int n= 6;//0101
        int pos =1;
        int bitmas = 1<<pos;
        //or operation get bit
        int newNumber = bitmas | n;
        System.out.println(newNumber);
        //and operation set bit
        // if((bitmas | n)== 0){
        //     System.out.println("bit was zero");
        // } else{
        //     System.out.println("bit was one");
        // }
    }
}