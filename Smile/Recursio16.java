//find the number of ways in which you can invite  n people to your party, single or in pairs
public class Recursio16 {
    public static int calGuests(int n){
        if(n <= 1){
            return 1;
        }
        //single
        int ways1 = calGuests(n-1);
        //pair
        int ways2 = (n-1) * calGuests(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(calGuests(n));
    }
    
}
