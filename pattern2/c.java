public class c {
    public static void floyd(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }

    // triangle 0 -1
    public static void tri(int n){
        for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
    if((i+j)%2==0){
        System.out.print("1");
    }
    else{
        System.out.print("0");
    }
}
    System.out.println();

        }
    }
    public static void main(String[] args) {
        floyd(5);
        tri(5);
    }
    
}
