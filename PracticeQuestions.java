// Chapter 1 – Practice Set
//Q1. Write a program to sum three numbers in Java.
//Q2. Write a program to calculate CGPA using marks of three subjects (out of 100)
//Q3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//Q3. Write a Java program to convert Kilometers to miles.
//Q4. Write a Java program to detect whether a number entered by the user is an integer or not.
import java.util.Scanner;
public class PracticeQuestions {
    public static void main (String[]args){

    //Question 1
    int a = 2;
    int b = 3;
    int c = 4;
    int result;
    result = a + b + c;
    System.out.println("The sum of a + b + c is :" + result);

    //Question 2
    float subject1 = 89;
    float subject2 = 97;
    float subject3 = 78;
    float cgpa, avg;
    avg= (subject1 + subject2 + subject3)/3;
    cgpa = avg/10;
    System.out.println("The cgpa of the student is:" + cgpa);

    //Question 3
    System.out.println("Enter your full name:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Hello " + str + " have a nice day");

    //Question 4
    System.out.println("Enter Distance in Kilometers to convert into Miles");
    double kilometers = sc.nextFloat();
    double miles;
    miles = kilometers*0.62137119;
    System.out.println("The distance in miles is:" + miles);
    
    //Question 5 
    System.out.println("Enter a interger");
    System.out.println(sc.hasNextInt());

    System.out.println("The program has been executed sucessfully");



    }
}
