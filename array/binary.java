



/* 
public class binary {
public static int binaryget(int ab[],int key){
int low=0;
int high=ab.length-1;
8while(low<=high){
    int mid=(low+high)/2;
    if(ab[mid]==key){
        return mid;
    }
    else if(ab[mid]<key){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
}
return -1;
}

    public static void main(String[] args) {
        int ab[]={12,34,76,78};
        int key=77;
        
        System.out.println("Item found : "+ binaryget(ab,key));
    }
}

*/

// reverse array

public class binary{
public static void reverse(int num[]){
    int first=0;
int last=num.length-1;
while(first<last){
    int temp=num[first];
    num[first]=num[last];
    num[last]=temp;
    first++;
    last--;
}
}
public static void main(String[] args) {
    int num[]={10,20,45,48,87};
     reverse(num);
     for(int i=0;i<num.length;i++){
        System.out.print(num[i] + " ");
     }
}
}
