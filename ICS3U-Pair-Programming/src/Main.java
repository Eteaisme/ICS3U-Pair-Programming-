import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Creating Objects
        */
        Random random = new Random();
        Game gameObject = new Game();

        while (gameObject.gameState == "Y") {

            /*Setting Answer to something random */
            gameObject.answer = Integer.toString(random.nextInt(9));
            System.out.println(gameObject.answer);

            /*First Guess */
            System.out.print("Type Back The Number: ");
            gameObject.guess = JOptionPane.showInputDialog(gameObject.answer,null);

            /*While loop */
            while (Integer.parseInt(gameObject.guess) == Integer.parseInt(gameObject.answer)) {

                //For loop
                for (int i = 0; i < gameObject.round; i++) {

                    //Create answer 2 and concatenate it 
                    gameObject.answer2 = Integer.toString(random.nextInt(9));
                    gameObject.answer = gameObject.answer + gameObject.answer2;
                }

                //Print answer and guess
                System.out.println(gameObject.answer);
                gameObject.guess = JOptionPane.showInputDialog(gameObject.answer ,null);

            }
            gameObject.gameState = JOptionPane.showInputDialog("Sorry wrong answer, would you like to play again? [Y/N]",null); 
            System.out.println(gameObject.gameState);
        }

    }
}