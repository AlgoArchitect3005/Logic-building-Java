import java.util.Scanner;
public class Reverse_integer_002 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        int reversedNumber = 0;
        while(num !=0){
            int digit = num %10;
            reversedNumber = reversedNumber *10 +digit ;
            num /=10;
        }
        System.out.println("Reversed integer: " + reversedNumber);
    }
}
