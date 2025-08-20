import java.util.*;

public class e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        /* do{
            System.out.println("enter number");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
        }
        while(true);  */
System.out.print("Enter no. \n");
int num=sc.nextInt();

if(num==2){
System.out.println("Prime");
}
else{
    boolean isprime=true;
    for(int i=2;i<Math.sqrt(num);i++){
        if(num%i==0){
            isprime=false;
        }
        
    }
    if(isprime==true){
        System.out.println("n is prime");
    }
    else{
        System.out.println("not prime");
    }
}

    }
}
