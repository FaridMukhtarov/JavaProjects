package programs;

import java.util.Scanner;

public class CalculateGradePointAverage {

    // Program to Calculate Grade Point Average

    public static void main(String[] args) {

        int physics, chemical, history, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your physics score: ");
        int ph = scanner.nextInt();
        System.out.print("Enter your chemical score: ");
        int ch = scanner.nextInt();
        System.out.print("Enter your history score: ");
        int hi = scanner.nextInt();
        System.out.print("Enter your music score: ");
        int mu = scanner.nextInt();

        double average = (double) (ph + ch + hi + mu) / 4.0;
        System.out.println(average >= 60 ? "Pass the Class:" : "Failed the Class:");

    }
}
