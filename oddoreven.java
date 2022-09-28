import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println("it is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }
    }



}
