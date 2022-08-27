import java.util.Random;

public class Category {

//instance variables
private String[] category = {"a Thing", "an Event", "a Place"};
private String chosenCategory;
private int chosenCategoryNumber;


//Constructor
public Category(){

    int x = category.length;
        Random randomNumber = new Random();
        int n = randomNumber.nextInt(x);
        System.out.println("Print randomNumber: " + n);
        System.out.println(category[n]);
        chosenCategory = category[n];
        chosenCategoryNumber = n;
        System.out.println("chosenCategoryNumber " + chosenCategoryNumber);
        System.out.println(chosenCategory);
    }

//Methods
    public String getChosenCategory(){
    return chosenCategory;}

    public int getChosenCategoryNumber(){
    return chosenCategoryNumber;}

    }
















