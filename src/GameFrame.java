import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {



    //instance variables
        private Game game;
        private Player player;
        private Category category;
        private Word word;



        private JTextField inputfield;
        private JLabel gameAnswer;
        private JLabel tries;
        private JLabel categoryLabel;
        private JLabel categoryNumberLabel;


//GameFrame
        public GameFrame(String title){
            super(title);
            getContentPane().setLayout(new FlowLayout());

            game = new Game();
            player = new Player();
            category = new Category();

            System.out.println(game.getRandomNumber());

            addComponents();

            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(300,300);
    }

//Methods
            private void addComponents(){
                inputfield = new JTextField(8);
                getContentPane().add(inputfield);

                gameAnswer = new JLabel("text");
                getContentPane().add(gameAnswer);

                JButton submitGuess = new JButton("Guess");
                submitGuess.addActionListener(this);
                getContentPane().add(submitGuess);

                tries = new JLabel("Guess a number between 1 - 10");
                getContentPane().add(tries);

                categoryLabel = new JLabel("Category is: " + category.getChosenCategory());
                getContentPane().add(categoryLabel);

                categoryNumberLabel = new JLabel("Category number is: " + category.getChosenCategoryNumber());
                getContentPane().add(categoryNumberLabel);

                word = new Word();

            }


            private void resetGame(){
                game = new Game();
                player = new Player();
                gameAnswer = new JLabel("text");
                tries.setText("Guess a number between 1 - 10");
            }



//hvad sker der når man klikker på knappen?
    @Override
    public void actionPerformed(ActionEvent e) {

            //Increment tries

            player.addTries();
            tries.setText("Used tries: " + player.getTries());

            //what did the user guessed
                String textEntered = inputfield.getText();
                int numberEntered = Integer.parseInt(textEntered);
                System.out.println("user entered " + textEntered);



//how was guess VS randomnumber and show result
        //Succes
                if (numberEntered == game.getRandomNumber()) {
                    gameAnswer.setText("Your guess was correct");
                    //show dialog box
                    JOptionPane.showMessageDialog(null,"Congratulations. You guessed the number in " + player.getTries() + " tries");
                    System.out.println("Your guess was correct");

                    //reset game
                        resetGame();
        //to high
                } else {
                    if (numberEntered > game.getRandomNumber()){
                        gameAnswer.setText("you guessed to high");
                        System.out.println("you guessed to high");
        //to low
                } else {
                        gameAnswer.setText("you guessed to low");
                        System.out.println("you guessed to low");
                        ;
                    }

                    }

                }

    }

