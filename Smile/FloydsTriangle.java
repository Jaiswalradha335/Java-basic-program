public class FloydsTriangle {
    public static void main(String[] args) {
        int n=5;
        int Numbers=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Numbers+" ");
                Numbers++;
            }
            System.err.println();
        }
    }
    
}
