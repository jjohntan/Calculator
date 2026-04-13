import java.util.Scanner;// Import the Scanner class

public class Main {
    public static void main(String [] args)
    {
        Double nbr1, nbr2, res;
        Scanner inputObj = new Scanner(System.in);// create scanner object

        System.out.print(">>> ");
        nbr1 = inputObj.nextDouble();// Read user input
        System.out.println(nbr1);
        nbr2 = inputObj.nextDouble();
        System.out.println(nbr2);
        inputObj.close();
    }
}