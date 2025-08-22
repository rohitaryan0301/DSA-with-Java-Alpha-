/* import java.util.*;
public class a{
    public static int add(int n1,int n2){
        int sum=n1+n2;
        System.out.print(sum);
        return sum;
    }
    public static void main(String [] args){
        System.out.print("Enter two number : ");
        Scanner sc=new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
add(n1,n2);
    }
}

*/

// call by value

 public class a{
    public static void change(int a){
        a=10;
    }
    public static void main(String[] args) {
        int a=5;
        change(a);
        System.out.println(a);
    }
}
