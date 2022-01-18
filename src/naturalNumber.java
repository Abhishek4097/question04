import java.util.Scanner;

public class naturalNumber {
        static int nsum(int n){
            return (n*(n+1))/2;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = input.nextInt();
            System.out.println("Sum of first "+num+" natural number : "+nsum(num));
        }
    }

