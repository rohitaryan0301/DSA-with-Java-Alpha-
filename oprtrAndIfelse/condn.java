/* import java.util.*;
public class condn {
    public static void main(String[] args) {
        System.out.print("Enter age : ");
        Scanner sc =new Scanner(System.in);
int age=sc.nextInt();

if(age>=18){
    System.out.println("Go to Vote");
}
else {
    System.out.println("Go to home");
}
    }
}




// greater no. between 2
public class condn{
    public static void main(String[] args) {
        int a=30;
        int b=12;
        if(a>b){
            System.out.println("Largest number is a : " + a);
        }
        else {
            System.out.println("Largest no. is : b " + b);
        }
    }
}

*/

import java.util.*;
public class condn{
    public static void main(String[] args) {
        System.out.print("Enter number : ");
       Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if (number%2==0){
System.out.println("Given number is even");
}
else {
    System.out.println("Given number is odd");
}
    }
}