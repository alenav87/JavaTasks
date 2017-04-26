package Main;

import java.util.Scanner;
import java.lang.String;
import CalculatorMethods.CalcOperationMethods;

/**
 * Created by alena_valasevich on 3/24/17.
 */
public class CalculatorMain {

    public static void main ( String[] args ) {
        int res;
        Scanner keyboard = new Scanner ( System.in );
        CalcOperationMethods obj = new CalcOperationMethods ( );

        do {

            System.out.print ( "Insert any number " );

            double n1 = keyboard.nextInt ( );

            System.out.print ( "Choose any operation:  '-' '+' '/' '*' " );

            String operation = keyboard.next ( );

            System.out.print ( "Insert number one more number " );

            double n2 = keyboard.nextInt ( );

            switch ( operation ) {

                case "+":

                    double s = obj.Sum ( n1, n2 );

                    System.out.println ( n1 + "+" + n2 + "=" + s );

                    break;

                case "-":

                    double d = obj.Del ( n1, n2 );

                    System.out.println ( n1 + "-" + n2 + "=" + d );

                    break;

                case "/":

                    double dv = obj.Div ( n1, n2 );

                    System.out.println ( n1 + "/" + n2 + "=" + dv );

                    break;

                case "*":

                    double m = obj.Mult ( n1, n2 );

                    System.out.println ( n1 + "*" + n2 + "=" + m );

                    break;

                default:

                    System.out.println ( "Incorrect operation character has been inserted! Try again." );

            }

            System.out.println ( "U want to continue? Click 1" );

            res = keyboard.nextInt ( );

        } while ( res == 1 );

    }

}
