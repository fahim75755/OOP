import java.util.*;
import java.io.*;
import java.math.*;



public class java6 {
public static void main(String []args){
    int mynumb= (int)(100*Math.random());
   Scanner sc=new Scanner (System.in); 
    int usernumb;
    do{
System.out.println("Guess my number(1-100) ");
usernumb =sc.nextInt();

if(usernumb==mynumb)
    System.out.println("WOOOHOOO---CORRECT");

else if(usernumb>mynumb)
    System.out.println("YOUR NUMBER IS TOO LARGER");

else System.out.println("YOUR NUMBER IS TOO SMALLER");


    } while(usernumb>0);

    System.out.println("My number was"+ mynumb);

}
}
