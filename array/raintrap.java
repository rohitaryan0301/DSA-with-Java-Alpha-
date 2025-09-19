public class raintrap {
    public static int raintrap(int height[]){
        int maxleft[]=new int [height.length];
        maxleft[0]=height[0];
        for(int i=1;i<height.length;i++){
            
            maxleft[i]=Math.max(height[i],maxleft[i-1]);
        }
        int maxright[]=new int [height.length];
         maxright[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        int finl=0;
        int sum=0;
        for(int i=0;i<height.length;i++){
        int waterl=Math.min(maxleft[i],maxright[i]);
        finl=waterl-height[i];
sum=sum+finl;

        }
        System.out.print(sum);
return sum;
    }
    public static void main(String[] args) {
        int height[]={2,4,8,5,1,3};
        raintrap(height);
        
        
    }
}
