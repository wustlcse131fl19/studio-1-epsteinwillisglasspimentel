package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String []args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("First of two integers to be averaged?");
        int n2 = ap.nextInt("Second of two integers to be averaged?");

        double sum = n1 + n2;
        double average = sum/2;

        System.out.println("The average is "+ average + ".");
    }
}
