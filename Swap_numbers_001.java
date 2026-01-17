import java.util.Scanner;
public class Swap_numbers_001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        sc.close();
        
    }
    void swap1(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    void swap2(int a, int b){
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}