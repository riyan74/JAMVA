

///          ARRAYS

//  SYNTAX
/* 

   int[] rollno = new int[5];
   (or)
   int[] rollno = {1,2,3,4,5};

*/

/* 

import java.util.Scanner;
public class arrays{
    public static void main(String[] args) {
        // input
        int[] arr = new int[5];
        arr[0] = 27;
        arr[1] = 24;
        arr[2] = 23;
        arr[3] = 22;
        arr[4] = 12;
        
        System.out.println(arr[1]);
        System.out.println(arr[3]);

        // input using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");

        // for input

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // for output 

        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            System.out.print(arr[i] + " ");
        }

        // for output

        System.out.println(Arrays.toString(arr));

        // array of strings

        //input
        System.out.println("Enter strings input");
        String[] str = new String[5];
        for(int i=0; i< str.length; i++){
            str[i] = sc.next();
        }

        //output

        System.out.println(Arrays.toString(str));

        // modifiying existing string
        str[1] = "riyan";
        System.out.println(Arrays.toString(str));

    }
}

*/

//    changing value using function of array

import java.util.Arrays;
import java.util.Scanner;

public class arrays{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        changevale(arr);
        System.out.println(Arrays.toString(arr));
    }
 
    static void changevale(int[] arr){
        arr[0] = 82;
    }
}