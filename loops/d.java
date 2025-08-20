
// find original from reverse


/* public class d {
    public static void main(String[] args) {
        int num=324;
        int a=0;
        while(num>0){
            int lastdigit=num%10;
            a=(a*10)+lastdigit;
            
            
            num=num/10;
            
        }
        System.out.println(a);
    }
}
    


    // break & continue

    public class d{
        public static void main(String[] args) {
            for(int i=1;i<5;i++){
                if(i==3){
                    // break;
                    continue;
                }
                System.out.println(i);
            }
            System.out.println("okay");
        }
    }

    */
 
    import java.util.*;
    public class d{
        public static void main(String[] args) {
        
            
            Scanner sc=new Scanner(System.in);
            do{
                System.out.print("Enter number : \n");
            int i=sc.nextInt();
            if(i%10==0){
                break;
            }
            
            }
            while(true);
        }
            
        }
    