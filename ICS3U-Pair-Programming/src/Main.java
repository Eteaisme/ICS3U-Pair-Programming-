import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("Test");

    Random random = new Random();
    
    int answer = 0; 
    int guess = 0;

    while (guess == answer){
    
        answer = random.nextInt(9);
        System.out.println(answer);
    
    }
    
}
}
