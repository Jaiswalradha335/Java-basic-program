public class Numbers {
    public static void printSum(int i,int n,int sum ){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);

    }
    //     if(n==6) {
    //         return;
    //     }
    //     //for 5 to 1 use n-1 and for 1 to 5 use n+1
    //     //by intitalizing n=1 for 1 to 5 and n=5 for 5 to 1
    //     System.out.println(n);
    //     printNumb(n+1);
    // }
    public static void main(String[ ] args){
        // int n = 1;
        // printNumb(n);
        printSum(1,5,0);

    }
    
}
