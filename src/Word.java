import java.util.Random;

public class Word {
    //instance variables
    private Category category;
    private String chosenCategoryName;
    private int chosenCategoryNumber;
    private String[] categoryArrayToChose;

    private String chosenWord;
    private String[] categoryOne = {"Beer", "Guitar", "Bottle"};
    private String[] categoryTwo = {"Party", "Footballmatch", "Bikerun"};
    private String[] categoryTree = {"Finland", "Denmark", "playground"};

    public Word() {
        System.out.println("chosenCategoryNumber" + category.getChosenCategoryNumber());
    }

    public String getChosenWord(){
        return chosenWord;
    }
}




/*if (chosenCategoryNumber == 1) {categoryArrayToChose = categoryOne;}
                    else if (chosenCategoryNumber == 2) {categoryArrayToChose = categoryTwo;}
                    else if (chosenCategoryNumber == 3) {categoryArrayToChose = categoryTree;}

        int x = categoryArrayToChose.length;
        Random randomNumber = new Random();
        int n = randomNumber.nextInt(x);
        System.out.println("dette er words array random number " + n);
        System.out.println(categoryArrayToChose[n]);
        chosenWord = categoryArrayToChose[n];

        System.out.println(chosenWord);*/