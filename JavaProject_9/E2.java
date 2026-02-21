import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {
    public static void main(String []args){
        Scanner keyboard=new Scanner(System.in);
        int number =0;
        boolean done=false;

        while(!done){
            try {
                System.out.println("ENTER a whole number");
                number =keyboard.nextInt();
                done =true;    
                
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Incorrect. Try Again");
            }
        }
        System.out.println("You Entered "+ number);

    }
}