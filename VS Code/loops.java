/* 
public class loops{
    public static void main(String[] args){

        //      IF,ELSE STATEMENT

        int a=10;
        if(a==10 || a>0){
            System.out.println("Hello world");
        }
        else{
            System.out.println("Try Again");
        }
        
        //      WHILE LOOP

        int count=0;
        while(count !=5){
            System.out.println("h");
            count++;
        }

       //        For loop
        for( count = 1; count != 5; count++){
            System.out.println("Done");
        }

        //        do while(It executes for one time for sure)
            
        do {
            System.out.println("hello");
        }while(count<0);                     

    }
}

*/
/* 
//             Greatest of threee numbers
import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        System.out.println("Enter Three Numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

            if(a>b || a>c){
                System.out.println("First number i.e "+ a + " is Greatest");
            }
            else if(b>c){
                System.out.println("Second number i.e "+ b + " is Greatest");
            }
            else{
                System.out.println("Third number i.e "+ c + " is Greatest");
            }
             
    }
}
*/

/* 

            // upper case or lower case finder

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char a = input.next().trim().charAt(0);
        System.out.println("Entered char is " + a );
        if(a >= 'a' && a<+ 'z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }
    }
}

*/
/* 

    //        Repeatation of particular number in a sequence of numbers
import java.util.Scanner;

public class loops{
    public static void main(String[] args) {
        System.out.println("Enter sequence of numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count =0;
        while(n > 0){
            int rem=n%10;
            if(rem==7){
                count++;
            }   
            n=n/10;
        }
        System.out.println(count);        
    }
}
*/
/* 

            // reverse of a number

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
            

        }
        System.out.println("Reverse = " + ans);
        
    }
} 
*/
/* 

          // Calculator program using IF ELSE 
import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        
        System.out.println("Select Operation(character):");
        Scanner sc = new Scanner(System.in);
        double ans=0;
        while(true){
        System.out.println("1. '+'\t2. '-\t3. '*'\t4. '/'\t5. '%'\t6. 'x'(To Exit)");
        char n = sc.next().trim().charAt(0);
        if(n == '+' || n == '-' || n == '*' || n == '/' || n == '%'){
        System.out.println("Enter Two Numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
            if(n=='+'){
                ans=a+b;
            }
            if(n=='-'){
                ans=a-b;
            }
            if(n=='*'){
                ans=a*b;
            }
            if(n=='/'){
                if(b !=0){
                ans=a/b;
                }
            }
            if(n=='%'){
                ans=a%b;
            }
        }
        else if(n=='x'){
            break;
        }
        else{
            System.out.println("Invalid operator");
        }
        
            
        System.out.println(ans);
        }
        
    }
}
*/




