public class Player {

    //Instans variables
    private int tries;

    //Constructor
    public Player(){
        tries = 0;
    }


    //Methods
    public void addTries(){
        tries++;
    }

    public int getTries(){
        return tries;
    }
}
