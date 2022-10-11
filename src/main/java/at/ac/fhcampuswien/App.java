package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        double x = 0;
        double y = 0;
        int count = 0;
        Scanner var = new Scanner(System.in);

        System.out.print("Number 1: ");
        y = var.nextInt();


    while (y > 0) {
        if (x > y) {
            count++;
            System.out.print("Number " + (1 + count) + ": ");
            y = var.nextInt();
        } else {
            x = y;
            count++;
            System.out.print("Number " + (1 + count) + ": ");
            y = var.nextInt();
        }
    }


        if (x <= 0) {
            System.out.println("No number entered.");
        }
        else {
            System.out.println("The largest number is " + String.format("%.2f", x) );
        }
    }

    //todo Task 2
    public void stairs() {
        int x = 0;
        int num = 0;
        Scanner var = new Scanner(System.in);

        System.out.print("n: ");
        x = var.nextInt();
        if (x <= 0) {
            System.out.println("Invalid number!");
        }

        for (int count1 = 1; count1 <= x; count1++) {
            for (int count2 = 0; count2 < count1; count2++) {
            num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    //todo Task 3
    public void printPyramid(){
        int ROWS = 6;
        int x = 0;


        for (int count1 = 1; count1 <= ROWS; count1++) {
            for (int count2 = count1; count2 < ROWS;count2++) {
                System.out.print(" ");
            }

            for (int count3 = 0; count1*2-1 > count3; count3++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){

        char character;
        int height;

        Scanner var = new Scanner(System.in);

        System.out.print("h: ");
        height = var.nextInt();
        System.out.print("c: ");
        character = var.next().charAt(0);

        if(height % 2 == 0){
            System.out.println("Invalid number!");
        }
        else{
            for(int x = 1; x <= (height / 2) + 1; x++)
            {
                for(int y = 1; y <= height - (height / 2) - x; y++)
                {
                    System.out.print(" ");
                }

                for(int z = x; z >= 1; z--)
                {
                    System.out.print((char) (character - z + 1));
                }

                for(int k = 2; k <= x; k++)
                {
                    System.out.print((char) (character - k + 1));
                }
                System.out.println();
            }

            for(int x = (height / 2); x >= 1; x--)
            {
                for(int y = 1; y <= height - (height / 2) - x; y++)
                {
                    System.out.print(" ");
                }

                for(int z = x; z >= 1; z--)
                {
                    System.out.print((char) (character - z + 1));
                }

                for(int k = 2; k <= x; k++)
                {
                    System.out.print((char) (character - k + 1));
                }
                System.out.println();

            }
        }
    }

    //todo Task 5
    public void marks(){
        double x = 0;
        double y = 0;
        int neg = 0;
        int num = 1;
        int num2 = 0;
        double avg;

        Scanner var = new Scanner(System.in);

        System.out.print("Mark 1: ");
        x = var.nextInt();
    while (x != 0) {
        while (x >= 1 & x <= 5) {
            num++;
            num2++;
            y += x;
            if (x == 5) {
                neg++;
            }

            System.out.print("Mark " + num + ": ");
            x = var.nextDouble();

        }
        while (x < 0 || x > 5) {
            System.out.println("Invalid mark!");
            System.out.print("Mark " + num + ": ");
            x = var.nextDouble();
        }
    }

        if (x == 0) {
            avg = y/num2;
            if (y == 0 && num2 == 0){
                System.out.println("Average: 0.00");
            }
            else {
                System.out.println("Average: " + String.format("%.2f", avg));
            }
            System.out.println("Negative marks: " + neg);
        }

    }

    //todo Task 6
    public void happyNumbers(){
        int num0;
        int num1;
        int sum = 0;

        Scanner var = new Scanner( System.in );
        System.out.print("n: ");
        num0 = var.nextInt();

        while(num0 > 9)
        {
            while(num0 > 0)
            {
                num1 = num0 % 10;
                sum = sum + num1 * num1;
                num0 = num0/10;
            }
            num0 = sum;
            sum = 0;
        }

        if(num0 == 1) {
            System.out.println("Happy number!");
        }

        else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}