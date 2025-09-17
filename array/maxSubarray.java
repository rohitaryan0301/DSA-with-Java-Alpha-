public class maxSubarray {
    public static int maxsub(int a[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum += a[k];
                }
                System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
            }
        }
            System.out.println("max sum" + maxsum);
        
        return 1;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,-1};
        maxsub(a);
    }
}
