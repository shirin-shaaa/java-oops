import java.io.*;
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String s) {
        super(s);
    }
}

class average {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please Enter Numbers to be Calculated: ");
            int count = sc.nextInt();

            int sum = 0;

            System.out.println("Please Enter " + count + " Numbers:");

            for (int i = 0; i < count; i++) {
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative Numbers are not allowed");
                }

                sum += num;
            }

            float avg = (float) sum / count;
            System.out.println("Average of given numbers is : " + avg);
        }
        catch (NegativeNumberException ex) {
            System.out.println("Exception Caught!!!");
            System.out.println(ex.getMessage());
        }
        finally {
            sc.close();
        }
    }
}