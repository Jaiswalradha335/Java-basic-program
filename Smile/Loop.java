import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       System.out.println("enter n:");
       int n = Sc.nextInt();
       for(int i=1;i<11;i++){
        System.out.println(i*n);
       }
    }
    
}
