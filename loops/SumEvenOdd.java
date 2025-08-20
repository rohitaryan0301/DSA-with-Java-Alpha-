import java.util.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter how many numbers you want to input: ");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

