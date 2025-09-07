public class d {
    /* public static void butfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        butfly(5);
    }
        */



        // rhombus 

        public static void rhom(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        


        public static void rhomb(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
for(int j=1;j<=n;j++){
    if(i==1 || j==1 || i==n || j==n){
        System.out.print("*");
    }
    else {
        System.out.print(" ");
    }
}
System.out.println();
            }
        }
         public static void main(String[] args) {
            rhom(8);
            rhomb(5);
        }
            
        }

