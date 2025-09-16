public class pair {
    public static void pair(int ro[]){
       
        for(int i=0;i<ro.length;i++){
            int curr=ro[i];
            for(int j=i+1;j<ro.length;j++){
System.out.print("(" + curr + "," +  + ro[j] + ")" );
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int ro[]={12,24,56,45};
        pair(ro);
        
    }
}
