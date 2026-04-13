import java.util.Scanner;// Import the Scanner class

public class Main {
    public static void main(String [] args)
    {
        char opt;
        Double nbr1, nbr2, res;
        Scanner inputObj = new Scanner(System.in);// create scanner object

        System.out.print(">>> ");
        nbr1 = inputObj.nextDouble();// read first number
        // System.out.println(nbr1);

        opt = inputObj.next().charAt(0);// read operator
        // System.out.println(opt);

        nbr2 = inputObj.nextDouble();// read second number
        // System.out.println(nbr2);

        switch (opt) {
            // performs addition between numbers
            case '+':
                res = nbr1 + nbr2;
                System.out.println(res);
                break;
        
            // performs subtraction between numbers
            case '-':
                res = nbr1 - nbr2;
                System.out.println(res);
                break;

            // performs multiplication between numbers
            case '*':
                res = nbr1 * nbr2;
                System.out.println(res);
                break;
            // performs devision between numbers
            case '/':
                if (nbr2 == 0)
                    System.exit(1);
                res = nbr1 / nbr2;
                System.out.println(res);
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }
        inputObj.close();
    }
}