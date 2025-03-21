import java.util.Scanner;
public class AdditionOfTwoNum{
    public static void main (String[]args){
        System.out.println("Enter the number first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the secound number for addition");
        int b = sc.nextInt();
      int sum = a+b;
      System.out.println(sum);
    }
}
