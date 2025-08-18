import java.util.*;
public class income {
    public static void main(String[] args) {
        System.out.print("Enter your annual income \n" );
       Scanner sc=new Scanner(System.in);
       float income=sc.nextFloat();
if(income<500000){
    System.out.print(" Chill No tax");
}
else if(500000>income){
    System.out.print("Tax : " + income*0.1);
}
else if(income<1200000){
    System.out.print("Tax : "+ income*0.25);

}
else{
    System.out.print("Pay : " + income*0.40);
}
    }
    
}
