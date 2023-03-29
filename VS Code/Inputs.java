/* 
//             TAKING INPUTS FROM USER
import java.util.Scanner;
public class Inputs{
    public static void main(String[] args){

        // INPUT OF NUMBERS

        System.out.println("Enter 5 roll numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());

        // INPUT OF STRINGS

        System.out.println("Enter single word string: ");
        System.out.println(sc.next()); // Takes only single sentence

        System.out.println("Enter single multiple words string: ");
        System.out.println(sc.nextLine());  // Takes whole sentence
        System.out.println(sc.nextLine());  // Takes whole sentence

    }
}

*/


//         PRIMITIVE DATA TYPES (WHICH CANNOT BE BREAK INTO OTHER DATA TYPES)
/*
        int roll = 82;
        char letter = 'r';
        float marks =  98.5f;    // all decimal values are by default double;
        double largeDecimalNum = 453665.987;
        long largeInteger = 563226655;
        boolean check = true;  //consists of true or false;

 */


//                PROGRAM FOR SUM OF TWO NUMBERS

import java.util.Scanner;
public class Inputs{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Sum = " + (a + b) );
    }
}

 

/* 
//        TYPE CASTING( ADDING BIGGER DATA TYPE INTO SMALLER DATA TYPE)

        Examples:
        int num = (int)(57.987f); // converting float into int
*/