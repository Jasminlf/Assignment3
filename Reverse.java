import java.util.Scanner; //import the scanner library
public class Reverse { //name of the class
    public static void main(String[] args) { //The main is where the
program runs from
        Scanner myVar = new Scanner(System.in);// Waits for user to
input the variable
        System.out.println("Enter the number you wish to reverse:
");//Asks user for input
        int input = myVar.nextInt();// Assigns the user input to the variable
        reverse(input);// call the method from main
    }

    public static void reverse(int j) {//Naming the method being used
        int result = 0; //initializes result to equal zero to start
        int remainder; //initializes remainder, but it does not hold a value.
        while (j>0) {//the while loop is being
            remainder = j % 10;// the modulo terms the remainder into an integer
            j = j / 10; //divide j by 10
            result = result * 10 + remainder; // the result is then multiplied by 10 then added to the remainder
        System.out.println("this is j " + j + " this is remainder" + remainder + "this is result" + result );
        //i looked this up was trying to break down the formula so i could better understand how the numbers were reversed.


        } //end loop
        System.out.println("reversed number is " + result );// once the loop is done it prints the result

    } //end method

} //end class
