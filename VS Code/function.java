
/* 
   // void functions

import java.util.Scanner;
public class function{
    public static void main(String[] args){
        add();
    }
    static void add(){
        System.out.println("Enter first numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}

*/

/* 

//    return type functions

import java.util.Scanner;
public class function{
    public static void main(String[] args){
        int addition = add();
        System.out.println(addition);
    }
    static int add(){
        System.out.println("Enter first numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}

*/

//     returning a string

/* 
public class function{
    public static void main(String[] args) {
        String s = str();
        System.out.println(s);
    }

    static String str(){
        String str = "hwello";
        return str;
    }
}
*/

/* 


//        functions with parameters


//import java.util.Scanner;
public class function{
    public static void main(String[] args){
        int sum = add(2,3);
        System.out.println(sum);
    }
    static int add(int a, int b){
       int sum1 = a+b;
       return sum1;
    }
}

*/
/* 

//              swapping two numbers without functions

import java.util.Scanner;

public class function{
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swap: " + a + " " + b);

        int temp; 
        temp= a;
        a=b;
        b=temp;
        System.out.println("After Swap: " + a + " " + b);

    }
}

*/

/* 
//              swapping two numbers with functions

import java.util.Scanner;

public class function{
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swap: " + a + " " + b);
        swap(a, b);
        System.out.println("After Swap: " + a + " " + b);
        
    }
    static void swap(int a,int b){         // does not swap with this funct
        int temp;                          // since it is pass by value
        temp= a;
        a=b;
        b=temp;

    }
}

*/
/* 

//         Prime number

 import java.util.Scanner;

 public class function{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isprime(n);
    }

    static void isprime(int n){
        int m=n/2;
        int flag=0;
        if(n==0 || n==1){
            System.out.println("not a prime number");
        }
        else{
            
            for(int i=2;i<=m;i++){
                if(n%i == 0){
                    System.out.println("not a prime number:");
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }
 }

 */

 /* 

 //            armstrong number

 import java.util.Scanner;
 
 public class function{
    public static void main(String[] args) {
        //System.out.println("Enter a 3 digit number");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();  
        // armstrong(n);    
        for(int i=100;i<1000;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        } 
    }

    static boolean armstrong(int n){
        int original=n,sum=0,rem;
        while(n>0){
            
            rem = n%10;
            
            sum = sum+rem*rem*rem;

            n= n/10;
        }
        if(sum==original){
            return true;
        }
        
        else{
            return false;
        }
    }
   
 }
 */