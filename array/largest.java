public class largest {
    public static int largest(int[] a){
        int largest=a[0];
for(int i=0;i<a.length;i++){
    if(a[i]>largest){
        largest=a[i];
    }
}
  return largest;

    }
    public static void main(String[] args) {
        int a[]={12,43,23,56,21};
       
      int index= largest(a);
        System.out.println("largest number is "+ index);

    }
}
