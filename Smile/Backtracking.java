 class Backtracking{
    public static void printPermutation(String str, int idx, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "ABCD";
        printPermutation(str, 0, " ");

    }
 }
 //time complexity = O(n*n!) where n!=ans , n=steps;