import java.util.Scanner;
import java.util.Random;

public class rps //rockpaperscissors

{
public static void main (String args[])
{
//Mark Newman Java Wedsndays 
import java.util.Random; 
import java.util.Scanner;

public class rps
{
    public static void main( String[] args)
    {
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int u; // User's Choice
        int c; // Computer's Choice
        Scanner input = new Scanner(System.in);//Object for getting input from keyboard
        Random rnd = new Random(); //Object for Generating Random Numbers
       
        System.out.println("Rock Paper Scissors! Enter 0 for rock, 1 for paper, or 2 for scissors");
        
        u = input.nextInt(); // user input
        
        c = rnd.nextInt(3); // Make a random number between 0 and 2 for the computer's choice.
        
        System.out.println("c = " + c + " u = " + u); //show inputs
        
        if ( u==c )
        {
            System.out.println("Tie Game!");
        }
        else if ( (u==rock && c==scissors) || (u==scissors && c==paper) || (u==paper && c== rock))
        {
            System.out.println("User Wins!");
        }
        else
        {
            System.out.println("Computer WIns!");
        }
    }
}
