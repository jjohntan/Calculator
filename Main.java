import java.util.Scanner;// Import the Scanner class

public class Main {
    public static void main(String [] args)
    {
        Scanner inputObj = new Scanner(System.in);// create scanner object

        Double nbr1 = inputObj.nextDouble();// Read user input
        System.out.print(nbr1);
        inputObj.close();
    }
}