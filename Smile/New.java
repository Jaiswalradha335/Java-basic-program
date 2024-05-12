import java.util.*;
public class New{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = Sc.nextInt();
        System.out.println("enter the value of b");
        int b = Sc.nextInt();
        System.out.println("enter the operators(+ , - , * ,/ ,%)");
        String operators = Sc.next();
        switch (operators) {
            case "+":
            System.out.println("Addtion of a+b:" +(a+b)); 
            break; 
            case "-":
            System.out.println("Subtraction of a-b:" +(a-b)); 
            break; 
            case "*":
            System.out.println("Multiplicaton of a*b:" +(a*b)); 
            break; 
            case "/":
            System.out.println("Diviion of a/b:" +(a/b)); 
            break; 
            case "%":
            System.out.println("Modular of a%b:" +(a%b)); 
            break; 
            default:
            System.out.println("operation does not found"); 
        }  
            
    }
}