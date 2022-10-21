import java.util.*;  

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initialized first int
        System.out.println("Enter First number");
        int a = sc.nextInt(); 
        //initialized second int
        System.out.println("Enter Second number");
        int b = sc.nextInt(); 
        //operations done on both of the opeartors
        //Sum
        int sum = a+b;
        //subtract
        int sub = a-b;
        //multiply
        int pro = a*b;
        //division
        int div = a/b;
        //modulo
        int mod = a%b;

        //printed all of the operations
        System.out.println("Sum of your number is:" + sum );
        System.out.println("Subtraction of your number is:" + sub );
        System.out.println("Product of your number is:" + pro );
        System.out.println("Division of your number is:" + div );
        System.out.println("Modulo of your number is:" + mod );

    }
}
