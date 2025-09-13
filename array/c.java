public class c {
    public static int linear(int marks,int[] arr1) {
        for(int i=0;i<arr1.length;i++){
if(arr1[i]==marks){
    return i;
    
}

}     
    
    return -1;
    }
    public static void main(String[] args) {
          int marks=56;
        int arr1[]={12,56,76,87,45};
        
        int index =linear(marks,arr1);
        if(index==-1){
System.out.println(" not found ");
        }
        else{
            System.out.println("found at  : "+ index);
        }
    }
}
