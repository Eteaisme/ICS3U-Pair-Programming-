import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    /*
    Creating Objects
    */    
    Scanner Scan = new Scanner(System.in);
    Random random = new Random(); 
    Game gameObject = new Game();

    /*Setting Answer to something random */
    gameObject.answer = Integer.toString(random.nextInt(9));
    System.out.println(gameObject.answer);

    /*First Guess */
    System.out.print("Guess the number: ");
    gameObject.guess = Scan.nextLine();



/*While loop */
 while (gameObject.guess == gameObject.answer);{
    //While loop notification 
    System.out.println("Your in the while loop");

    //For loop
        for(int i = 0; i<gameObject.round; i++){

        //Create answer 2 and concatenate it 
        gameObject.answer2 = Integer.toString(random.nextInt(9));
        gameObject.answer = gameObject.answer + gameObject.answer2;
            }       

            //Print answer and guess
            System.out.println(gameObject.answer);
            System.out.print("Guees the number: ");
            gameObject.guess = Scan.nextLine();
            
            gameObject.round ++;

            if (gameObject.guess == gameObject.answer); 
            gameObject.guess = "";
            else
        }   
    }
}