import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Write a program that prints the numbers 1-10

        System.out.print("\nNumbers 1-10: \n");
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        //Write a program that prints the numbers 1-10 backwards

        System.out.print("\nNumbers 1-10 backwards: \n");
        for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        }
        //Write a program that prints all the odd numbers from 1-20

        System.out.print("\nOdd Numbers: \n");
        for (int x = 1; x <= 20; x = x + 2) {
            System.out.println(x);
        }
        //Write a program that prints all the even numbers from 1-20
        System.out.print("\nEven Numbers: \n");
        for (int x = 2; x <= 20; x = x + 2) {
            System.out.println(x);

        }
        //Have the user input a number and print all numbers from that input value to 1
        System.out.println("\nPlease input a value:");
        int x = input.nextInt();
        System.out.print("\nValue : ");
        for (; x >= 1; x--) {
            System.out.println(x);
        }

        //Sum all values from 1-10.
        int count = 1;
        int sum;
        for (sum = 1; count <= 10; count++) {
            sum = sum + count;

        }
        System.out.println("\nSum of all values from 1-10 is : " + sum);

        //Have the user enter a number and print the sum of all numbers from that inputted value to 1
        int userSum;
        System.out.println("Please input a number: ");
        int userValue = input.nextInt();

        for (userSum = 0; userValue >= 1; userValue--) {
            userSum = userValue + userSum;
            System.out.println(userSum);


        }


        //Write loops to print the following:

        System.out.println("\ni)\n");
        String star = "*";
        for (int rowS = 1; rowS <= 4; rowS++) {
            for (int columS = 1; columS <= 10; columS++) {
                System.out.print(star);
            }
            System.out.println();

        }
        System.out.println("\nii)\n");
        for (int row2 = 1; row2 <= 5; row2++) {
            for (int colum2 = 1; colum2 <= row2; colum2++) {
                System.out.print(star);
            }

            System.out.println();

        }

        System.out.println("\niii)\n");

        for (int row2 = 1; row2 <= 5; row2++) {
            for (int colum2 = 5; colum2 >= row2; colum2--) {
                System.out.print(" ");
            }
            for (int colum3= 1;colum3<=row2; colum3++){

                System.out.print("*");


            }

            System.out.println();
        }

        //Factorial of a Number:
        int input1;
        int factor =1 ;
        System.out.println("Please input an integer: ");
        input1 =input.nextInt();

        for(; input1 >=1; input1--){
            factor = input1 * factor;

            //System.out.println(factor);

        }
       System.out.println("Factorial of the integer  is " + factor);


        }
    }













