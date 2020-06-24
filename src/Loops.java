import java.util.Scanner;

public class Loops {
    private static boolean i;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Write a program that prints the numbers 1-10 backwards.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Write a program that prints all the odd numbers from 1-20.
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
//Write a program that prints all the even numbers from 1-20.
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Sum all values from 1-10.
        int num = 10, count = 1, total = 0;

        while (count <= num) {
            total = total + count;
            count++;
        }

        System.out.println("Sum 1 to 10 is: " + total);

// Write loops to print the following:
//**********
//**********
//**********
//**********
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

//**
//***
//****
//*****

        for (int a = 0; a <= 6; a++) {
            for (int b = 1; b < a; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }

///8. Factorial of a Number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        int result = 1;
        if (number<=0) {
            result =1;
        }
        else {
            for ( i =1; i<=number;i++){
                result = result * i;
            }
        }
        System.out.println("The fractorial of a number is:" + result);
    }
    }

//Have the user enter a number and print the sum of all numbers from that inputted value to 1.
//I do not understand this requirement.



