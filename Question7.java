import java.util.*;


public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get the table:");
        //intitalized variable in the input
        int num = sc.nextInt();
        //started for loop to get the value and increment it by one
        for(int i=1;i<=10;i++){
            // get the value of input and value of loop and multply it using  variable
            int mul = num * i;
            // Call the print function for printing the output
            System.out.println(num + "x" + i + "=" + mul);
        }
    }
}
