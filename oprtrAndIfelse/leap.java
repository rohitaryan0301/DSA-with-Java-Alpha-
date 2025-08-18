import java.util.*;
public class leap {
    public static void main(String[] args) {
        System.out.print("Enter Year");
        Scanner sc=new Scanner(System.in);
        long year=sc.nextLong();
        if(year%4==0){
            System.out.println("Leap year");
        }
        else if(year%100==0){
            System.out.println("Leap year");
        }
        else if(year%400==0){
            System.out.println("Laep year ");
        }
        else {
            System.out.println("Not leap");
        }
    }
    
}
