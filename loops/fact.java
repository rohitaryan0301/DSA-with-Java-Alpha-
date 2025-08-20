import java.util.*;
public class fact {
    public static void main(String[] args) {
        
    System.out.print("Enter num :");
Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int fact=1;
if(num==1){
    System.out.println("Fact is : "+ "1");
}
else if(num==0){
    System.out.println("1");
}
else  { 
while(num>0){
    fact=fact*num;
    num--;
}
System.out.println(fact);
}   
}
}
