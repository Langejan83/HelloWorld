
import java.util.Random;

public class Game {

    int randomNumber;

    public Game(){


        Random rand = new Random();
        randomNumber = rand.nextInt(10)+1;
        System.out.println("randomNumber er: " + randomNumber);
    }

    //Methods

    public int getRandomNumber(){
        return randomNumber;}


}



