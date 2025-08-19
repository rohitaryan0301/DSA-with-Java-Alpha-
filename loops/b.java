import java.util.*;
public class b {
    public static void main(String[] args){
        int sum=0;
        int a=1;
        
        System.out.print("Enter n : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


/* while(a<n){
    System.out.print("Rohit Aryan \n");

a++;
    }

    System.out.print("Completed");
}
}
*/

// nth sum
while(a<=n){
    sum = sum+a;
    a++;
}

System.out.println(sum);
    }
}

