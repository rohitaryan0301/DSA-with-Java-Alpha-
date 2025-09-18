public class kadane {
    public static int kadane(int array[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<array.length;i++){
            cs=cs+array[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.print("max is "+ ms);
       return 1;
    }
    public static void main(String[] args) {
        int array[]={-1,-2,-6,4,7,-8,-2};
        kadane(array);
    }
}
