
/* 

public class b {
    public static void showw(int row, int colm){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=colm-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=5;
        int colm=6;
        showw(row,colm);
    }
}

*/

public class b{
    public static void patt(int row,int col){
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col-i+1;j++){
System.out.print(j);

            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int row=4;
        int col=5;
        patt( row,col);
    }
}

