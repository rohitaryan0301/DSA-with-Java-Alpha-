public class c {
    public static int linear(int marks,int[] arr1) {
        for(int i=0;i<arr1.length;i++){
if(arr1[i]==marks){
    System.out.println("found : "+arr1[i]);
}
else{
    System.out.println("not found");
}
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={12,56,76,87,45};
        int marks=87;
        linear(marks, arr1);
    }
}
