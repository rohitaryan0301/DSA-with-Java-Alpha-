
// overloading 

/*   public class c {
    public static int add(int a,int b){
        int sum=a+b;
        System.out.println("sum1 is : " + sum);
        return sum;
    }
    public static int add(int m, int k,int l){
int sum2=m+k+l;
System.out.println("sum2  is : " + sum2);
        return sum2;
    }
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=5;
        add(a,b);
        add(a,b,c);
    }
}

*/


public class c{
public static float multiply(float a,float b) {
    System.out.println("1 " + a*b);
    return a*b;
}
public static int multiply(int m,int n,int k){
    System.out.println("2 "  + m*n*k);
    return  m*n*k;
}
public static void main(String[] args) {
    float a=6.8f;
    float b=2.4f;
    float c=8.9f;
    int m=5;
    int n=9;
    int k=8;
    multiply(a,b);
    multiply(m,n,k);
    
}
}