/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{
    int age;
    int LOWER_BOUND = 14;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else {
                    System.out.println("The minimun age is " + ((age/2) + 7));
                    System.out.println("The maximum age is " + ((age*2) - 7));
                }
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
        }
    }
    
    public void getYoungerAndOlderAge (int age) {
        System.out.println("The minimun age is " + ((age/2) + 7));
        System.out.println("The maximum age is " + ((age*2) - 7));
    }
    
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
