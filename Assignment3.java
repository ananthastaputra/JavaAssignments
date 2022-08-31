import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        patternPrinter(n);
    };

    static void patternPrinter(int n) {
        for(int i=n; i>=1; i--){
            int tem=n; // initialising temp variable so that we can decrement value on each iteration
            for(int j=1; j<=(n*i); j+=i){
                for(int k=1; k<=i; k++){
                    System.out.print(tem+" ");
                }
                tem--;
            }
            System.out.println();
        }
   
    }
}
