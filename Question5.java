import java.util.*;  

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intitalize first variable
        System.out.println("Enter the First number to get product:");
        int a = sc.nextInt();
        //intitalize second variable
        System.out.println("Enter the Second number to get product:");
        int b = sc.nextInt();
        //intialized input into the third variable to get the product of both variable
        int x = a * b ;
        System.out.println("Product of your number is:" + x);
    }
}
