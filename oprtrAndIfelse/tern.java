
/* public class tern {
    public static void main(String[] args) {
    
        int marks=87;
        String status =(marks>33)?"Pass" : "Fail";
        System.out.println(status);
    }
    
}

*/

import java.util.*;
public class tern {
    public static void main(String[] args) {
        char ch='+';
        System.out.print("Enter first number " );
        Scanner sc =new Scanner(System.in);
        int first=sc.nextInt();
        System.out.print("Enter  second no.");
        int second=sc.nextInt();
         System.out.print("Enter what you want : ");
    char opt=sc.next().charAt(0);
     

        switch(opt){
case '+':  
System.out.println(first+second);
break;

case '*':  
System.out.println(first*second);
break;

case '-':  
System.out.println(first-second);
break;

case '/':  
System.out.println(first/second);
break;

default : 
    System.out.println("Error");

        }
    }
}


