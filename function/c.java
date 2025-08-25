
/* 
public class c {

    
    public static boolean primecheck(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
          return false;
            }
        }
        return true;
        
        }
        public static void main(String[] args) {
            
            System.out.println(primecheck(5));
            
        }
    )

    */


    //prime in range

    public class c{

public static boolean check(int n){
    if(n%1==0){
        return true;
   }
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}




        public static void rangeprime(int n){
            for(int i=2;i<=n;i++){
                if(check(i)){
System.out.print(i + "");
                }
            }
            System.out.println();
        }
        public static void main(String[] args) {
            rangeprime(20);
        }
    }
    






