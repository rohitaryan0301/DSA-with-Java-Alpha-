
/*  diamond 
public class e {
    public static void dimd(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dimd(4);
    }
}
    

    // pyramid 

    public class e{
        public static void pmd(int n){
            for(int i=1;i<n;i++){
for(int j=1;j<=n-i;j++){
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
    System.out.print(i+" ");
}
System.out.println();
            }
        }
        public static void main(String[] args) {
            pmd(5);
        }
    }


    */

    // pallindrome 

    public class e{
        public static void pdm(int n){
            
            for(int i=1;i<=n;i++){
                 for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            pdm(5);
        }
    }