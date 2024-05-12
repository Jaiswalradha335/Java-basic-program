// import java.util.*;
// /**
//  * Function
//  */
// public class Function{
//     public static void calculateFactorial(int n) {
//         if(n<0){
//             System.out.println("inavlid number");
//             return;
//         }
//         int factorial = 1;
//         for(int i=n;i>=1;i--){
//          factorial = factorial*i;
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         int n = Sc.nextInt();
//         calculateFactorial(n);

        
//     }

// }
import java.util.*;

public class Function{
    public static int calculateAverage (int a, int b, int c) {
        return (a+b+c)/3;

    }
    public static void main(String [] args){
        Scanner Sc =new Scanner (System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        System.out.println("the average of three number is:"+calculateAverage(a, b, c));

    }
}