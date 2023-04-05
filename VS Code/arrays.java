

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

/* 

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

*/

//  SYNTAX OF 2D ARRAY
/* 

   int[][] arr = new int[3][3];
   (or)
   int[][] arr = {
        {1,2,3};
        {4,5,6};
        {7,8,9};
   };

*/


/* 

import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        
         //  input in 2D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){             //   for(int row=0;row<arr.length;row++){     
            for(int j=0;j<arr[i].length;j++){      //      for(int column=0;j<arr[row].length;column++){
                arr[i][j]=sc.nextInt();            //         arr[row][column]=sc.nextInt();
            }                                      //      }
        }                                          //   }
    
         //  output in 2D array

        System.out.println("The matrix is ");
        for(int i=0;i<arr.length;i++){               
            for(int j=0;j<arr[i].length;j++){      
                System.out.print(arr[i][j] + " ");          
            }   
            System.out.println();                                   
        }     
                                         
    }
}

*/

/*
 
//      ArrayList(we can use when the size is not known)

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i< 5 ; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

    }
} 
*/
/* 
//           swap index values

import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(" Enter Index 1 to Swap:");
        int k = sc.nextInt();
        System.out.print(" Enter Index 2 to Swap:");
        int j = sc.nextInt();

        
        swap(arr,k,j);
        System.out.println(Arrays.toString(arr));
        
    }

    static void swap(int[] arr,int k,int j){
        int temp;
        temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }
}
*/

import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(max(arr));
        
        
    }

    static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}