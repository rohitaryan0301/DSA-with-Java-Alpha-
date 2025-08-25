/* public class d {
    public static int deci(int n){
double dec=0;

int pow=0;
while(n>0){
    int ld=n%10;
    dec=dec+(ld*Math.pow(2,pow));
    n=n/10;
    pow++;
}

System.out.println("Ans is " + dec);
        return 1;
    }
    public static void main(String[] args) {
        int n=1011;
        deci(n);
    }
}
    */


    // bnary find
    public class d{
        public static double binNum(int n){
int pow=0;
int bin=0;
while(n>0){
    int rem=n%2;
    bin= bin+(int)(rem*Math.pow(10,pow));
    pow++;

n=n/2;
}
System.out.println("bin is : " + bin);

            return 1;
        }
        public static void main(String[] args) {
            int n=9;
            binNum(n);
        }
    }
