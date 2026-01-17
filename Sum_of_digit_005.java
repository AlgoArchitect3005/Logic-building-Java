import java.util.Scanner;
public class Sum_of_digit_005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of its digits:");
        sc.close();
        int number = sc.nextInt();
        int sum =0;
        while(number !=0){
            int digit = number %10;
            number /=10;
            sum +=digit;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
