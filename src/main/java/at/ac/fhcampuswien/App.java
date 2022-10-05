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
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
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