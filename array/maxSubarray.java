public class maxSubarray {
    public static int maxsub(int a[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

// for reduce time n^2
int prefix[]= new int[a.length];
prefix[0]=a[0];
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+a[i];
}
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;


currsum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];



// Brute force method time complexity=n^3
               /* 
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum += a[k];
                }
                System.out.println(currsum);
                */
            if(maxsum<currsum){
                maxsum=currsum;
            }
            }
        }
            System.out.println("max sum " + maxsum);
        
        return 1;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,-1};
        maxsub(a);
    }
}
