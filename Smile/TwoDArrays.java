 import java.util.*;
 public class TwoDArrays{
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
        int cols = sc.nextInt();
         int [][] numbers = new int[rows][cols];
         //input
         //Rows
        for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
         }
         //output
         //cols
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 System.out.print(numbers[i][j]+" ");
            }
             System.out.println();
         }
         int x = sc.nextInt();
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 if(numbers [i][j]==x){
                     System.out.print("x is found at location("+i+","+j+")");
                }
             }
        }


     }
 }
