/*   Multiply two number

public class b{
    public static int multiply(int a,int b){
        int ans=a*b;
        System.out.println("Ans is : "+ ans);
        return ans;
    }
    public static void main(String[] args){
        int m=5;
        int n=10;
        multiply(m,n);
    }
}

*/

// factorial + upgrade fact


import java.util.*;
public class b{
    public static int fact(int n){

    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i; }
        
    

return f;

        
    }
    public static void main(String[] args) {
        System.out.print("Enter n & r : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
if(r>n){
    System.out.println("Error");
}
        int fn=fact(n);
        int fr=fact(r);
        int afr=fact(n-r);
        int ok=fn/(fr*afr);
        System.out.print("good : " + ok);
    }

}